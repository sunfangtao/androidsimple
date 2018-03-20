package com.nevbg.simple.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.nevbg.simple.R;
import com.nevbg.simple.base.CustomBaseActivity;

import cn.sft.util.Util;

/**
 * APP主界面
 * 在WelcomeActivity中返回MainActivity.class进行关联绑定
 */
public class MainActivity extends CustomBaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Util.print("MainActivity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected boolean isTitleCenter() {
        return true;
    }
}