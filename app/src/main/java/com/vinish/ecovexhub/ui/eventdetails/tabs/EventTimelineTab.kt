package com.vinish.ecovexhub.ui.eventdetails.tabs

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.vinish.ecovexhub.model.Event
import com.vinish.ecovexhub.ui.eventdetails.components.TimelineItem

@Composable
fun EventTimelineTab(
    event: Event,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {

        event.timeline.forEachIndexed { index, item ->
            TimelineItem(
                title = item.title,
                time = "",
                date = item.date,
                isCompleted = item.isCompleted,
                isCurrent = item.isCurrent,
                isLast = index == event.timeline.lastIndex
            )
        }
    }
}
