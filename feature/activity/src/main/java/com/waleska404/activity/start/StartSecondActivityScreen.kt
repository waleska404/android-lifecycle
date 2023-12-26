package com.waleska404.activity.start

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
import com.waleska404.ui.components.CustomIconButton

@Composable
fun StartSecondActivityScreen(
    navigateToActivity3: () -> Unit,
    returnToActivity1: () -> Unit,
    setInitStateToFalse: () -> Unit,
    initialState: Boolean,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
            .verticalScroll(
                state = rememberScrollState()
            )
    ) {
        HeaderSecondScreen()
        CallbacksSecondScreen(initialState = initialState)
        FooterSecondScreen(
            navigateToActivity3 = navigateToActivity3,
            returnToActivity1 = returnToActivity1,
            initialState = initialState,
            setInitStateToFalse = setInitStateToFalse,
        )
    }
}


@Composable
fun HeaderSecondScreen() {
    Spacer(modifier = Modifier.height(12.dp))
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(id = R.string.activity_2_title),
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            color = MaterialTheme.colorScheme.secondary,
            modifier = Modifier.padding(8.dp),
            lineHeight = 30.sp,
            textAlign = TextAlign.Center,
            maxLines = 2,
        )
    }
    Divider(
        thickness = 1.dp,
        color = MaterialTheme.colorScheme.secondary
    )
    Spacer(modifier = Modifier.height(22.dp))
}

@Composable
fun CallbacksSecondScreen(
    initialState: Boolean
) {
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
                    text = stringResource(id = R.string.on_start),
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
                    text = stringResource(id = R.string.activity_1_state_value),
                    color = MaterialTheme.colorScheme.outline,
                    fontWeight = FontWeight.Bold
                )
            }
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
                    text = stringResource(id = R.string.on_start),
                    color = MaterialTheme.colorScheme.outline,
                    fontWeight = FontWeight.Bold
                )
            }
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
                    text = stringResource(id = R.string.on_stop),
                    color = MaterialTheme.colorScheme.inverseOnSurface,
                    fontWeight = FontWeight.Bold
                )
            }
            if(initialState) {
                // Activity 3
                Row(
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Text(
                        text = stringResource(id = R.string.activity_3_state),
                        color = MaterialTheme.colorScheme.background
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(
                        text = stringResource(id = R.string.activity_2_state_not_created),
                        color = MaterialTheme.colorScheme.surface,
                        fontWeight = FontWeight.Bold
                    )
                }
            } else {
                CallbacksAdded()
            }
        }
    }
}

@Composable
fun CallbacksAdded() {
    // Activity 3
    Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Start
    ) {
        Text(
            text = stringResource(id = R.string.activity_3_state),
            color = MaterialTheme.colorScheme.background
        )
        Spacer(modifier = Modifier.width(5.dp))
        Text(
            text = stringResource(id = R.string.activity_1_state_value),
            color = MaterialTheme.colorScheme.outline,
            fontWeight = FontWeight.Bold
        )
    }
    // Activity 3
    Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Start
    ) {
        Text(
            text = stringResource(id = R.string.activity_3_state),
            color = MaterialTheme.colorScheme.background
        )
        Spacer(modifier = Modifier.width(5.dp))
        Text(
            text = stringResource(id = R.string.on_start),
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
            text = stringResource(id = R.string.on_stop),
            color = MaterialTheme.colorScheme.inverseOnSurface,
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
            text = stringResource(id = R.string.on_start),
            color = MaterialTheme.colorScheme.outline,
            fontWeight = FontWeight.Bold
        )
    }
    // Activity 3
    Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Start
    ) {
        Text(
            text = stringResource(id = R.string.activity_3_state),
            color = MaterialTheme.colorScheme.background
        )
        Spacer(modifier = Modifier.width(5.dp))
        Text(
            text = stringResource(id = R.string.on_stop),
            color = MaterialTheme.colorScheme.inverseOnSurface,
            fontWeight = FontWeight.Bold
        )
    }
    // Activity 3
    Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Start
    ) {
        Text(
            text = stringResource(id = R.string.activity_3_state),
            color = MaterialTheme.colorScheme.background
        )
        Spacer(modifier = Modifier.width(5.dp))
        Text(
            text = stringResource(id = R.string.on_destroy),
            color = MaterialTheme.colorScheme.outlineVariant,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun FooterSecondScreen(
    navigateToActivity3: () -> Unit,
    returnToActivity1: () -> Unit,
    initialState: Boolean,
    setInitStateToFalse: () -> Unit
) {
    Spacer(modifier = Modifier.height(22.dp))
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        if(!initialState) {
            CustomIconButton(
                modifier = Modifier.weight(0.6f),
                text = stringResource(id = R.string.return_to_activity_1),
                onClick = {
                    returnToActivity1()
                },
                iconResource = R.drawable.ret,
                iconDescriptionResource = R.string.return_icon
            )
        } else {
            CustomIconButton(
                modifier = Modifier.weight(1f),
                text = stringResource(id = R.string.goto_activity_3),
                onClick = {
                    navigateToActivity3()
                    setInitStateToFalse()
                },
                iconResource = R.drawable.next,
                iconDescriptionResource = R.string.life_icon
            )
        }
    }
}