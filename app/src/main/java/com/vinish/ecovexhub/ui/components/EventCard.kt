package com.vinish.ecovexhub.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.model.Event
import com.vinish.ecovexhub.model.EventCategory
import com.vinish.ecovexhub.model.EventStatus


@Composable
fun EventCard(
    event: Event,
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth().height(118.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(16.dp),
        onClick = onClick

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(event.category.bannerRes),
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(16.dp)).align(Alignment.Top)
            )
            Spacer(Modifier.width(16.dp))

            //content
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = event.title,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold,

                    )
                Spacer(Modifier.height(8.dp))

                //category and status row
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(event.category.displayName, color = Color.Gray, style = MaterialTheme.typography.labelMedium)
                    Spacer(Modifier.weight(1f))
                    StatusChip(event.status)
                }

                Spacer(Modifier.height(8.dp))

                //calendar icon and date
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_calendar_clock_16dp),
                        contentDescription = null
                    )
                    Spacer(Modifier.width(4.dp))
                    Text(text = event.date, fontSize = 12.sp)
                    Text(" • ")
                    Text(text = event.location, fontSize = 12.sp)
                }
            }
        }
    }
}