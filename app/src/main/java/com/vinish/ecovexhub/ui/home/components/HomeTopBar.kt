package com.vinish.ecovexhub.ui.home.components

import android.R.attr.text
import android.service.autofill.Validators.and
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import com.vinish.ecovexhub.theme.EcovexGreen

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeTopBar(
    onNotificationClick: () -> Unit,
    onProfileClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween

    ) {
//        app icon and name text
        Icon(
            painter = painterResource(R.drawable.ic_brand_sapling_new),
            contentDescription = null,
            tint = EcovexGreen
        )
        Spacer(Modifier.width(4.dp))
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