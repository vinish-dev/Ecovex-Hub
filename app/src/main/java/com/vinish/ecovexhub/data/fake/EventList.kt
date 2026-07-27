package com.vinish.ecovexhub.data.fake

import com.vinish.ecovexhub.model.Event
import com.vinish.ecovexhub.model.EventCategory
import com.vinish.ecovexhub.model.EventStatus

//Fake Events
val EventList = listOf<Event>(
    Event(
        id = 1,
        title = "Tree Plantation Drive",
        description = "Join us in our mission to make the camp greener and healthier. Together we can create a better environment For future generation ",
        category = EventCategory.DRIVE,
        status = EventStatus.UPCOMING,
        date = "05 Sep 2026",
        location = "Main Campus",
        imageRes = null
    ),
    Event(
        id = 2,
        title = "Sustainability Workshop",
        description = "Join us in our mission to make the camp greener and healthier. Together we can create a better environment For future generation ",
        category = EventCategory.WORKSHOP,
        status = EventStatus.ONGOING,
        date = "20 Sep 2026",
        location = "Seminar Hall",
        imageRes = null
    ),
    Event(
        id = 3,
        title = "Green Roots Challenge",
        description = "Join us in our mission to make the camp greener and healthier. Together we can create a better environment For future generation ",
        category = EventCategory.CHALLENGE,
        status = EventStatus.COMPLETED,
        date = "27 Sep 2026",
        location = "Ecovex Workshop",
        imageRes = null
    ),
    Event(
        id = 4,
        title = "Poster Making Challenge",
        description = "Join us in our mission to make the camp greener and healthier. Together we can create a better environment For future generation ",
        category = EventCategory.CHALLENGE,
        status = EventStatus.UPCOMING,
        date = "30 Sep 2026",
        location = "Auditorium",
        imageRes = null
    )

)