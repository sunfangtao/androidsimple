package com.nevbg.simple.common

import com.wxt.library.base.application.BaseApplication

/**
 * Created by Administrator on 2017/4/18.
 */

class MyApplication : CustomBaseApplication() {

    override fun onCreate() {
        super.onCreate()
        if (INSTANCE == null) {
            INSTANCE = BaseApplication.getInstance()
        }
        // TODO 极光推送初始化，需要实开启
//        JPushInterface.init(this)
    }

    companion object {
        // getInstance()必须在onCreate()之后调用，否则为空值
        var INSTANCE: MyApplication? = null
    }

}
