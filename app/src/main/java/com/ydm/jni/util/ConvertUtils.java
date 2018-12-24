package com.ydm.jni.util;

import android.text.TextUtils;

/**
 * Description: String类型转换为float、double和int的工具类
 * Data：2018/12/17-17:38
 * Author: DerMing_You
 */

public class ConvertUtils {
    /**
     * 把String转化为float
     * @param number
     * @param defaultValue
     * @return
     */
    public static float convertToFloat(String number, float defaultValue) {
        if (TextUtils.isEmpty(number)) {
            return defaultValue;
        }
        try {
            return Float.parseFloat(number);
        } catch (Exception e) {
            return defaultValue;
        }

    }

    /**
     * 把String转化为double
     *
     * @param number
     * @param defaultValue
     * @return
     */
    public static double convertToDouble(String number, double defaultValue) {
        if (TextUtils.isEmpty(number)) {
            return defaultValue;
        }
        try {
            return Double.parseDouble(number);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    /**
     * 把String转化为int
     * @param number
     * @param defaultValue
     * @return
     */
    public static int convertToInt(String number, int defaultValue) {
        if (TextUtils.isEmpty(number)) {
            return defaultValue;
        }
        try {
            return Integer.parseInt(number);
        } catch (Exception e) {
            return defaultValue;
        }
    }
}
