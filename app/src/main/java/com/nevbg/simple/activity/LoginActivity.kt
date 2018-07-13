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
 * 点击登录调用login（username，password，url）或login（username，password）即可
 *
 * protected final void login(final String username, final String password, final String url) {
 *      username:登录的用户名
 *      username:登录的密码
 *      username:登录的地址；如果没有将使用默认地址
 * }
 *
 * 如果是临时需要登录，则相应的页面需要实现 LoginListener
 *
 * protected String changeUserNameParams() 可修改默认的用户名 key
 * protected String changePasswordParams() 可修改默认的密码   key
 *
 */
class LoginActivity : BaseLoginActivity<User>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ImageView(this))
        Util.print("LoginActivity")

        login("admin", "admin")
    }

    /**
     * 登录成功后，是否跳转主界面（主界面：启动页面中指定）
     *
     * @return true 跳转； false 不跳转
     */
    override fun autoJumpIndex() = true

    override fun onHttpSuccess(type: String?, jsonObject: JSONObject?, obj: Any?) {
        Util.print("登录成功！" + obj)
    }
}
