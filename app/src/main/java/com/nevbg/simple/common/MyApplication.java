package com.nevbg.simple.common;

import cn.sft.base.application.BaseApplication;
import cn.sft.crash.CrashHandler;

/**
 * Created by Administrator on 2017/4/18.
 */

public class MyApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.init(this, true);
    }
}
