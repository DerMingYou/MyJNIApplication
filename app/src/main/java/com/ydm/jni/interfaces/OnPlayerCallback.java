package com.ydm.jni.interfaces;

import android.media.MediaPlayer;

/**
 * Description: 视频操作回调，将系统MediaPlayer的常见回调封装
 * Data：2018/12/6-15:54
 * Author: DerMing_You
 */
public interface OnPlayerCallback {

    /**
     * 准备好
     */
    void onPrepared(MediaPlayer mp);

    /**
     * 视频size变化
     */
    void onVideoSizeChanged(MediaPlayer mp, int width, int height);

    /**
     * 缓存更新变化
     *
     * @param percent 缓冲百分比
     */
    void onBufferingUpdate(MediaPlayer mp, int percent);

    /**
     * 播放完成
     */
    void onCompletion(MediaPlayer mp);

    /**
     * 视频错误
     * @param what  错误类型
     * @param extra 特殊错误码
     */
    void onError(MediaPlayer mp, int what, int extra);

    /**
     * 视频加载状态变化
     *
     * @param isShow 是否显示loading
     */
    void onLoadingChanged(boolean isShow);

    /**
     * 视频状态变化
     */
    void onStateChanged(int curState);
}
