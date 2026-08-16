package com.vinish.ecovexhub.ui.eventdetails.components

import android.R.attr.bottom
import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.model.EventHighlight
import com.vinish.ecovexhub.model.LeaderboardEntry
import com.vinish.ecovexhub.theme.EcovexGreen
import com.vinish.ecovexhub.theme.IconGreen

// for podium column and avatar
data class PodiumStyle(
    val avatarSize: Dp,
    val podiumHeight: Dp,
    val badgeColor: Color,
    val borderColor: Color,
    val podiumColor: Color
)

// select style based on rank
fun podiumStyleFor(rank: Int): PodiumStyle {
    return when (rank) {
        1 -> PodiumStyle(
            avatarSize = 90.dp,
            podiumHeight = 120.dp,
            borderColor = GoldColor,
            badgeColor = GoldColor,
            podiumColor = GoldPodium
        )

        2 -> PodiumStyle(
            avatarSize = 80.dp,
            podiumHeight = 90.dp,
            borderColor = SilverColor,
            badgeColor = SilverColor,
            podiumColor = SilverPodium
        )

        3 -> PodiumStyle(
            avatarSize = 80.dp,
            podiumHeight = 70.dp,
            borderColor = BronzeColor,
            badgeColor = BronzeColor,
            podiumColor = BronzePodium
        )

        else -> error("Podium style only supports ranks 1-3")
    }
}

@Composable
fun PodiumSection(
    topThree: List<LeaderboardEntry>,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.Bottom
    ) {

        PodiumColumn(user = topThree[1], modifier = Modifier.weight(1f), rank = 2)
        PodiumColumn(user = topThree[0], modifier = Modifier.weight(1f), rank = 1)
        PodiumColumn(user = topThree[2], modifier = Modifier.weight(1f), rank = 3)
    }

}


@Composable
private fun PodiumColumn(
    modifier: Modifier = Modifier,
    user: LeaderboardEntry,
    rank: Int
) {

    val style = podiumStyleFor(rank)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        // crown for 1st place
        if (rank == 1) {
            Text(
                text = "\uD83D\uDC51",
                fontSize = 28.sp,
                modifier = Modifier.padding(bottom = 4.dp)
            )
        }

        // Avatar + Rank Badge Overlay
        Box(
            contentAlignment = Alignment.BottomCenter,
            modifier = Modifier.padding(bottom = 12.dp) // creates floating effect
        ) {
            //frame
            Box(
                modifier = Modifier
                    .size(style.avatarSize)
                    .clip(CircleShape)
                    .background(Color.White)
                    .border(width = 5.dp, color = style.borderColor, shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                //avatar
                Image(
                    painter = painterResource(user.avatarIconRes),
                    contentDescription = user.name,
//                    tint = IconGreen,
                    modifier = Modifier.size(style.avatarSize * 0.55f)
                )

            }

            //rank badge at bottom
            Box(
                modifier = Modifier
                    .offset(y = 12.dp)
                    .size(32.dp)
                    .clip(CircleShape)
                    .background(style.badgeColor),
                contentAlignment = Alignment.Center //centers the rank number
            ) {
                Text(
                    text = rank.toString(),
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
            }
        }
        Spacer(Modifier.height(10.dp))
        //podium block
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(style.podiumHeight)
                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                .background(style.podiumColor)
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // username and points on the podium block
            Text(
                text = user.name,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.W500,
                fontSize = if (rank == 1) 15.sp else 13.sp,
                color = Color.Black
            )

            Spacer(Modifier.height(4.dp))

            Text(
                text = "%,d pts".format(user.points),
                fontWeight = FontWeight.SemiBold,
                fontSize = if (rank == 1) 14.sp else 12.sp,
                color = EcovexGreen
            )

        }
    }

}