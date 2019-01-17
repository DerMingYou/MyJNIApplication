package com.ydm.jni.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.ydm.jni.AppConstants;
import com.ydm.jni.R;
import com.ydm.jni.base.BaseActivity;
import com.ydm.jni.util.AesUtil;
import com.ydm.jni.util.Des3Util;
import com.ydm.jni.util.MD5Util;

/**
 * Description: 加密解密界面
 * Data：2019/1/14-14:34
 * Author: DerMing_You
 */
public class EncryptionDecodeActivity extends BaseActivity {
//    @BindView(R.id.textView)
//    TextView textView;
//    @BindView(R.id.editText)
//    EditText editText;
//    @BindView(R.id.tvEncryption)
//    TextView tvEncryption;
//    @BindView(R.id.tvDecode)
//    TextView tvDecode;

    @Override
    public int bindLayout() {
        return R.layout.activity_encryption_decode;
    }

    @Override
    public void initView(Bundle savedInstanceState, View contentView) {

    }

    @Override
    public void initData() {
        new Handler().postDelayed(() -> {

        }, 1000);
    }

//    @OnClick({R.id.btnMD5, R.id.btnAes, R.id.btnDES, R.id.btnRSA})
//    public void onViewClicked(View view) {
//        String raw = editText.getText().toString();
//        switch (view.getId()) {
//            case R.id.btnMD5:
//                String enStr1 = MD5Util.encrypBy(raw);
//                tvEncryption.setText("MD5的加密结果是:" + enStr1);
//                break;
//            case R.id.btnAes:
//                String enStr2 = MD5Util.encrypBy(raw);
//                tvEncryption.setText("RSA加密结果是:" + enStr2);
//                break;
//            case R.id.btnDES:
//                try {
//                    String seed = "a";
//                    String enStr3 = AesUtil.encrypt(seed, raw);
//                    String deStr = AesUtil.decrypt(seed, enStr3);
//                    String desc = String.format("AES加密结果是:%s\nAES解密结果是:%s", enStr3, deStr);
//                    tvEncryption.setText("RSA加密结果是:" + desc);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                    tvEncryption.setText("AES加密/解密失败");
//                }
//
//                break;
//            case R.id.btnRSA:
//                String key = "a";
//                String enStr = Des3Util.encrypt(key, raw);
//                String deStr = Des3Util.decrypt(key, enStr);
//                String desc = String.format("3DES加密结果是:%s\n3DES解密结果是:%s", enStr, new String(deStr));
//                tvEncryption.setText(desc);
//                break;
//        }
//    }
}
