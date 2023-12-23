package com.waleska404.activity.start

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.waleska404.activity.R
import com.waleska404.ui.theme.AndroidLifecycleTheme

class StartThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidLifecycleTheme {
                StartThirdActivityScreen()
            }
        }
    }
}