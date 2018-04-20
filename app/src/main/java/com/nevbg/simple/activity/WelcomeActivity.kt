package com.nevbg.simple.activity

import com.wxt.library.base.activity.BaseWelcomeActivity
import com.wxt.library.listener.AutoLoginListener
import com.wxt.library.listener.GuideListener
import com.wxt.library.listener.PermissionListener
import com.wxt.library.util.Util
import org.json.JSONObject

/**
 * 欢迎界面
 * GuideListener 用于增加引导页功能，需要与相应BaseGuideActivity配合使用，只在BaseWelcomeActivity中生效
 * AutoLoginListener 用户已登录用户的自动登录功能，只在BaseWelcomeActivity中生效
 * PermissionListener 用户可在欢迎界面直接申请权限，只在BaseWelcomeActivity中生效
 */
class WelcomeActivity : BaseWelcomeActivity(), GuideListener, AutoLoginListener<Any>, PermissionListener {

    private var isAutoJump = true

    /**
     * 指定APP是否需要先登录
     *
     * @return true APP需要登录，否则需要登录的时候有APP自己处理登录，默认false
     */
    override fun isNeedLogin() = true

    /**
     * APP 主页面
     *
     * @return
     */
    override fun setIndexActivity() = MainActivity::class.java

    /**
     * APP 引导页面
     *
     * @return
     */
    override fun setGuideActivity() = GuideActivity::class.java

    /**
     * APP 登录页面
     *
     * @return
     */
    public override fun setLoginActivity() = LoginActivity::class.java

    /**
     * 是否自动跳转 ，此方法会不断调用（用于欢迎页面自定义操作后再跳转）
     *
     * @return true 自动跳转， false 不跳转;true后再跳转
     */
    override fun autoJump() = isAutoJump

    /**
     * APP自动登录返回
     * @param isSuccess 登录结果：true成功，否则false（包括无法自动登录等情况）
     * @param jsonObject 登录返回的json对象
     * @param user 登录返回json对象的解析结果（需要在AutoLoginListener中指定类型，否则不解析）;登录失败为空
     * @param message 登录的提示（成功为null）
     */
    override fun parseLogin(isSuccess: Boolean, jsonObject: JSONObject?, user: Any?, message: String?) {
        Util.print("user=" + user)
    }

    /**
     * 获取的权限列表，相关的值从PermissionRequestUtil中获取
     *
     * @return
     */
    override fun getPermissionList(): List<Int>? {
        // PermissionRequestUtil.CALL_PHONE
        return null
    }

    /**
     * 获取权限失败后，给用户的提示,需要与获取权限列表个数相同
     *
     * @return
     */
    override fun getPermissionReason(): List<String>? {
        return null
    }

    /**
     * 获取权限的次数，达到指定次数后仍然没有获取到权限将结束申请，由用户处理后续操作
     *
     * @return
     */
    override fun getObtainCount() = 1
}