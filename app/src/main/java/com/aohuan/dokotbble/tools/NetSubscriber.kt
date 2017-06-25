package com.aohuan.dokotbble.tools

import com.aohuan.dokotbble.R
import com.aohuan.dokotbble.application.App
import com.twobbble.view.api.IBaseView
import rx.Subscriber


/**
 * Created by liuzipeng on 2017/2/20.
 */
abstract class NetSubscriber<T>(val baseView: IBaseView? = null) : Subscriber<T>() {
    override fun onStart() {
        super.onStart()
        if (!Utils.isNetworkAvailable(App.instance)) {
            baseView?.hideProgress()
            onFailed(App.instance.resources.getString(R.string.net_disable))
            unsubscribe()
        } else {
            baseView?.showProgress()
        }
    }

    override fun onCompleted() {
        baseView?.hideProgress()
    }

    override fun onError(t: Throwable?) {
        baseView?.hideProgress()
        t?.printStackTrace()
        onFailed(t?.message.toString())
    }

    abstract fun onFailed(msg: String)
}