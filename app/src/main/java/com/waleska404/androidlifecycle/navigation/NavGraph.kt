package com.waleska404.androidlifecycle.navigation

import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.waleska404.activity.create.FirstActivity
import com.waleska404.activity.resume.ResumeFirstActivity
import com.waleska404.activity.start.StartFirstActivity
import com.waleska404.home.navigation.homeRoute
import com.waleska404.myfragment.demonstration.HostActivity

@Composable
fun SetupNavGraph(
    startDestination: String,
    navController: NavHostController,
) {
    val context = LocalContext.current
    NavHost(
        startDestination = startDestination,
        navController = navController
    ) {
        homeRoute(
            navigateToActivityScreen1 = {
                context.startActivity(
                    Intent(context, FirstActivity::class.java)
                )
            },
            navigateToActivityScreen2 = {
                context.startActivity(
                    Intent(context, StartFirstActivity::class.java)
                )
            },
            navigateToActivityScreen3 = {
                context.startActivity(
                    Intent(context, ResumeFirstActivity::class.java)
                )
            },
            navigateToFragmentScreen1 = {
                context.startActivity(
                    Intent(context, HostActivity::class.java)
                )
            }
        )
    }
}