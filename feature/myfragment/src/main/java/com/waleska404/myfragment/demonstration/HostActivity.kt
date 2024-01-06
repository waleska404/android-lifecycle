package com.waleska404.myfragment.demonstration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.waleska404.ui.theme.AndroidLifecycleTheme

class HostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidLifecycleTheme {
                ActivityHostScreen(
                    startFragment1 = { startFragment1() }
                )
            }
        }
    }

    private fun startFragment1() {
        supportFragmentManager
            .beginTransaction()
            .replace(android.R.id.content, Dem1Fragment())
            .commit()
    }
}