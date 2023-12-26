package com.waleska404.activity.resume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf
import com.waleska404.ui.theme.AndroidLifecycleTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ResumeSecondActivity : AppCompatActivity() {

    private val TAG = "MYTAG - Activity2"
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
                ResumeSecondActivityScreen(
                    initialState = initState.value,
                    navigateToActivity3 = {
                        startActivity(
                            Intent(this, ResumeThirdActivity::class.java)
                        )
                    },
                    returnToActivity1 = {
                        finish()
                    },
                    setInitStateToFalse = {
                        CoroutineScope(Dispatchers.Main).launch {
                            delay(1000)
                            initState.value = false
                        }
                    }
                )
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
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