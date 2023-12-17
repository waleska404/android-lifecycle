package com.waleska404.home

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen(
    navigateToActivityScreen: () -> Unit,
) {
    Text(text = "Home Screen")
    Button(
        onClick = navigateToActivityScreen
    ) {
        Text(text = "Navigate to Activity Screen")
    }
}