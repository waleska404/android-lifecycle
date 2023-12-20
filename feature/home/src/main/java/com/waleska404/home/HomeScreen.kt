package com.waleska404.home

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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.waleska404.ui.R
import com.waleska404.ui.components.CustomIconButtonEntryPoint

@Composable
fun HomeScreen(
    navigateToActivityScreen: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        Spacer(modifier = Modifier.height(12.dp))
        // title
        Text(
            text = stringResource(id = R.string.topics),
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
            text = stringResource(id = R.string.activity_lifecycle),
            onClick = navigateToActivityScreen,
            iconResource = R.drawable.cycle,
            iconDescriptionResource = R.string.cycle_icon,
            modifier = Modifier.padding(8.dp),
        )
        CustomIconButtonEntryPoint(
            text = stringResource(id = R.string.fragment_lifecycle),
            onClick = { },
            iconResource = R.drawable.cycle,
            iconDescriptionResource = R.string.cycle_icon,
            modifier = Modifier.padding(8.dp),
        )
    }
}