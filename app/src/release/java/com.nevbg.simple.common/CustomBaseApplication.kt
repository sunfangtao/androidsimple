package com.nevbg.simple.common

import com.wxt.library.base.application.BaseApplication
import com.wxt.library.crash.CrashHandler

/**
 * Created by Administrator on 2018/7/13.
 */

open class CustomBaseApplication : BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        CrashHandler.init(this, true)
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}
