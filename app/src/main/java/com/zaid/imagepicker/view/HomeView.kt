package com.zaid.imagepicker.view

import com.zaid.imagepicker.common.BaseView

interface HomeView : BaseView {
    fun openGallery()
    fun showAboutDeveloperDialog()
    fun showAboutAppDialog()
    fun launchPhotoDetailActivity(pathFile: String?)
}