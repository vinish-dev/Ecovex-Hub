package com.vinish.ecovexhub.ui.events.components

import android.R.attr.label
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.SelectableChipColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.model.Event
import com.vinish.ecovexhub.model.EventStatus
import com.vinish.ecovexhub.theme.BorderStoke
import com.vinish.ecovexhub.theme.EcovexGreen

//@Preview(showSystemUi = true, showBackground = true)
@Composable
fun EventFilterBar(
    onClick:(EventStatus?) -> Unit = {},
    selectedFilter: EventStatus?,
    modifier: Modifier = Modifier
){
    // null + all event status
    val filters: List<EventStatus?> = listOf<EventStatus?>(null) + EventStatus.entries

    LazyRow(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(filters){ filter ->
            FilterChip(
                selected = selectedFilter == filter,
                onClick = {onClick(filter)},
                label = {Text(filter?.displayName ?: "All")},
                colors = FilterChipDefaults.filterChipColors(
                    containerColor = Color.White,
                    selectedLabelColor = Color.White,
                    selectedContainerColor = EcovexGreen,
                    labelColor = Color(0xFF241A17)
                ),
                border = FilterChipDefaults.filterChipBorder(
                    enabled = true,
                    selected = selectedFilter == filter,
                    borderColor = BorderStoke
                )

            )
        }
    }
}