package com.skills.todo.dto

data class TodoRequest(
    val title: String,
    val description: String,
    val status: Status
)
