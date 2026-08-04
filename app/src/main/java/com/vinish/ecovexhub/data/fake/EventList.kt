package com.vinish.ecovexhub.data.fake

import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.model.Event
import com.vinish.ecovexhub.model.EventCategory
import com.vinish.ecovexhub.model.EventStatus

//Fake Events
val eventList = listOf<Event>(
    Event(
        id = 1,
        title = "Tree Plantation Drive",
        description = "Join us in our mission to make the camp greener and healthier. Together we can create a better environment For future generation ",
        category = EventCategory.DRIVE,
        status = EventStatus.UPCOMING,
        date = "05 Sep 2026",
        location = "Main Campus",
        imageRes = R.drawable.img_saplings_banner,
        time = "8:00 AM"
    ),
    Event(
        id = 2,
        title = "Sustainability Workshop",
        description = "Join us in our mission to make the camp greener and healthier. Together we can create a better environment For future generation ",
        category = EventCategory.WORKSHOP,
        status = EventStatus.ONGOING,
        date = "20 Sep 2026",
        location = "Seminar Hall",
        imageRes = R.drawable.img_sustainability_workshop,
        time = "9:30 AM"
    ),
    Event(
        id = 3,
        title = "Green Roots Challenge",
        description = "Join us in our mission to make the camp greener and healthier. Together we can create a better environment For future generation ",
        category = EventCategory.CHALLENGE,
        status = EventStatus.COMPLETED,
        date = "27 Sep 2026",
        location = "Ecovex Workshop",
        imageRes = R.drawable.img_plant_challenge,
        time = "9:00 AM"
    ),
    Event(
        id = 4,
        title = "Poster Making Challenge",
        description = "Join us in our mission to make the camp greener and healthier. Together we can create a better environment For future generation ",
        category = EventCategory.CHALLENGE,
        status = EventStatus.UPCOMING,
        date = "30 Sep 2026",
        location = "Auditorium",
        imageRes = R.drawable.img_plantposter,
        time = "12:00 PM"
    ),
    Event(
        id = 5,
        title = "Tree Plantation Drive",
        description = "Join us in our mission to make the camp greener and healthier. Together we can create a better environment For future generation ",
        category = EventCategory.DRIVE,
        status = EventStatus.UPCOMING,
        date = "05 Sep 2026",
        location = "Main Campus",
        imageRes = R.drawable.img_saplings_banner,
        time = "12:30 PM"
    ),
    Event(
        id = 6,
        title = "Sustainability Workshop",
        description = "Join us in our mission to make the camp greener and healthier. Together we can create a better environment For future generation ",
        category = EventCategory.WORKSHOP,
        status = EventStatus.ONGOING,
        date = "20 Sep 2026",
        location = "Seminar Hall",
        imageRes = R.drawable.img_sustainability_workshop,
        time = "4:00 PM"
    ),
    Event(
        id = 7,
        title = "Green Roots Challenge",
        description = "Join us in our mission to make the camp greener and healthier. Together we can create a better environment For future generation ",
        category = EventCategory.CHALLENGE,
        status = EventStatus.COMPLETED,
        date = "27 Sep 2026",
        location = "Ecovex Workshop",
        imageRes = R.drawable.img_plant_challenge,
        time = "8:00 AM"
    ),
    Event(
        id = 8,
        title = "Poster Making Challenge",
        description = "Join us in our mission to make the camp greener and healthier. Together we can create a better environment For future generation ",
        category = EventCategory.CHALLENGE,
        status = EventStatus.UPCOMING,
        date = "30 Sep 2026",
        location = "Auditorium",
        imageRes = R.drawable.img_plantposter,
        time = "8:30 AM"
    )

)