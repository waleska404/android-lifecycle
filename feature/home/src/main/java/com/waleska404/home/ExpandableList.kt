package com.waleska404.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun CollapsableLazyColumn(
    sections: List<CollapsableSection>,
    modifier: Modifier = Modifier
) {
    val collapsedState = remember(sections) { sections.map { true }.toMutableStateList() }
    LazyColumn(modifier) {
        sections.forEachIndexed { i, dataItem ->
            val collapsed = collapsedState[i]
            item(key = "header_$i") {
                Spacer(modifier = Modifier.height(20.dp))
                Card(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(45.dp)
                        .clickable { collapsedState[i] = !collapsed },
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.onPrimary,
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 18.dp,
                    )
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(
                            modifier = Modifier.padding(6.dp),
                            imageVector = Icons.Default.run {
                                if (collapsed)
                                    KeyboardArrowDown
                                else
                                    KeyboardArrowUp
                            },
                            contentDescription = "",
                            tint = Color.LightGray,
                        )
                        Text(
                            text = dataItem.title,
                            color =  MaterialTheme.colorScheme.secondary,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(vertical = 10.dp)
                                .weight(1f)
                        )
                    }
                }
            }
            if (!collapsed) {
                items(dataItem.rows) { row ->
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Spacer(modifier = Modifier.width(40.dp))
                        Card(
                            modifier = modifier
                                .fillMaxWidth()
                                .height(45.dp)
                                .clickable { row.onClick() },
                            shape = RoundedCornerShape(16.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.onPrimary,
                            ),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 18.dp,
                            )
                        ) {
                            Row {
                                Spacer(modifier = Modifier.size(MaterialIconDimension.dp))
                                Text(
                                    text = row.title,
                                    color = MaterialTheme.colorScheme.secondary,
                                    modifier = Modifier
                                        .padding(vertical = 10.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

data class CollapsableSection(val title: String, val rows: List<Subsection>)

data class Subsection(val title: String, val onClick: () -> Unit)

const val MaterialIconDimension = 24f