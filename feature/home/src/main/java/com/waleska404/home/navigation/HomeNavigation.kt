package com.waleska404.home.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.waleska404.home.HomeScreen
import com.waleska404.util.Screen

fun NavGraphBuilder.homeRoute(
    navigateToActivityScreen: () -> Unit,
) {
    composable(route = Screen.Home.route) {
        HomeScreen(
            navigateToActivityScreen = navigateToActivityScreen
        )
    }
}