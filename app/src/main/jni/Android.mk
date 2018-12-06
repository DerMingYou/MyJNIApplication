LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := sample_ndk
LOCAL_SRC_FILES := com_ydm_jni_NDKHelper.c

include $(BUILD_SHARED_LIBRARY)