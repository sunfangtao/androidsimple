package com.nevbg.simple.base;

import android.os.Bundle;

import com.nevbg.simple.common.MyApplication;

import cn.sft.base.activity.BaseParseHelperActivity;

/**
 * Created by Administrator on 2018/3/20.
 */

public class CustomBaseActivity extends BaseParseHelperActivity {

    protected MyApplication app;

    @Override
    protected void onCreate(Bundle bundle) {
        if (app == null) {
            app = MyApplication.getInstance();
        }
        super.onCreate(bundle);
    }

    @Override
    protected void afterRestoreInstanceState(Bundle bundle) {

    }
}
