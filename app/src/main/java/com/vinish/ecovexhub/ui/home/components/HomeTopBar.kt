package com.vinish.ecovexhub.ui.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeTopBar(
//    onNotificationClick: () -> Unit,
//    onProfileClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween

    ) {
        //app name text
        Text(
            text = "Ecovex",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = " Hub",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF479a40)
        )

        //push icons to end
        Spacer(modifier = Modifier.weight(1f))

        //right most icons
        IconButton(onClick = {}) {
            Icon(
                painter = painterResource(R.drawable.ic_notification),
                contentDescription = "Notifications"
            )
        }
        IconButton(onClick = {}) {
            Icon(
                painter = painterResource(R.drawable.ic_profile),
                contentDescription = "Profile"
            )
        }
    }


}