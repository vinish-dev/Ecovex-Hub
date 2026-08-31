package com.vinish.ecovexhub.model


import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class SustainabilityTip(
    val title: String,
    val description: String,
    val containerColor: Color,
    @DrawableRes
    val iconRes: Int,
    val iconTint: Color
    )
