package com.waleska404.androidlifecycle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.waleska404.androidlifecycle.navigation.SetupNavGraph
import com.waleska404.androidlifecycle.ui.theme.AndroidLifecycleTheme
import com.waleska404.util.Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidLifecycleTheme {
                val navController = rememberNavController()
                SetupNavGraph(
                    startDestination = Screen.Home.route,
                    navController = navController
                )
            }
        }
    }
}
