package com.waleska404.activity.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.waleska404.activity.ActivityHomeScreen
import com.waleska404.util.Screen

fun NavGraphBuilder.activityRoute(
    navigateToHomeScreen: () -> Unit,
) {
    composable(route = Screen.Activity.route) {
        ActivityHomeScreen()
    }
}