package com.vinish.ecovexhub.ui.explore.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.data.fake.clubMembers
import com.vinish.ecovexhub.model.ClubMember
import com.vinish.ecovexhub.theme.ProfileBgFillColor


@Composable
fun ClubMemberCard(
    clubMember: ClubMember,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.size(width = 130.dp, height = 140.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
                    .background(ProfileBgFillColor)

            ) {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(clubMember.profileRes),
                    contentDescription = "Profile icon",
                    contentScale = ContentScale.Crop,
                )
            }
            Text(
                text = clubMember.name,
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                textAlign = TextAlign.Center
            )

            Text(
                text = clubMember.role,
                style = MaterialTheme.typography.bodySmall,
                color = Color.Gray
            )
        }
    }
}

@Preview
@Composable
fun ClubMemberCardPreview(modifier: Modifier = Modifier) {
    ClubMemberCard(
        clubMember = clubMembers[1]
    )
}