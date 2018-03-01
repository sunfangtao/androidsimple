package com.nevbg.simple.activity

import android.os.Bundle
import android.widget.ImageView
import cn.sft.base.activity.BaseParseHelperActivity
import cn.sft.util.Util

/**
 * Created by Administrator on 2018/2/26.
 */
class Login : BaseParseHelperActivity() {

    override fun afterRestoreInstanceState(p0: Bundle?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(p0: Bundle?) {
        super.onCreate(p0)
        setContentView(ImageView(this))
        Util.print("LoginActivity")
    }

}