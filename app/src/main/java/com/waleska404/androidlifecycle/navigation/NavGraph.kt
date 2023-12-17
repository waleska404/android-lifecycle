package com.waleska404.androidlifecycle.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.waleska404.activity.navigation.activityRoute
import com.waleska404.home.navigation.homeRoute
import com.waleska404.util.Screen

@Composable
fun SetupNavGraph(
    startDestination: String,
    navController: NavHostController,
) {
    NavHost(
        startDestination = startDestination,
        navController = navController
    ) {
        homeRoute(
            navigateToActivityScreen = {
                navController.navigate(Screen.Activity.route)
            }
        )
        activityRoute(
            navigateToHomeScreen = {
                navController.popBackStack()
                navController.navigate(Screen.Home.route)
            }
        )
    }
}