package com.nevbg.simple.activity;

import android.os.Bundle;
import android.widget.ImageView;

import cn.sft.base.activity.BaseParseHelperActivity;
import cn.sft.util.Util;

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
