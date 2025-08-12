package com.example.listgridcompose

data class Video(
    val videoTitle: String,
    val views: Int,
    val timeAgo: String
)

data class VideoCategory(
    val id: Int,
    val name: String
)