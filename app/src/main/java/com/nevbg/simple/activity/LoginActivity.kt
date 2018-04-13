package com.nevbg.simple.activity

import android.os.Bundle
import android.widget.ImageView
import com.nevbg.simple.bean.User
import com.wxt.library.base.activity.BaseLoginActivity
import com.wxt.library.util.Util
import org.json.JSONObject

/**
 * 登录页面
 * 实现AutoLoginListener的类中返回LoginActivity.class进行关联绑定
 */
class LoginActivity : BaseLoginActivity<User>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ImageView(this))
        Util.print("LoginActivity")

        login("admin", "admin")
    }

    override fun onHttpSuccess(type: String?, jsonObject: JSONObject?, obj: Any?) {
        Util.print("登录成功！" + obj)
    }
}
