package com.vinish.ecovexhub.model

data class Update(
    val id: String,
    val title: String,
    val description: String,
    val time: String,
    val type: PostType
)
