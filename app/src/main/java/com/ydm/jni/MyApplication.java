package com.ydm.jni;

import android.app.Application;

/**
 * Description:
 * Data：2018/12/24-16:05
 * Author: DerMing_You
 */
public class MyApplication extends Application {

    private static MyApplication instance;

    public static MyApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
    }
}
