package com.vinish.ecovexhub.ui.eventdetails.components

import android.system.Os.stat
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

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun EventHighlightCard(
    text: String = "Plant 100+ Trees",
    icon: Int = R.drawable.ic_brand_sapling,
    modifier: Modifier = Modifier,
    tint: Color = Color(0xFF598044)
) {
    Card(
        modifier = modifier.size(height = 100.dp, width = 110.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFf7f9ef))
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize().padding(16.dp)
        ) {

            //main icon
            Icon(
                painter = painterResource(icon),
                contentDescription = null,
                tint = tint,
                modifier = Modifier.size(32.dp)
            )

            Spacer(Modifier.height(6.dp))

            //label text
            Text(text = text, style = MaterialTheme.typography.bodySmall, textAlign = TextAlign.Center,
                fontWeight = FontWeight.W400)
        }
    }
}