package com.ydm.jni.util;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.util.Log;

import java.util.Locale;

/**
 * Description: 获取系统首选语言
 * Data：2018/12/10-14:10
 * Author: DerMing_You
 */
public class GetSysPreferredLocaleUtils {

    public Locale getSysPreferredLocale(Context context) {
        Locale locale;
        //7.0以下直接获取系统默认语言
        if (Build.VERSION.SDK_INT < 24) {
            // 等同于context.getResources().getConfiguration().locale;
            locale = Locale.getDefault();
            // 7.0以上获取系统首选语言
        } else {
            LocaleList defaultLocaleList = LocaleList.getDefault();
            StringBuffer sb0 = new StringBuffer();
            for (int i = 0; i < defaultLocaleList.size(); i++) {
                sb0.append(defaultLocaleList.get(i));
                sb0.append(",");
            }
            Log.d("jackie", "LocaleList.getDefault()        : " + sb0.toString());

            LocaleList list = context.getResources().getConfiguration().getLocales();
            StringBuffer sb1 = new StringBuffer();
            for (int i = 0; i < list.size(); i++) {
                sb1.append(list.get(i));
                sb1.append(",");
            }
            Log.d("jackie", "Configuration.getLocales()     : " + sb1.toString());

            LocaleList adjustedDefaultLocaleList = LocaleList.getAdjustedDefault();
            StringBuffer sb2 = new StringBuffer();
            for (int i = 0; i < adjustedDefaultLocaleList.size(); i++) {
                sb2.append(adjustedDefaultLocaleList.get(i));
                sb2.append(",");
            }
            Log.d("jackie", "LocaleList.getAdjustedDefault(): " + sb2.toString());

            locale = defaultLocaleList.get(0);
        }
        return locale;
    }
}
