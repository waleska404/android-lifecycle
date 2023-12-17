package com.waleska404.activity

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FirstActivityScreen()
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(22.dp))
        Text(text = "Activity 1")
        Divider(thickness = 1.dp)
        Spacer(modifier = Modifier.height(22.dp))
        Text(text = "State:")
        Text(text = "Activity 1: CREATED")
        Text(text = "Activity 2: DESTROYED")
        
        Button(
            onClick = { /*TODO*/ }
        ) {
            Text(text = "Go to Activity 2")
        }
        Button(
            onClick = { /*TODO*/ }
        ) {
            Text(text = "RESET")
        }
    }
}