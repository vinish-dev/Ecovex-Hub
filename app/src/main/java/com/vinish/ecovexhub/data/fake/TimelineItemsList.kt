package com.vinish.ecovexhub.data.fake

import com.vinish.ecovexhub.model.TimelineItem

val timeline = listOf(
    TimelineItem(
        date = "05 Sep 2026 • 8:00 AM",
        title = "Registration Opens",
        isCompleted = true,
    ),

    TimelineItem(
        date = "10 Sep 2026 • 9:00 AM",
        title = "Registration Closes",
        isCompleted = true,
    ),

    TimelineItem(
        date = "15 Sep 2026 • 10:00 AM",
        title = "Event Begins",
        isCompleted = false,
    ),

    TimelineItem(
        date = "15 Sep 2026 • 4:00 PM",
        title = "Event Ends",
        isCompleted = false,
    ),
)