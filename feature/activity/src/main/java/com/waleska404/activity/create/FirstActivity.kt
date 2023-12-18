package com.waleska404.activity.create

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.waleska404.ui.theme.AndroidLifecycleTheme

class FirstActivity : AppCompatActivity() {

    private var goToActivity2ClickedTimes = 0
    private val TAG = "FirstActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        setContent {
            AndroidLifecycleTheme {
                FirstActivityScreen(
                    getActivity2Text = { getActivity2Text() },
                    onResetClicked = {
                        goToActivity2ClickedTimes = 0
                    },
                    onGoToActivity2Clicked = {
                        goToActivity2ClickedTimes++
                        startActivity(
                            Intent(this, SecondActivity::class.java)
                        )
                    }
                )
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    private fun getActivity2Text(): String {
        return if (goToActivity2ClickedTimes == 0) {
            "NOT CREATED YET"
        } else {
            "DESTROYED"
        }
    }
}