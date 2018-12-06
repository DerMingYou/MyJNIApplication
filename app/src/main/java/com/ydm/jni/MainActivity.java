package com.ydm.jni;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvContent;
    private TextView tvPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvContent = findViewById(R.id.tv_content);
        tvContent.setText(NDKHelper.getStringFormNDK());
        tvPhone = findViewById(R.id.tv_phone_number);
        tvPhone.setText(NDKHelper.getPhoneNumberString());
        tvPhone.setOnClickListener(v->{
            //拨打电话（直接拨打电话）需要在AndroidManifest文件里加上这个权限：<uses-permission android:name="android.permission.CALL_PHONE" />
//            Intent intent = new Intent(Intent.ACTION_CALL);
            //不需要申请权限，可以直接跳转到拨号界面
            Intent intent = new Intent(Intent.ACTION_DIAL);
            Uri data = Uri.parse("tel:" + NDKHelper.getStringFormNDK());
            intent.setData(data);
            startActivity(intent);
        });
    }
}
