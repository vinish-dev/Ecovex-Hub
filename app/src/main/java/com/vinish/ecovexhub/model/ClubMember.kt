package com.vinish.ecovexhub.model

import androidx.annotation.DrawableRes

data class ClubMember(
    val name: String,
    val role: String,
    @DrawableRes
    val profileRes: Int
)
