package com.waleska404.activity.start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf
import com.waleska404.ui.theme.AndroidLifecycleTheme

class StartFirstActivity : AppCompatActivity() {

    private val TAG = "MyActivity1"
    private val initState = mutableStateOf(true)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        setContent {
            AndroidLifecycleTheme {
                StartFirstActivityScreen(
                    initialState = initState.value,
                    navigateToActivity2 = {
                        startActivity(
                            Intent(this, StartSecondActivity::class.java)
                        )
                    }
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