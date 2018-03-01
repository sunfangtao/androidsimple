package com.nevbg.simple.activity;

import android.os.Bundle;

import cn.sft.base.activity.BaseWelcomeActivity;
import cn.sft.listener.AutoLoginListener;
import cn.sft.listener.GuideListener;
import cn.sft.listener.PauseListener;
import cn.sft.util.Util;

public class WelcomeActivity extends BaseWelcomeActivity implements GuideListener, AutoLoginListener, PauseListener {

    /**
     * 指定APP是否需要先登录
     *
     * @return true APP需要登录，否则需要登录的时候有APP自己处理登录，默认false
     */
    @Override
    public boolean isNeedLogin() {
        return true;
    }

    /**
     * 用户登录请求的密码参数
     *
     * @return
     */
    @Override
    protected String changePasswordParams() {
        return "password";
    }

    /**
     * 用户登录请求的用户名参数
     *
     * @return
     */
    @Override
    protected String changeUserNameParams() {
        return "username";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Util.print("WelcomeActivity");
        super.onCreate(savedInstanceState);
    }

    /**
     * APP 主页面
     *
     * @return
     */
    @Override
    protected Class setIndexActivity() {
        return MainActivity.class;
    }

    @Override
    protected void afterRestoreInstanceState(Bundle savedInstanceState) {

    }

    /**
     * APP 引导页面
     *
     * @return
     */
    @Override
    public Class setGuideActivity() {
        return GuideActivity.class;
    }

    /**
     * APP 登录页面
     *
     * @return
     */
    @Override
    public Class setLoginActivty() {
        return Login.class;
    }

    /**
     * APP 自动登录返回值
     * loginResult有父类自动管理，用通用解析；直接使用即可
     *
     * @return 大于0 登录成功，小于0 登录失败， 等于0 登录中
     */
    @Override
    public int autoLoginResult() {
        return loginResult;
    }

    /**
     * APP 自动登录用户名
     *
     * @return
     */
    @Override
    public String getLoginUsername() {
        return "test5";
    }

    /**
     * APP 自动登录密码
     *
     * @return
     */
    @Override
    public String getLoginPassword() {
        return "123456";
    }

    boolean isAutoJump = true;

    /**
     * 是否自动跳转 ，此方法会不断调用（用于欢迎页面自定义操作后再跳转）
     *
     * @return true 自动跳转， false 不跳转
     */
    @Override
    public boolean autoJump() {
        return isAutoJump;
    }
}
