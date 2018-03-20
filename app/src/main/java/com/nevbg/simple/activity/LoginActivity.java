package com.nevbg.simple.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.nevbg.simple.common.MyApplication;

import cn.sft.base.activity.BaseParseHelperActivity;
import cn.sft.util.Util;

/**
 * 登录页面
 * 实现AutoLoginListener的类中返回LoginActivity.class进行关联绑定
 */
public class LoginActivity extends BaseParseHelperActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new ImageView(this));
        Util.print("LoginActivity");
    }

    @Override
    protected void afterRestoreInstanceState(Bundle savedInstanceState) {

    }
}
