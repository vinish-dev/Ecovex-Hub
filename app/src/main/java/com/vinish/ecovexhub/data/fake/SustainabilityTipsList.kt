package com.vinish.ecovexhub.data.fake

import androidx.compose.ui.graphics.Color
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.model.SustainabilityTip
import com.vinish.ecovexhub.theme.IconBg

val sustainabilityTips = listOf(
    SustainabilityTip(
        title = "Save Water",
        description = "Every drop counts",
        iconRes = R.drawable.ic_water_droplets,
        containerColor = Color(0xFFE1F3FA),
        iconTint = Color(0xFF469ddb)

    ),
    SustainabilityTip(
        title = "Recycle",
        description = "Reduce, reuse, recycle",
        iconRes = R.drawable.ic_recycle,
        containerColor = Color(0xFFE5F4E5),
        iconTint = Color(0xFF608b45)
    ),
    SustainabilityTip(
        title = "Plant Trees",
        description = "For a better tomorrow",
        iconRes = R.drawable.ic_brand_sapling,
        containerColor = Color(0xFFEEFCE3),
        iconTint = Color(0xFF87ae4f)
    )
)