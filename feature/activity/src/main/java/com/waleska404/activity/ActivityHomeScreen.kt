package com.waleska404.activity

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.waleska404.activity.create.FirstActivity
import com.waleska404.ui.R
import com.waleska404.ui.components.CustomIconButtonEntryPoint

@Composable
fun ActivityHomeScreen() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(12.dp))
        // title
        Text(
            text = stringResource(id = R.string.activity_lifecycle),
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            color = MaterialTheme.colorScheme.secondary,
            modifier = Modifier.padding(8.dp),
            lineHeight = 40.sp,
            textAlign = TextAlign.Center,
            maxLines = 2,
        )
        Spacer(modifier = Modifier.height(22.dp))
        CustomIconButtonEntryPoint(
            text = stringResource(id = R.string.create_destroy),
            onClick = {
                context.startActivity(
                    Intent(context, FirstActivity::class.java)
                )
            },
            iconResource = R.drawable.callback,
            iconDescriptionResource = R.string.callback_icon,
            modifier = Modifier.padding(8.dp),
        )
        CustomIconButtonEntryPoint(
            text = stringResource(id = R.string.start_stop),
            onClick = {

            },
            iconResource = R.drawable.callback,
            iconDescriptionResource = R.string.callback_icon,
            modifier = Modifier.padding(8.dp),
        )
        CustomIconButtonEntryPoint(
            text = stringResource(id = R.string.resume_pause),
            onClick = {

            },
            iconResource = R.drawable.callback,
            iconDescriptionResource = R.string.callback_icon,
            modifier = Modifier.padding(8.dp),
        )
    }
}

