package com.waleska404.activity.start

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.waleska404.ui.R

@Composable
fun StartFirstActivityScreen() {
    Column(
        modifier = Modifier.verticalScroll(
            state = rememberScrollState()
        )
    ) {
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = stringResource(id = R.string.activity_1_title),
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
        Card(
            modifier = Modifier
                .wrapContentSize(),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.secondary
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent)
                    .padding(16.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Top
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = stringResource(id = R.string.callbacks_executed),
                    color = MaterialTheme.colorScheme.background,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(10.dp))

                // Activity 1
                Row(
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Text(
                        text = stringResource(id = R.string.activity_1_state),
                        color = MaterialTheme.colorScheme.background
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(
                        text = stringResource(id = R.string.activity_1_state_value),
                        color = MaterialTheme.colorScheme.outline,
                        fontWeight = FontWeight.Bold
                    )
                }
                // Activity 2
                Row(
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Text(
                        text = stringResource(id = R.string.activity_2_state),
                        color = MaterialTheme.colorScheme.background
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(
                        text = stringResource(id = R.string.activity_2_state_not_created),
                        color = MaterialTheme.colorScheme.surface,
                        fontWeight = FontWeight.Bold
                    )
                }

            }
        }

    }
}