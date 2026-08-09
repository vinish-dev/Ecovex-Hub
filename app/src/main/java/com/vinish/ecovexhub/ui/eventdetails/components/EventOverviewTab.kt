package com.vinish.ecovexhub.ui.eventdetails.components


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.model.Event

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