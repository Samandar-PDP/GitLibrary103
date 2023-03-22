package com.sdk.toaster

import android.content.Context
import android.widget.Toast

fun Context.toast(text: String) {
    // Samandar Dev
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}