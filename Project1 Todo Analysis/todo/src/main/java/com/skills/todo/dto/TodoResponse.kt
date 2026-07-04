package com.skills.todo.dto

import java.util.Date

data class TodoResponse(
    val id: Int,
    val title: String,
    val description: String,
    val status: Status,
    val createdAt: Date,
    val updatedAt: Date,
)
