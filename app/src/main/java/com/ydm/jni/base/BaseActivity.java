package com.ydm.jni.base;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;


/**
 * Description：
 * Author：DerMing_You
 * Email：udeming1573@163.com
 * Date：2018/12/10  21:31
 */
public abstract class BaseActivity extends AppCompatActivity {

    public Activity mContext;

    protected View mContentView;
//    private Unbinder mUnbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mContext = this;

        setBaseView(bindLayout());

        initView(savedInstanceState, mContentView);

        initData();
    }

    public abstract int bindLayout();

    public abstract void initView(final Bundle savedInstanceState, final View contentView);

    public abstract void initData();

    @SuppressLint("ResourceType")
    protected void setBaseView(@LayoutRes int layoutId) {
        if (layoutId <= 0) return;
        setContentView(mContentView = LayoutInflater.from(this).inflate(layoutId, null));
//        mUnbinder = ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        mUnbinder.unbind();
    }
}
