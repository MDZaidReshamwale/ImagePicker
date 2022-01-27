package com.zaid.imagepicker.presenter

import com.zaid.imagepicker.common.BasePresenter
import com.zaid.imagepicker.common.BaseView
import com.zaid.imagepicker.view.HomeView


class HomePresenter(override val view: HomeView) : BasePresenter<BaseView> {
    override fun initialize() {
    }

    fun getPhotoFromGallery() = view.openGallery()

    fun aboutDeveloper() = view.showAboutDeveloperDialog()

    fun aboutApp() = view.showAboutAppDialog()

    fun launchPhotoDetailActivity(pathFile: String?) = view.launchPhotoDetailActivity(pathFile)
}