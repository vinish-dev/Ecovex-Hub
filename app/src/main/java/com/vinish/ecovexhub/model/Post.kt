package com.vinish.ecovexhub.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.theme.IconBg
import java.time.LocalDateTime

data class Post(
    val id: Int,
    val title: String,
    val description: String,
    val type: PostType,
    val imageRes: Int? = null,
    val createdAt: LocalDateTime,
    val views: Int,
    val likes: Int,
    val status: PostStatus
)

enum class PostStatus {
    PUBLISHED,
    DRAFT
}