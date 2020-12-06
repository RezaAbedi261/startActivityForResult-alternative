package com.example.socpedstorage.extention

import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts


fun ComponentActivity.startActivityResultReqCode(
    intent: Intent,
    requestCode: Int,
    function: (result: ActivityResult, reqCode: Int?) -> Unit
) {

    registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {

        function.invoke(it, requestCode)

    }.launch(intent)

}

fun ComponentActivity.startActivityResult(
    intent: Intent,
    function: (result: ActivityResult) -> Unit
) {

    registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {

        function.invoke(it)

    }.launch(intent)

}