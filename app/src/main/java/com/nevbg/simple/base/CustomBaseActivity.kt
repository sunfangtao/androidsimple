package com.nevbg.simple.base

import com.wxt.library.base.activity.BaseParseHelperActivity

/**
 * Created by Administrator on 2018/3/20.
 */

open class CustomBaseActivity : BaseParseHelperActivity() {

    /**
     * 标题栏标题是否居中
     * return true:居中，false：左对齐
     */
    override fun isTitleCenter() = true

    /**
     * 标题栏下方是否有横线（1px）
     * return true:有，false：没有
     */
    override fun isShowDownLine() = false

    /**
     * 标题栏是否显示导航按钮
     * return true:有，false：没有
     */
    override fun isShowNavigationBtn() = true
}
