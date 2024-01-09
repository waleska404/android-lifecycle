package com.waleska404.myfragment.demonstration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.waleska404.ui.components.CustomIconButton

@Composable
fun Dem2FragmentScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp)
    ) {
        Spacer(modifier = Modifier.height(120.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                //.background(color = MaterialTheme.colorScheme.onSecondary, shape = RoundedCornerShape(20.dp))
                .background(color = Color.Magenta, shape = RoundedCornerShape(20.dp))
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                // TODO: use string resource
                text = "Fragment 1",
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
                        text = stringResource(id = R.string.state),
                        color = MaterialTheme.colorScheme.background,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    // Fragment 1
                    Row(
                        verticalAlignment = Alignment.Bottom,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Text(
                            text = stringResource(id = R.string.fragment_1_state),
                            color = MaterialTheme.colorScheme.background
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = stringResource(id = R.string.on_create),
                            color = MaterialTheme.colorScheme.outline,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = stringResource(id = R.string.executed),
                            color = MaterialTheme.colorScheme.background
                        )
                    }
                    // Fragment 1
                    Row(
                        verticalAlignment = Alignment.Bottom,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Text(
                            text = stringResource(id = R.string.fragment_1_state),
                            color = MaterialTheme.colorScheme.background
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = stringResource(id = R.string.on_create_view),
                            color = MaterialTheme.colorScheme.outline,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = stringResource(id = R.string.executed),
                            color = MaterialTheme.colorScheme.background
                        )
                    }
                    // Activity 1
                    Row(
                        verticalAlignment = Alignment.Bottom,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Text(
                            text = stringResource(id = R.string.fragment_1_state),
                            color = MaterialTheme.colorScheme.background
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = stringResource(id = R.string.on_view_created),
                            color = MaterialTheme.colorScheme.outline,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = stringResource(id = R.string.executed),
                            color = MaterialTheme.colorScheme.background
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(22.dp))
            CustomIconButton(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(id = R.string.goto_fragment_2),
                onClick = {
                    //TODO: not implemented yet
                },
                iconResource = R.drawable.next,
                iconDescriptionResource = R.string.life_icon
            )
            Spacer(modifier = Modifier.height(22.dp))
        }

    }
}