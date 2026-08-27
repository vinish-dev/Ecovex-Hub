package com.vinish.ecovexhub.ui.explore.components

import android.R.attr.contentDescription
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.data.fake.campusImageList
import com.vinish.ecovexhub.ui.components.SectionHeader

@Composable
fun CampusGallerySection(
    campusImages: List<Int>,
    modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        SectionHeader(
            title = "Campus Gallery",
        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(campusImages){
                Image(
                    painter = painterResource(it),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(width = 150.dp, height = 110.dp).clip(
                        RoundedCornerShape(12.dp))
                )
            }
        }
    }
}