package com.vinish.ecovexhub.ui.updates.components

import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.data.fake.postsList
import com.vinish.ecovexhub.model.Post
import com.vinish.ecovexhub.model.PostType
import com.vinish.ecovexhub.model.Update
import com.vinish.ecovexhub.theme.IconBg
import com.vinish.ecovexhub.theme.IconGreen
import java.time.LocalDate
import java.time.temporal.ChronoUnit

@Composable
fun PostCard(
    post: Post,
    onMoreClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    // calculate relative days
    val daysAgo = ChronoUnit.DAYS.between(
        post.createdAt.toLocalDate(),
        LocalDate.now()
    )

    Card(
        colors = CardDefaults.cardColors(containerColor = Color.White),
        modifier = modifier.height(140.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            //image and icon box
            Box(
                modifier = Modifier
                    .width(102.dp)
                    .fillMaxHeight()
                    .clip(RoundedCornerShape(12.dp))
                    .background(
                        if (post.imageRes == null){
                            post.type.bg
                        } else{
                            Color.Transparent
                        }
                    ),
                contentAlignment = Alignment.Center,
            ) {
                if (post.imageRes == null){
                    Icon(
                        painter = painterResource(post.type.icon),
                        contentDescription = null,
                        tint = post.type.tint.copy(alpha = 0.8f),
                        modifier = Modifier.size(42.dp)
                    )
                } else {
                    Image(
                        painter = painterResource(post.imageRes),
                        contentDescription = null,
                        contentScale = ContentScale.Crop
                    )
                }

            }

            //right side
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
            ) {
                //top row
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    PostTypeChip(type = post.type)
                    Spacer(Modifier.weight(1f))

                    IconButton(
                        modifier = Modifier.size(18.dp),
                        onClick = onMoreClick
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_moreoptions),
                            contentDescription = "More options",
                        )
                    }
                }

                Spacer(Modifier.height(6.dp))

                //title
                Text(
                    text = post.title,
                    style = MaterialTheme.typography.titleSmall,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )

                Spacer(Modifier.height(6.dp))

                //Description
                Text(
                    text = post.description,
                    style = MaterialTheme.typography.bodySmall,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )

                Spacer(Modifier.weight(1f))

                //bottom row
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "$daysAgo days ago", style = MaterialTheme.typography.bodySmall, color = Color.Gray)

                    Spacer(Modifier.weight(1f))

                    Icon(
                        painter = painterResource(R.drawable.ic_eye),
                        contentDescription = "Views",
                        tint = Color.Gray,
                        modifier = Modifier.size(18.dp)
                    )
                    Text(text = post.views.toString(), style = MaterialTheme.typography.bodySmall, color = Color.Gray,
                        modifier = Modifier.width(35.dp))


                    Icon(
                        painter = painterResource(R.drawable.ic_like),
                        contentDescription = "Likes",
                        tint = Color.Gray,
                        modifier = Modifier.size(18.dp)

                    )
                    Text(text = post.likes.toString(), style = MaterialTheme.typography.bodySmall, color = Color.Gray, modifier = Modifier.width(20.dp))
                }

            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun UpdateCardPreview() {
    PostCard(
        postsList[0],
        onMoreClick = {}
    )
}
