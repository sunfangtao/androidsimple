package com.nevbg.simple.activity

import android.os.Bundle
import android.widget.ImageView

import cn.sft.base.activity.BaseParseHelperActivity
import cn.sft.util.Util

/**
 * 登录页面
 * 实现AutoLoginListener的类中返回LoginActivity.class进行关联绑定
 */
class LoginActivity : BaseParseHelperActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ImageView(this))
        Util.print("LoginActivity")

        foo(strings = *arrayOf("a", "b", "c"));
    }

    fun foo(vararg strings: String) {
        /* ... */
    }


    override fun afterRestoreInstanceState(savedInstanceState: Bundle) {

    }
}
