package com.waleska404.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
    navigateToActivityScreen: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            fontSize = 30.sp,
            text = "Topics"
        )
        Spacer(modifier = Modifier.height(22.dp))
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = navigateToActivityScreen
        ) {
            Text(text = "Activity Lifecycle")
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {  }
        ) {
            Text(text = "Fragment Lifecycle")
        }
    }
}