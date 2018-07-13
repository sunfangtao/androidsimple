package com.nevbg.simple.activity

import android.os.Bundle
import com.nevbg.simple.R
import com.nevbg.simple.base.CustomBaseActivity
import com.wxt.library.util.Util

/**
 * APP主界面
 * 在WelcomeActivity中返回MainActivity.class进行关联绑定
 */
class MainActivity : CustomBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Util.print("MainActivity")
    }

}