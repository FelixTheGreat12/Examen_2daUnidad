package com.example.examen_ii.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "comment")
data class CommentEntity(
    @PrimaryKey(autoGenerate = false) val id: Int,
    val postId: Int,
    val name: String,
    val email: String,
    val body: String
)
