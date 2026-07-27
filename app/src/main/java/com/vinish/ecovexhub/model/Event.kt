package com.vinish.ecovexhub.model

data class Event(
    val id: String,
    val title: String,
    val category: EventCategory,
    val status: EventStatus,
    val date: String,
    val venue: String
)


