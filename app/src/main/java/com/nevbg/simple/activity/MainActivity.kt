package com.nevbg.simple.activity

import android.os.Bundle
import cn.sft.util.Util
import com.nevbg.simple.R
import com.nevbg.simple.base.CustomBaseActivity

/**
 * APP主界面
 * 在WelcomeActivity中返回MainActivity.class进行关联绑定
 */
class MainActivity : CustomBaseActivity() {

    val ints = arrayOf(0, 1, 2, 3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Util.print(MyApplication.INSTANCE?.getParam(Any::class.java, ""))


        foo()
    }

    fun foo() {
        ints.forEach {
            if (it == 0) return@forEach
            Util.print(it)
        }
    }
}