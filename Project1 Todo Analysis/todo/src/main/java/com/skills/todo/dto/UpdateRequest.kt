package com.skills.todo.dto

data class UpdateRequest(
    val title: String,
    val description: String,
    val status: Status
)
