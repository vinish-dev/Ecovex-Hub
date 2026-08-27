package com.vinish.ecovexhub.data.fake

import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.model.ClubMember

val clubMembers = listOf<ClubMember>(
    ClubMember(
        name = "Aarav Sharma",
        role = "President",
        profileRes = R.drawable.profile_boy
    ),
    ClubMember(
        name = "Sophia Chen",
        role = "Vice President",
        profileRes = R.drawable.profile_woman
    ),
    ClubMember(
        name = "Marcus Johnson",
        role = "Lead Developer",
        profileRes = R.drawable.profile_student
    ),
    ClubMember(
        name = "Elena Rostova",
        role = "Design Lead",
        profileRes = R.drawable.profile_girlnice
    ),
    ClubMember(
        name = "Devon Vance",
        role = "Event Coordinator",
        profileRes = R.drawable.profile_girlgood
    )
)
