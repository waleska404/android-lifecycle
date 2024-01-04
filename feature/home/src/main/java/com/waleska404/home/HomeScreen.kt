package com.waleska404.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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

@Composable
fun HomeScreen(
    navigateToActivityScreen1: () -> Unit,
    navigateToActivityScreen2: () -> Unit,
    navigateToActivityScreen3: () -> Unit,
    navigateToFragmentScreen1: () -> Unit,
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
        CollapsableLazyColumn(
            modifier = Modifier.fillMaxHeight(),
            sections = listOf(
                CollapsableSection(
                    title = stringResource(id = R.string.activity_lifecycle),
                    rows = listOf(
                        Subsection(
                            title = "onCreate and onDestroy",
                            onClick =  {
                                navigateToActivityScreen1()
                            }
                        ),
                        Subsection(
                            title = "onStart and onStop",
                            onClick = {
                                navigateToActivityScreen2()
                            }
                        ),
                        Subsection(
                            title = "onResume and onPause",
                            onClick = {
                                navigateToActivityScreen3()
                            }
                        ),
                    )
                ),
                CollapsableSection(
                    title = stringResource(id = R.string.fragment_lifecycle),
                    rows = listOf(
                        Subsection(
                            title = "Lifecycle Demonstration",
                            onClick = {
                                navigateToFragmentScreen1()
                            }
                        ),
                        Subsection(
                            title = "Fragments Back Stack",
                            onClick = {}
                        ),
                        Subsection(
                            title = "Fragment View Lifecycle",
                            onClick = {}
                        ),
                    )
                ),
            ),
        )

    }
}