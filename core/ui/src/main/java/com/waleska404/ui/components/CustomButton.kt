package com.waleska404.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.waleska404.ui.LightAndDarkPreviews
import com.waleska404.ui.R
import com.waleska404.ui.theme.AndroidLifecycleTheme

@Composable
fun CustomIconButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
    enabled: Boolean = true,
    iconResource: Int,
    iconDescriptionResource: Int,
    iconTint: Color = MaterialTheme.colorScheme.primary,
    containerColor: Color = MaterialTheme.colorScheme.secondary,
    contentColor: Color = MaterialTheme.colorScheme.primary,
    disabledContainerColor: Color = MaterialTheme.colorScheme.surface,
    disabledContentColor: Color = MaterialTheme.colorScheme.primary
) {
    Button(
        modifier = modifier
            .height(40.dp),
        onClick = { onClick() },
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor,
            contentColor = contentColor,
            disabledContainerColor = disabledContainerColor,
            disabledContentColor = disabledContentColor,
        ),
        contentPadding = PaddingValues(
            0.dp
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier.size(20.dp),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = iconResource),
                    contentDescription = stringResource(id = iconDescriptionResource),
                    tint = iconTint,
                )
            }
            Spacer(Modifier.width(3.dp))
            Text(
                text = text,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
        }

    }
}

@LightAndDarkPreviews
@Composable
fun CustomIconButtonPreview() {
    AndroidLifecycleTheme {
        CustomIconButton(
            modifier = Modifier,
            text = "Sort",
            onClick = { },
            iconResource = R.drawable.life,
            iconDescriptionResource = R.string.life_icon,
            enabled = true,
        )
    }
}