package com.nevbg.simple.activity

import android.view.LayoutInflater
import android.view.View
import com.wxt.library.base.activity.BaseGuideActivity
import java.util.*

/**
 * 引导页
 * 必须继承BaseGuideActivity
 * 需要实现setGuideViews，用于返回引导页面显示的数据 List大小就是页面个数(v2.0.0 及之前返回null或大小为0，将停留此页面；v2.0.1之后抛出异常)
 * 完成引导功能后，需要调用closeGuide(boolean)方法，否则将认为下次仍然需要引导
 *
 * protected final void closeGuide(boolean var1) {
 *     // 参数：true  表示直接跳转登录页面
 *             false 表示意向跳转主页面，是否跳转依赖启动页面中是否需要登录的配置
 * }
 *
 * 当页面切换时回调onGuidePageSelected(position),请做相应的业务逻辑（比如最后一页显示“立即体验”按钮）
 *
 * 如果需要扩充引导页面
 * 启动页面实现GuideListener的类中返回GuideActivity.class进行关联绑定
 */
class GuideActivity : BaseGuideActivity() {

    override fun setGuideViews(inflater: LayoutInflater): List<View> {

        closeGuide(false)

        val list = ArrayList<View>()
        list.add(View(this))
        return list
    }

    /**
     * 引导页面切换回调
     * @param position 页面下标 从 0 开始
     */
    override fun onGuidePageSelected(position: Int) {

    }
}
