package com.vinish.ecovexhub.ui.eventdetails.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.model.EventDetailsTab


@Composable
fun EventTabBar(
    selectedTab: EventDetailsTab,
    onTabSelected: (EventDetailsTab) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        //each entry is a tab
        items(EventDetailsTab.entries) { tab ->

            EventTabChip(
                text = tab.title,
                selected = selectedTab == tab,
                onClick = {
                    onTabSelected(tab)
                }
            )
        }
    }
}