package com.vinish.ecovexhub.model

import androidx.compose.ui.graphics.vector.ImageVector
import java.time.LocalDateTime

data class Post(
    val id: Int,
    val title: String,
    val description: String,
    val type: PostType,
    val imageRes: Int? = null,
    val icon: ImageVector? = null,
    val createdAt: LocalDateTime,
    val views: Int,
    val likes: Int,
    val status: PostStatus
)


enum class PostType {
    ANNOUNCEMENT,
    EVENT
}

enum class PostStatus {
    PUBLISHED,
    DRAFT
}