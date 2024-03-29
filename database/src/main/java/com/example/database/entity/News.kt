package com.example.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class News(
    @PrimaryKey
    @ColumnInfo(name = "url") val url: String,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "author") val author: String?,
    @ColumnInfo(name = "publishedAt") val publishedAt: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "urlToImage") val urlToImage: String,
    @ColumnInfo(name = "title") val title: String
)