package com.skills.todo.dto

import io.swagger.v3.oas.annotations.media.Schema
import java.util.Date

@Schema(description = "This represents the response returned to the  user")
data class TodoResponse(
    @field:Schema(description = "The uniques id of the todo item")
    val id: Int,

    @field:Schema(description = "The title of the todo item")
    val title: String,

    @field:Schema(description = "The description of what the item is about")
    val description: String,

    @field:Schema(description = "The current status of the item")
    val status: Status,

    @field:Schema(description = "The date the item was created")
    val createdAt: Date,

    @field:Schema(description = "The date the item was modified")
    val updatedAt: Date,
)
