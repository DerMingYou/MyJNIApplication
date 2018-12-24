package com.ydm.jni.util;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.widget.TextView;

import java.text.DecimalFormat;

/**
 * Description:
 * Data：2018/12/24-15:47
 * Author: DerMing_You
 */
public class CommonUtils {

    /**
     * 获取颜色
     *
     * @param context
     * @param id
     */
    public static int getColor(Context context, int id) {
        int color = ContextCompat.getColor(context, id);
        return color;
    }

    /**
     * 获取图片
     *
     * @param context
     * @param id
     */
    public static Drawable getDrawable(Context context, int id) {
        Drawable drawable = ContextCompat.getDrawable(context, id);
        return drawable;
    }

    /**
     * 保留两位小数
     */
    public static String format(String price) {
        double temp = 0;
        if (!TextUtils.isEmpty(price)) {
            try {
                temp = Double.valueOf(price);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return getPriceString(temp);
    }

    /**
     * 获取价格字符串
     */
    public static String getPriceString(double price) {

        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(price).toString();
    }

    /**
     * 拨打电话（跳转到拨号界面，用户手动点击拨打）
     *
     * @param phoneNum 电话号码
     */
    public static void callPhone(Context context, String phoneNum) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        Uri data = Uri.parse("tel:" + phoneNum);
        intent.setData(data);
        context.startActivity(intent);
    }

    /**
     * 发送短信(调起发短信页面)
     * @param context
     * @param phoneNum
     */
    public static void sendMessage(Context context, String phoneNum) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        Uri data = Uri.parse("smsto:" + phoneNum);
        intent.setData(data);
        context.startActivity(intent);
    }

    /**
     * 设置TextView 左侧文本图标
     * @param context
     * @param tv
     * @param id
     */
    public static void setDrawableLeft(Context context, TextView tv, int id) {
        if (id != 0) {
            Drawable drawableBoy = CommonUtils.getDrawable(context, id);
            drawableBoy.setBounds(0, 0, drawableBoy.getMinimumWidth(), drawableBoy.getMinimumHeight());//这句一定要加
            tv.setCompoundDrawablesWithIntrinsicBounds(drawableBoy, null, null, null);
        } else {
            tv.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        }
    }

    /**
     * 设置TextView 右侧文本图标
     * @param context
     * @param tv
     * @param id
     */
    public static void setDrawableRight(Context context, TextView tv, int id) {
        if (id != 0) {
            Drawable drawableBoy = CommonUtils.getDrawable(context, id);
            drawableBoy.setBounds(0, 0, drawableBoy.getMinimumWidth(), drawableBoy.getMinimumHeight());//这句一定要加
            tv.setCompoundDrawablesWithIntrinsicBounds(null, null, drawableBoy, null);
        } else {
            tv.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        }
    }
}
