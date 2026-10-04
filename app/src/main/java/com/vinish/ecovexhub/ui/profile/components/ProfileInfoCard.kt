package com.vinish.ecovexhub.ui.profile.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.theme.BorderStoke
import com.vinish.ecovexhub.theme.EcovexGreen
import com.vinish.ecovexhub.theme.IconGreen
import com.vinish.ecovexhub.theme.ProfileBgFillColor

@Composable
fun ProfileInfoCard(modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.cardElevation(1.dp),
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        // main card column
        Column(

            modifier = Modifier
                .padding(24.dp)
                .fillMaxSize()
        ) {
            // profile pic, profile details
            Row() {
                // profile picture
                Box {
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .background(ProfileBgFillColor)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.profile_boy),
                            contentDescription = "Profile pic",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop
                        )

                    }
                    //bg
                    Box(
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .size(34.dp)
                            .clip(CircleShape)
                            .background(
                                EcovexGreen
                            )
                            .border(width = 1.5.dp, color = Color.White, shape = CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_photo_camera_filled),
                            contentDescription = "Change profile picture",
                            tint = Color.White,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }

                Spacer(Modifier.width(20.dp))

                // right side of profile picture
                Column(
                    verticalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Text(
                        text = "Vinish ",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold
                    )

//                    Spacer(Modifier.height(6.dp))

                    Text(
                        text = "🌿 Member",
                        color = EcovexGreen,
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.W500,
                        modifier = Modifier
                            .background(
                                color = Color(0xFFEAF6E6),
                                shape = RoundedCornerShape(50)
                            )
                            .padding(
                                horizontal = 8.dp,
                                vertical = 4.dp
                            )
                    )
//                    Spacer(Modifier.height(6.dp))

                    ProfileInfoRow(
                        info = "CSE 3rd Year",
                        icon = R.drawable.ic_school
                    )

                    ProfileInfoRow(
                        info = "SJEC",
                        icon = R.drawable.ic_location
                    )

                    ProfileInfoRow(
                        info = "Since 2026",
                        icon = R.drawable.ic_calendar_clock
                    )


                }
            }
            Spacer(Modifier.height(20.dp))
            HorizontalDivider()
            Spacer(Modifier.height(18.dp))

            OutlinedButton(
                onClick = {},
                modifier = Modifier.align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(24.dp),
                border = BorderStroke(color = Color(0xFFCAE3CA), width = 1.5.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_edit),
                    contentDescription = null,
                    tint = EcovexGreen
                )

                Spacer(Modifier.width(8.dp))

                Text(
                    text = "Edit Profile",
                    color = EcovexGreen,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}

@Preview
@Composable
private fun ProfileCardPreview() {
    ProfileInfoCard()
}

@Composable
private fun ProfileInfoRow(
    info: String,
    icon: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painterResource(icon),
            contentDescription = null,
            tint = IconGreen,
            modifier = Modifier.size(18.dp)
        )

        Spacer(Modifier.width(14.dp))

        Text(
            text = info,
            style = MaterialTheme.typography.bodySmall,
            fontWeight = FontWeight.W500,
            color = Color.Gray
        )
    }
}