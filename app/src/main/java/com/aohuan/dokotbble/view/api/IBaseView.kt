package com.twobbble.view.api

import org.jetbrains.annotations.NotNull

/**
 * Created by liuzipeng on 2017/2/22.
 */
interface IBaseView {
    fun showProgress() {}

    fun hideProgress() {}

    fun showProgressDialog(msg: String? = null) {}

    fun hideProgressDialog() {}
}