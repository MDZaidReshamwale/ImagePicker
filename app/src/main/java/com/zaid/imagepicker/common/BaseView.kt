package com.zaid.imagepicker.common

import android.content.Context

interface BaseView {
    fun destroy()
    fun getContext(): Context
}