package com.waleska404.util


sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Activity : Screen(route = "activity_screen")
}
