package com.nevbg.simple.activity

import cn.sft.base.activity.BaseWelcomeActivity
import cn.sft.listener.AutoLoginListener
import cn.sft.listener.GuideListener
import cn.sft.listener.PauseListener
import cn.sft.listener.PermissionListener

/**
 * 欢迎界面
 * GuideListener 用于增加引导页功能，需要与相应BaseGuideActivity配合使用
 * AutoLoginListener 用户已登录用户的自动登录功能
 * PauseListener 用户可在欢迎界面暂停跳转，待完成自定义逻辑后在跳转
 * PermissionListener 用户可在欢迎界面直接申请权限
 */
class WelcomeActivity : BaseWelcomeActivity(), GuideListener, AutoLoginListener, PauseListener, PermissionListener {

    var isAutoJump = true

    /**
     * 指定APP是否需要先登录
     *
     * @return true APP需要登录，否则需要登录的时候有APP自己处理登录，默认false
     */
    override fun isNeedLogin() = true

    /**
     * 用户登录请求的密码参数
     *
     * @return
     */
    override fun changePasswordParams() = "password"

    /**
     * 用户登录请求的用户名参数
     *
     * @return
     */
    override fun changeUserNameParams() = "username"

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
    public override fun setLoginActivty() = LoginActivity::class.java

    /**
     * APP 自动登录返回值
     * loginResult有父类自动管理，用通用解析；直接使用即可
     *
     * @return 大于0 登录成功，小于0 登录失败， 等于0 登录中
     */
    override fun autoLoginResult() = loginResult

    /**
     * APP 自动登录用户名
     *
     * @return
     */
    override fun getLoginUsername() = "admin"

    /**
     * APP 自动登录密码
     *
     * @return
     */
    override fun getLoginPassword() = "admin"

    /**
     * 是否自动跳转 ，此方法会不断调用（用于欢迎页面自定义操作后再跳转）
     *
     * @return true 自动跳转， false 不跳转
     */
    override fun autoJump() = isAutoJump

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