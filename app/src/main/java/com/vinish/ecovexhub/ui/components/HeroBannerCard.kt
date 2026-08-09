package com.vinish.ecovexhub.ui.components

import android.R.attr.contentDescription
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.model.Event
import com.vinish.ecovexhub.model.EventCategory
import com.vinish.ecovexhub.model.EventStatus

@Composable
fun HeroBannerCard(
    event: Event,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .height(230.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(16.dp)
    ) {
        //image box and content box
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            //banner bg img
            Image(
                modifier = Modifier.matchParentSize(),
                painter = painterResource(event.imageRes ?: R.drawable.img_saplings_banner),
                contentDescription = null,
                contentScale = ContentScale.Crop,
            )

            //scrim( dark overlay for readability)
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .background(Color.Black.copy(alpha = 0.20f))
            )

            // content layer
            Row {
                Column(
                    modifier = Modifier
                        .weight(0.6f)
                        .padding(16.dp)
                ) {
                    // status chip
                    StatusChip(status = event.status)

                    Spacer(Modifier.height(8.dp))

                    // event title
                    Text(
                        text = event.title,
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )

                    Spacer(Modifier.height(8.dp))

                    // event description
                    Text(
                        text = event.description,
                        maxLines = 2,
                        color = Color.White,
                        overflow = TextOverflow.Ellipsis
                    )

                    Spacer(Modifier.height(16.dp))


                }
                //empty right half
                Spacer(Modifier.weight(0.4f))
            }

            //bottom row
            Row(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(16.dp)
            ) {
                //calendar icon
                EventInfoChip(
                    title = event.date,
                    subtitle = event.time,
                    iconRes = R.drawable.ic_events_filled,
                    whiteText = true,
                )

                Spacer(Modifier.width(16.dp))

                //location icon
                EventInfoChip(
                    iconRes = R.drawable.ic_location_filled,
                    title = event.venue,
                    subtitle = event.location,
                    whiteText = true
                )
            }

        }

    }
}