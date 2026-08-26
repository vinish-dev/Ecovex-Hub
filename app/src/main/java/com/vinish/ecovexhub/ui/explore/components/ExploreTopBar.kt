package com.vinish.ecovexhub.ui.explore.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.theme.EcovexGreen

@Composable
fun ExploreTopBar(
    modifier: Modifier = Modifier
){
    // main row
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        // title
        // subtitle
        Column{
            Text(
                text = "Explore",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = EcovexGreen
            )

            Text(
                text = "Discover the green heart of our campus 🌿",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray
            )
        }

        // notification icon
        IconButton(
            onClick = {
            //todo
                }
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_bell),
                contentDescription = "Notifications"
            )
        }
    }
}