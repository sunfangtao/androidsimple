package com.nevbg.simple.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import cn.sft.util.Util;

/**
 * APP主界面
 * 在WelcomeActivity中返回MainActivity.class进行关联绑定
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Util.print("MainActivity");
        super.onCreate(savedInstanceState);
    }
}