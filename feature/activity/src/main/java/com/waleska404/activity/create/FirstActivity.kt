package com.waleska404.activity.create

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.mutableStateOf
import com.waleska404.ui.theme.AndroidLifecycleTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class FirstActivity : AppCompatActivity() {

    private val TAG = "FirstActivity"
    private val text = mutableStateOf("Not created yet")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        setContent {
            AndroidLifecycleTheme {
                FirstActivityScreen(
                    activity2Text = text.value,
                    changeTextToDestroyed = {
                        CoroutineScope(Dispatchers.Main).launch{
                            delay(1000)
                            text.value =  "DESTROYED"
                        }
                    },
                    changeTextToNotCreated = {
                        text.value = "NOT CREATED YET"
                    },
                    navigateToActivity2 = {
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
}