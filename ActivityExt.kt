package com.example.socpedstorage.extention

import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts


fun ComponentActivity.startActivityResultReqCode(
    requestCode: Int, labmda: ((result: ActivityResult, reqCode: Int?) -> Unit)
): ActivityResultLauncher<Intent> {

    return registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        labmda.invoke(it, requestCode)
    }
}

fun ComponentActivity.startActivityResult(
    labmda: ((result: ActivityResult) -> Unit)
): ActivityResultLauncher<Intent> {

    return registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        labmda.invoke(it)
    }
}
