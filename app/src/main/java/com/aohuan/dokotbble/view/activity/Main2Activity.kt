package com.aohuan.dokotbble.view

import android.os.Bundle
import com.aohuan.dokotbble.R
import com.aohuan.dokotbble.view.BaseActivity
import org.greenrobot.eventbus.EventBus


class Main2Activity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        EventBus.getDefault().register(this)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onDestroy() {
        super.onDestroy()
        EventBus.getDefault().unregister(this)
    }

}
