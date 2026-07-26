package com.vinish.ecovexhub.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.theme.EcovexGreen

//todo: pass onClick

@Preview(showBackground = true, showSystemUi = true, apiLevel = 35)
@Composable
fun TreeExplorerCard(
//    onScanClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    //main card
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(180.dp),
        shape = RoundedCornerShape(16.dp)
    ) {

        //banner image layer
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(R.drawable.bg_banner_tree),
                contentDescription = "Scan Tree QR Banner",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            //scrim( dark overlay for readability)
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .background(Color.Black.copy(alpha = 0.20f))
            )

            //content layer
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 20.dp, horizontal = 22.dp),
                verticalArrangement = Arrangement.SpaceBetween // item spacing
            ) {
                Column {
                    Text(
                        text = "Tree Explorer",
                        style = MaterialTheme.typography.titleLarge,
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Scan QR codes around campus\nto discover amazing trees.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.White.copy(alpha = 0.9f),
                        fontWeight = FontWeight.Light
                    )
                }

                //scan button
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(Color.White),
                    contentPadding = PaddingValues(horizontal = 20.dp, vertical = 8.dp)
                ) {
                    Text(text = "Scan Now", color = EcovexGreen)

                    Spacer(Modifier.width(8.dp))

                    Icon(
                        painter = painterResource(R.drawable.ic_qr_scanner),
                        contentDescription = null,
                        modifier = Modifier.size(18.dp),
                        tint = EcovexGreen
                    )

                }
            }
        }


    }
}