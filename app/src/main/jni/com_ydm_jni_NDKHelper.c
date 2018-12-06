//
// Created by youdm on 2018/12/6.
//

#include <jni.h>
#include <com_ydm_jni_NDKHelper.h>

JNIEXPORT jstring JNICALL Java_com_ydm_jni_NDKHelper_getStringFormNDK
        (JNIEnv *env, jobject obj){
    return (*env)->NewStringUTF(env, "this is from jni String");
}

JNIEXPORT jstring JNICALL Java_com_ydm_jni_NDKHelper_getPhoneNumberString
        (JNIEnv *env, jobject obj){
    return (*env)->NewStringUTF(env, "15396670170");
}