package com.vinish.ecovexhub.ui.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.model.Event
import com.vinish.ecovexhub.ui.components.EventCard
import com.vinish.ecovexhub.ui.components.SectionHeader


@Composable
fun UpcomingEventsSection(
    events: List<Event>,
    onViewAllClick: () -> Unit= {},
    onEventClick: (Event) -> Unit = {},
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        SectionHeader(title = "Upcoming", showViewAll = true, onViewAllClick = {})

        events.forEach { event ->
            EventCard(event = event, onClick = {onEventClick(event)})
            Spacer(Modifier.height(8.dp))
        }
    }
    
}