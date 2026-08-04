package com.vinish.ecovexhub.model

data class Event(
    val id: Int,
    val time: String,
    val title: String,
    val description: String,
    val category: EventCategory,
    val status: EventStatus,
    val date: String,
    val location: String,
    val imageRes: Int?
)


