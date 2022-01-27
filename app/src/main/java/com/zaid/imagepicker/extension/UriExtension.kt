package com.zaid.imagepicker.extension

import android.content.Context
import android.net.Uri
import android.provider.MediaStore


fun Uri.getPathFromUri(context: Context): String? {
    var filePath: String? = null
    val contentResolver = context.contentResolver

    val proj = arrayOf(MediaStore.Images.Media.DATA)
    val cursor = contentResolver.query(this, proj, null, null, null)
    if (cursor!!.moveToFirst()) {
        val column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA)
        filePath = cursor.getString(column_index)
    }
    cursor.close()

    return filePath
}
