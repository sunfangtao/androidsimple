package com.nevbg.simple.common

import android.content.Context
import android.support.multidex.MultiDex
import com.wxt.library.base.application.BaseApplication
import com.wxt.library.crash.CrashHandler

/**
 * Created by Administrator on 2017/4/18.
 */

class MyApplication : CustomBaseApplication() {

    override fun onCreate() {
        super.onCreate()
        if (INSTANCE == null) {
            INSTANCE = BaseApplication.getInstance()
        }
    }

    companion object {
        // getInstance()必须在onCreate()之后调用，否则为空值
        var INSTANCE: MyApplication? = null
    }

}
