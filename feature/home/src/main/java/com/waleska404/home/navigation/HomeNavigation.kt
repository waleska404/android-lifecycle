package com.waleska404.home.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.waleska404.home.HomeScreen
import com.waleska404.util.Screen

fun NavGraphBuilder.homeRoute(
    navigateToActivityScreen1: () -> Unit,
    navigateToActivityScreen2: () -> Unit,
    navigateToActivityScreen3: () -> Unit,
) {
    composable(route = Screen.Home.route) {
        HomeScreen(
            navigateToActivityScreen1 = navigateToActivityScreen1,
            navigateToActivityScreen2 = navigateToActivityScreen2,
            navigateToActivityScreen3 = navigateToActivityScreen3
        )
    }
}