package com.vinish.ecovexhub.ui.eventdetails.tabs


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.model.Event
import com.vinish.ecovexhub.ui.eventdetails.components.EventHighlightSection
import com.vinish.ecovexhub.ui.eventdetails.components.EventOverviewCard

@Composable
fun EventOverviewTab(
    event: Event,
    modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        EventOverviewCard(
            event = event
        )
        EventHighlightSection()
    }
}