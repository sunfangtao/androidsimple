package com.nevbg.simple.base

import cn.sft.base.activity.BaseParseHelperActivity

/**
 * Created by Administrator on 2018/3/20.
 */

open class CustomBaseActivity : BaseParseHelperActivity() {

    /**
     * 标题栏标题是否居中
     * return true:居中，false：左对齐
     */
    override fun isTitleCenter() = true

}
