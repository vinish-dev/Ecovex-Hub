package com.vinish.ecovexhub.data.fake

import androidx.compose.ui.graphics.Color
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.model.OverviewStat
import com.vinish.ecovexhub.theme.EcovexGreen

val statList = listOf<OverviewStat>(
    OverviewStat(
        icon = R.drawable.ic_overview_tree,
        value = "298",
        label = "Trees Planted",
        tint = EcovexGreen
    ),
    OverviewStat(
        icon = R.drawable.ic_overview_members,
        value = "100",
        label = "Members",
        tint = Color(0xFFFF672C)
    ),
    OverviewStat(
        icon = R.drawable.ic_overview_activitiy,
        value = "12",
        label = "Activities",
        tint = Color(0xFFFFCE2C)
    ),
    OverviewStat(
        icon = R.drawable.ic_overview_species,
        value = "79",
        label = "Species",
        tint = EcovexGreen
    )
)