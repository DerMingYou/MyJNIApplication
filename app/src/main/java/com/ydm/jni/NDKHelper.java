package com.ydm.jni;

import java.io.FileDescriptor;

/**
 * Description:
 * Data：2018/11/26-15:45
 * Author: DerMing_You
 */
public class NDKHelper {

    static {
        System.loadLibrary("sample_ndk");
    }

    public static native String getStringFormNDK();

    public static native String getPhoneNumberString();
}
