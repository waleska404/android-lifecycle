package com.waleska404.activity.resume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import com.waleska404.ui.theme.AndroidLifecycleTheme

class ResumeThirdActivity : AppCompatActivity() {

    private val TAG = "MYTAG - Activity3"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        setContent {
            AndroidLifecycleTheme {
                ResumeThirdActivityScreen(
                    returnToActivity2 = {
                        finish()
                    },
                )
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}