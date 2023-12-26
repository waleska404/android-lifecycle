package com.waleska404.activity.start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf
import com.waleska404.ui.theme.AndroidLifecycleTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

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
                    },
                    setInitStateToTrue = {
                        initState.value = true
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

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}