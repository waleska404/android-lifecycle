package com.waleska404.myfragment.demonstration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Divider
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
import com.waleska404.ui.components.CustomIconButton

@Composable
fun ActivityHostScreen(
    startFragment1: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = stringResource(id = R.string.activity_host_1_title),
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier.padding(8.dp),
                lineHeight = 30.sp,
                textAlign = TextAlign.Center,
                maxLines = 2,
            )
            Divider(
                thickness = 1.dp,
                color = MaterialTheme.colorScheme.secondary
            )
            Spacer(modifier = Modifier.height(22.dp))
            CustomIconButton(
                modifier = Modifier.fillMaxWidth().wrapContentHeight(),
                text = stringResource(id = R.string.add_fragment),
                onClick = {
                    startFragment1()
                },
                iconResource = R.drawable.plus,
                iconDescriptionResource = R.string.life_icon
            )
        }
    }
}