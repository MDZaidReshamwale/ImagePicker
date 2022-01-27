package com.zaid.imagepicker.extension

import androidx.annotation.StringRes
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar


fun CoordinatorLayout.showSnackbar(@StringRes text: Int) {
    val snackbar = Snackbar.make(this, context.getText(text), Snackbar.LENGTH_LONG)
    snackbar.show()
}

fun CoordinatorLayout.showSnackbar(text: String) {
    val snackbar = Snackbar.make(this, text, Snackbar.LENGTH_LONG)
    snackbar.show()
}