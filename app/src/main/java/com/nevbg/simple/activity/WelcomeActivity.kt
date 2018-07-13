package com.nevbg.simple.activity

import com.nevbg.simple.bean.User
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
 *
 * 自动集成了更新功能，（需要自动登录接着自动登录），之后跳转页面
 */
class WelcomeActivity : BaseWelcomeActivity(), GuideListener, AutoLoginListener<User>, PermissionListener {


    private var isAutoJump = true

    /**
     * 用户授权后或者不申请权限调用（更新功能完成后调用）
     * 此方法不要做界面耗时操作；可能发生页面已经销毁，耗时操作没有完成
     * 如需做耗时操作，先将 isAutoJump 设置成 false ，禁止页面跳转 或者做其他处理（如：使用 isFinishing 加判断页面是否关闭）
     *
     * @return 无
     */
    override fun afterPermission() {
    }

    /**
     * 指定APP是否需要先登录
     *
     * @return true APP需要登录，否则需要登录的时候由APP自己处理登录，默认false
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
     * @return true 自动跳转; false 不跳转，true后再跳转
     */
    override fun autoJump() = isAutoJump

    /**
     * APP自动登录返回
     * @param isSuccess 登录结果：true成功，否则false（包括无法自动登录等情况）
     * @param jsonObject 登录返回的json对象
     * @param user 登录返回json对象的解析结果（需要在AutoLoginListener中指定类型，否则不解析）;登录失败为空
     * @param message 登录的提示（成功为null）
     */
    override fun parseLogin(isSuccess: Boolean, jsonObject: JSONObject?, user: User?, message: String?) {
        Util.print("user=" + user)
    }

    /**
     * 获取的权限列表，相关的值从PermissionRequestUtil中获取
     *
     * @return 对应权限的列表；不申请返回null
     */
    override fun getPermissionList(): List<Int>? {
        // PermissionRequestUtil.CALL_PHONE
        return null
    }

    /**
     * 获取权限失败后，给用户的提示,需要与获取权限列表个数相同
     *
     * @return 对应权限的相关提示；不申请返回null
     */
    override fun getPermissionReason(): List<String>? {
        return null
    }

    /**
     * 获取权限的次数，达到指定次数后仍然没有获取到权限将结束申请，将直接关闭APP；
     * 暂不支持用户自定义后续操作
     *
     * @return
     */
    override fun getObtainCount() = 1
}