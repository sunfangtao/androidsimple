package com.nevbg.simple.common

import cn.sft.base.application.BaseApplication
import cn.sft.crash.CrashHandler

/**
 * Created by Administrator on 2017/4/18.
 */

class MyApplication : BaseApplication() {

    override fun onCreate() {
        super.onCreate()
        if (INSTANCE == null) {
//            INSTANCE = BaseApplication.getInstance()
        }
        CrashHandler.init(this, true)
    }

    companion object {
        // getInstance()必须在onCreate()之后调用，否则为空值
        var INSTANCE: MyApplication? = null
    }
}
