package com.waleska404.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.waleska404.ui.theme.AndroidLifecycleTheme

class FirstActivity : AppCompatActivity() {

    private var goToActivity2ClickedTimes = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidLifecycleTheme {
                FirstActivityScreen(
                    getActivity2Text = { getActivity2Text() },
                    onResetClicked = {
                        goToActivity2ClickedTimes = 0
                    },
                    onGoToActivity2Clicked = {
                        goToActivity2ClickedTimes++
                    }
                )
            }
        }
    }

    private fun getActivity2Text(): String {
        return if (goToActivity2ClickedTimes == 0) {
            "NOT CREATED YET"
        } else {
            "DESTROYED"
        }
    }
}