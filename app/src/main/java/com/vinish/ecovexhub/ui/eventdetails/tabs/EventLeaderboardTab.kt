package com.vinish.ecovexhub.ui.eventdetails.tabs

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.data.fake.eventList
import com.vinish.ecovexhub.model.Event
import com.vinish.ecovexhub.theme.BorderStoke
import com.vinish.ecovexhub.theme.IconBg
import com.vinish.ecovexhub.theme.IconGreen
import com.vinish.ecovexhub.ui.eventdetails.components.LeaderboardList
import com.vinish.ecovexhub.ui.eventdetails.components.PodiumSection

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun EventLeaderboardTab(
    event: Event = eventList[3],
    modifier: Modifier = Modifier
) {
    //todo: viewmodel
    val leaderboards = event.leaderboard.sortedByDescending { it.points }
    val topThree = leaderboards.take(3)
    val remaining = leaderboards.drop(3)

    Card(
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(width = 1.dp, color = BorderStoke)
    ) {
        Column(
            modifier = modifier.fillMaxWidth()
        ) {

            // header
            LeaderboardHeader(modifier = Modifier.padding(16.dp))


            PodiumSection(topThree = topThree)

            LeaderboardList(entries = remaining, modifier = Modifier.padding(horizontal = 16.dp))
        }
    }

}

@Composable
private fun LeaderboardHeader(modifier: Modifier = Modifier){
    Row(modifier = modifier) {
        //icon
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clip(RoundedCornerShape(999.dp))
                .size(48.dp)
                .background(color = IconBg)
        )
        {
            Icon(
                painter = painterResource(R.drawable.ic_trophy_filled),
                contentDescription = null,
                tint = IconGreen,
                modifier = Modifier.size(32.dp)
            )
        }
        Spacer(Modifier.width(8.dp))
        //content

        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
            Text(text = "Leaderboard", style = MaterialTheme.typography.titleSmall)

            Text(text = "Top contributors making the camp!")
        }
    }
}