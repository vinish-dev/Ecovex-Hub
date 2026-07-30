package com.vinish.ecovexhub.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.model.OverviewStat
import com.vinish.ecovexhub.theme.EcovexGreen

@Preview(showBackground = true, showSystemUi = true)
@Composable

fun StatCard(
    stat: OverviewStat = OverviewStat(
        icon = R.drawable.ic_overview_tree,
        value = "298",
        label = "Members",
        tint = EcovexGreen
    ),
    modifier: Modifier = Modifier
) {

    Card(
        modifier = modifier.size(height = 112.dp, width = 120.dp),
        elevation = CardDefaults.cardElevation(2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {

        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize().padding(16.dp)
        ) {

            //main icon
            Icon(
                painter = painterResource(stat.icon),
                contentDescription = null,
                tint = stat.tint,
                modifier = Modifier.size(32.dp)
            )

            Spacer(Modifier.height(6.dp))

            //value text
            Text(text = stat.value, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold)

            Spacer(Modifier.height(4.dp))

            //label text
            Text(text = stat.label, style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center)
        }
    }
}