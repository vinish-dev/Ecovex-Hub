package com.vinish.ecovexhub.data.fake

import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.model.Post
import com.vinish.ecovexhub.model.PostStatus
import com.vinish.ecovexhub.model.PostType
import java.time.LocalDateTime

val postsList = listOf<Post>(
    Post(
        id = 1,
        title = "New Challenge",
        description = "Grow a plant challenge is live! Pick up your free flower seeds from the club room.",
        type = PostType.ANNOUNCEMENT,
        createdAt = LocalDateTime.of(2026,8,22,10,30),
        views = 120,
        imageRes = R.drawable.img_saplings_banner,
        likes = 35,
        status = PostStatus.PUBLISHED
    ),
    Post(
        id = 2,
        title = "Weekly Meeting",
        description = "Don't forget the sync call today at 4:00 PM in Conference Room B.",
        type = PostType.REMINDER,
        createdAt = LocalDateTime.of(2026,8,20,10,30),
        views = 100,
        likes = 20,
        status = PostStatus.PUBLISHED
    ),
    Post(
        id = 3,
        title = "World Environment Day Talk",
        description = "An inspiring talk by environmentalist Dr. Neha lyer on sustainable living.",
        type = PostType.ANNOUNCEMENT,
        createdAt = LocalDateTime.of(2026,8,18,6,30),
        views = 58,
        likes = 19,
        status = PostStatus.PUBLISHED
    ),
    Post(
        id = 4,
        title = "Winner Announcement",
        description = "Congratulations to Eco Legend for securing 1st place in the Green Roots Challenge!",
        type = PostType.WINNER,
        createdAt = LocalDateTime.of(2026,8,1,6,30),
        views = 33,
        likes = 13,
        status = PostStatus.PUBLISHED
    ),
    Post(
        id = 5,
        title = "Project Proposal Submission",
        description = "Final draft submission closes tonight at 11:59 PM sharp.",
        type = PostType.DEADLINE,
        createdAt = LocalDateTime.of(2026,7,18,6,30),
        views = 88,
        likes = 39,
        status = PostStatus.PUBLISHED
    ),
)