package com.vinish.ecovexhub.ui.explore.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.model.SustainabilityTip
import com.vinish.ecovexhub.ui.components.SectionHeader

@Composable
fun SustainabilityTipsSection(
    tips: List<SustainabilityTip>,
    modifier: Modifier = Modifier
) {
    Column{
        SectionHeader(
            title = "Sustainability Tips"
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(tips){
                SustainabilityTipCard(tip = it)
            }
        }
    }
}