package com.vinish.ecovexhub.data.fake

import com.vinish.ecovexhub.model.PostType
import com.vinish.ecovexhub.model.Update

val updatesList = listOf<Update>(

    Update(
        id = "1",
        title = "New Challenge",
        description = "Grow a plant challenge is live! Pick up your free flower seeds from the club room.",
        time = "2h ago",
        type = PostType.ANNOUNCEMENT
    ),
    Update(
        id = "2",
        title = "Weekly Meeting",
        description = "Don't forget the sync call today at 4:00 PM in Conference Room B.",
        time = "15m ago",
        type = PostType.REMINDER
    ),
    Update(
        id = "3",
        title = "Hackathon Winner Announcement",
        description = "Congratulations to Team Alpha for securing 1st place in the AI Challenge!",
        time = "1d ago",
        type = PostType.WINNER
    ),
    Update(
        id = "4",
        title = "Project Proposal Submission",
        description = "Final draft submission closes tonight at 11:59 PM sharp.",
        time = "3h ago",
        type = PostType.DEADLINE
    )
)
