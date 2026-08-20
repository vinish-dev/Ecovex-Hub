package com.vinish.ecovexhub.ui.eventdetails.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
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
import com.vinish.ecovexhub.data.fake.leaderboard
import com.vinish.ecovexhub.model.LeaderboardEntry
import com.vinish.ecovexhub.theme.EcovexGreen
import com.vinish.ecovexhub.theme.IconGreen

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LeaderboardRows(
    entries: List<LeaderboardEntry> = leaderboard, modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        LeaderboardCardHeader()

        Spacer(Modifier.height(12.dp))

        entries.forEachIndexed { index, entry ->

            LeaderboardCardRow(entry = entry, rank = index + 4, modifier = Modifier.padding(8.dp))

            // don't show divider for last row
            if (index != entries.lastIndex) {
                HorizontalDivider(color = Color.LightGray, thickness = 0.5.dp)
            }
        }

        Spacer(Modifier.height(8.dp))

    }


}

@Composable
private fun LeaderboardCardHeader(modifier: Modifier = Modifier) {
    // font color
    val style = Color.Gray

    Row(
        modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Rank", color = style)

        Text("Team / Participant", color = style)

        Text("Points", color = style)
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun LeaderboardCardRow(
    modifier: Modifier = Modifier, entry: LeaderboardEntry = leaderboard[0], rank: Int = 4
) {
    Row(
        modifier = modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
    ) {
        //rank text
        Box(modifier = Modifier.width(40.dp)) {
            Text(
                text = rank.toString(),
                style = MaterialTheme.typography.titleMedium,
                color = EcovexGreen
            )
        }


        //profile icon box
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(999.dp))
                .background(color = Color(0xFFEFF4E8))
                .size(36.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(entry.avatarIconRes),
                contentDescription = null,
            )
        }
        Spacer(Modifier.width(10.dp))
        Text(text = entry.name, fontWeight = FontWeight.W400, style = MaterialTheme.typography.titleSmall )

        Spacer(Modifier.weight(1f))

        //end points text
        Text(
            text = entry.points.toString(),
            color = EcovexGreen,
            style = MaterialTheme.typography.titleMedium
        )

    }
}