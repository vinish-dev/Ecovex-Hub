package com.vinish.ecovexhub.ui.explore.components

import android.R
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.data.fake.clubMembers
import com.vinish.ecovexhub.data.fake.sustainabilityTips
import com.vinish.ecovexhub.model.SustainabilityTip
import com.vinish.ecovexhub.theme.BorderStoke
import com.vinish.ecovexhub.theme.ProfileBgFillColor

@Composable
fun SustainabilityTipCard(
    tip: SustainabilityTip,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.width(width = 160.dp),
        colors = CardDefaults.cardColors(containerColor = tip.containerColor),
        border = BorderStroke(width = 1.dp, color = BorderStoke)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {

            Icon(
                modifier = Modifier.size(50.dp),
                painter = painterResource(tip.iconRes),
                contentDescription = "Profile icon",
                tint = tip.iconTint
            )

            Text(
                text = tip.title,
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                textAlign = TextAlign.Center
            )

            Text(
                text = tip.description,
                style = MaterialTheme.typography.bodySmall,
                color = Color.DarkGray,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview
@Composable
fun SustainabilityTipCardPreview(modifier: Modifier = Modifier) {
    SustainabilityTipCard(
        tip = sustainabilityTips[1]
    )
}