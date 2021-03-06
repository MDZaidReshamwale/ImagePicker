package com.zaid.imagepicker.view

import android.net.Uri
import com.zaid.imagepicker.common.BaseView
import com.zaid.imagepicker.domain.ExifTagsContainer


interface PhotoDetailView : BaseView {
    fun setImage(fileName: String, fileSize: String, imageUri: Uri)
    fun setExifDataList(list: List<ExifTagsContainer>)
    fun showAddressOnRecyclerViewItem(address: String)
    fun hideAddressOnRecyclerViewItem()
    fun showProgressDialog()
    fun hideProgressDialog()
    fun changeExifDataList(list: List<ExifTagsContainer>)
    fun showAlertDialogWhenItemIsPressed(item: ExifTagsContainer)
    fun copyDataToClipboard(item: ExifTagsContainer)
    fun openDialogMap(latitude: Double?, longitude: Double?)
    fun showDialogEditDate(year: Int, month: Int, day: Int)
    fun shareData(data: String)
    fun onCompleteLocationChanged()
    fun onCompleteDateChanged()
    fun onSuccessTagsDeleted(message: String)
    fun onError(message: String)
}