package com.waleska404.activity.create

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FirstActivityScreen(
    activity2Text: String,
    changeTextToDestroyed: () -> Unit,
    changeTextToNotCreated: () -> Unit,
    navigateToActivity2: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(26.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                fontSize = 30.sp,
                text = "Activity 1"
            )
            Divider(thickness = 1.dp)
        }
        Spacer(modifier = Modifier.height(22.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
            Text(text = "State:")
            Text(text = "Activity 1: CREATED")
            Text(text = "Activity 2: $activity2Text")
            Spacer(modifier = Modifier.height(22.dp))
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    navigateToActivity2()
                    changeTextToDestroyed()
                }
            ) {
                Text(text = "Go to Activity 2")
            }
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    changeTextToNotCreated()
                }
            ) {
                Text(text = "RESET")
            }
        }
    }
}