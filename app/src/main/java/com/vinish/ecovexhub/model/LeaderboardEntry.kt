package com.vinish.ecovexhub.model

import com.vinish.ecovexhub.R

data class LeaderboardEntry(
    val id: Int,
    val name: String,
    val points: Int,
    val iconRes: Int = R.drawable.ic_person
)

