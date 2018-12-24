package com.ydm.jni.util;

import android.support.annotation.Nullable;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.ydm.jni.AppConstants;
import com.ydm.jni.BuildConfig;


/**
 * Description: Logger日志输出工具类
 * Data：2018/12/24-16:17
 * Author: DerMing_You
 */
public class LogUtils {

    /**
     * 在application调用初始化
     * @param debug  是否开启
     */
    public static void init(final boolean debug) {
        Logger.addLogAdapter(new AndroidLogAdapter() {
            @Override
            public boolean isLoggable(int priority, @Nullable String tag) {
                return debug;
            }
        });
    }

    public static void v(String message) {
        Logger.v(message);
    }

    public static void d(String message) {
        Logger.d(message);
    }

    public static void i(String message) {
        Logger.i(message);
    }

    public static void w(String message) {
        Logger.w(message);
    }

    public static void e(String message) {
        Logger.e(message);
    }

    public static void json(String json) {
        Logger.json(json);
    }
}
