package com.vinish.ecovexhub.ui.profile.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import com.vinish.ecovexhub.theme.BorderStoke
import com.vinish.ecovexhub.theme.IconBg
import com.vinish.ecovexhub.theme.IconGreen

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun UserPreferenceCard(modifier: Modifier = Modifier) {

    Card(
        modifier = modifier.fillMaxWidth(),
        border = BorderStroke(color = BorderStoke, width = 1.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
        ) {
            PreferenceCardItem(
                icon = R.drawable.ic_badge,
                title = "My Badges",
                subtitle = "View the badges you have earned"
            )
            PreferenceCardItem(
                icon = R.drawable.ic_notification,
                title = "Notifications",
                subtitle = "Manage your notification preferences "
            )
            PreferenceCardItem(
                icon = R.drawable.ic_account_circle,
                title = "Account ",
                subtitle = "Manage Personal information ",
                isLast = false
            )

            PreferenceCardItem(
                icon = R.drawable.ic_privacy_tip,
                title = "Privacy & Security",
                subtitle = "Manage your privacy and security settings ",
                isLast = false
            )

            PreferenceCardItem(
                icon = R.drawable.ic_about,
                title = "About Ecovex",
                subtitle = "Learn more about our mission ",
                isLast = true
            )
        }
    }
}

@Composable
fun PreferenceCardItem(
    icon: Int,
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier,
    isLast: Boolean = false
) {
    Row(
        modifier = Modifier.fillMaxWidth().clickable(onClick = {}),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = modifier
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xD9EFF4E8))
                .size(42.dp),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                painter = painterResource(icon),
                contentDescription = null,
                modifier = Modifier.size(20.dp),
                tint = IconGreen
            )
        }
        Spacer(Modifier.width(20.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )

            Text(
                text = subtitle,
                style = MaterialTheme.typography.bodyMedium,
                fontSize = 13.sp,
                color = Color.Gray,
                fontWeight = FontWeight.W500
            )

            if (!isLast) {
                HorizontalDivider()
            }
        }


        Icon(
            modifier = Modifier.align(Alignment.CenterVertically),
            painter = painterResource(R.drawable.ic_arrow_right),
            contentDescription = null,
            tint = IconGreen
        )


    }
}
