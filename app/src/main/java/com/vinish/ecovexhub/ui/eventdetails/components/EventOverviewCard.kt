package com.vinish.ecovexhub.ui.eventdetails.components

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
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.model.Event
import com.vinish.ecovexhub.model.EventCategory
import com.vinish.ecovexhub.model.EventStatus
import com.vinish.ecovexhub.ui.components.EventInfoChip

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun EventOverviewCard(
    event: Event = Event(
        id = 1,
        title = "Tree Plantation Drive",
        description = "Join us in our mission to make the camp greener and healthier. Together we can create a better environment For future generation ",
        category = EventCategory.DRIVE,
        status = EventStatus.UPCOMING,
        date = "05 Sep 2026",
        location = "Ecovex Ground",
        imageRes = R.drawable.img_saplings_banner,
        time = "8:00 AM"
    ),
    modifier: Modifier = Modifier
) {
    ElevatedCard(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Box() {
            Image(
                modifier = Modifier.align(Alignment.BottomEnd),
                painter = painterResource(R.drawable.img_overview_bg_gpt2),
                contentDescription = null,
                contentScale = ContentScale.Fit
            )


            //content column
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                //icon and heading
                Row(verticalAlignment = Alignment.CenterVertically) {
                    //plant icon
                    Icon(
                        painter = painterResource(R.drawable.ic_brand_sapling_new),
                        contentDescription = null,
                        tint = Color(0xFF598044)
                    )
                    Spacer(Modifier.width(4.dp))

                    //heading
                    Text(
                        text = "About this event",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold
                    )
                }

                //description
                Spacer(Modifier.height(8.dp))

                Text(
                    text = event.description,
                    style = MaterialTheme.typography.bodySmall,
                    lineHeight = 18.sp
                )

                // before divider
                Spacer(Modifier.height(15.dp))

                HorizontalDivider(thickness = 0.5.dp)

                // after divider
                Spacer(Modifier.height(8.dp))

                //Event Information section

                //heading
                Text(
                    text = "Event Information",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(Modifier.height(16.dp))


                EventInfoChip(
                    title = "Date & Time",
                    subtitle = "${event.date} • ${event.time}",
                    iconRes = R.drawable.ic_events_filled
                )
                Spacer(Modifier.height(12.dp))

                EventInfoChip(
                    title = "Venue",
                    subtitle = "${event.venue} • ${event.location}",
                    iconRes = R.drawable.ic_location_filled
                )
                Spacer(Modifier.height(12.dp))

                EventInfoChip(
                    title = "Registration Deadline",
                    subtitle = event.registrationDeadline,
                    iconRes = R.drawable.ic_update_clcok
                )
                Spacer(Modifier.height(12.dp))

                EventInfoChip(
                    title = "Organizer",
                    subtitle = event.organizer,
                    iconRes = R.drawable.ic_person
                )
                Spacer(Modifier.height(12.dp))

                EventInfoChip(
                    title = "Contact",
                    subtitle = event.contact,
                    iconRes = R.drawable.ic_call
                )
                Spacer(Modifier.height(12.dp))


            }
        }
    }
}

