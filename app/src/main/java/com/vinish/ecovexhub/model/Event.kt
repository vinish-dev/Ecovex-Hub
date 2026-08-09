package com.vinish.ecovexhub.model

// TODO(data): replace default parameters
data class Event(
    val id: Int,

    // basic info
    val title: String,
    val description: String,

    // Classification
    val category: EventCategory,
    val status: EventStatus,

    // Banner
    val imageRes: Int?,

    // Schedule
    val time: String,
    val date: String,
    val registrationDeadline: String = "18 September 2026",

    //timeline(for timeline tab in eventDetails screen)
    val timeline: List<TimelineItem> = emptyList(),

    // Location
    val venue: String = "Main Campus",
    val location: String,

    // Organizer
    val organizer: String = "Ecovex Club",
    val contact: String = "98765 43210",

    // Registration
    val maxParticipants: Int? = null,
    val registeredParticipants: Int? = null,

    // Event Extras
    val highlights: List<EventHighlight> = emptyList(),
    val galleryImages: List<Int> = emptyList()
)


