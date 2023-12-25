package com.waleska404.activity.start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf
import com.waleska404.ui.theme.AndroidLifecycleTheme

class StartSecondActivity : AppCompatActivity() {

    private val TAG = "MyActivity2"
    private val initState = mutableStateOf(true)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onBackPressedDispatcher.addCallback(this, object: OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Log.d("MYTAG","Back button pressed")
                // Code that you need to execute on back press, e.g. finish()
            }
        })
        Log.d(TAG, "onCreate")
        setContent {
            AndroidLifecycleTheme {
                StartSecondActivityScreen(
                    initialState = initState.value,
                    navigateToActivity3 = {
                        startActivity(
                            Intent(this, StartThirdActivity::class.java)
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