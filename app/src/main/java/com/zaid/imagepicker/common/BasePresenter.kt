package com.zaid.imagepicker.common

interface BasePresenter<out V> {
    val view: V
    fun initialize()
}