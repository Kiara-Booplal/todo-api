package com.skills.todo.dto

import io.swagger.v3.oas.annotations.media.Schema
import org.jetbrains.annotations.NotNull

@Schema(description = "Represents a Todo Request")
data class TodoRequest(
    @NotNull
    @field:Schema(description = "The title of the item that needs to be done")
    val title: String,

    @NotNull
    @field:Schema(description = "The description of the item that needs to be done")
    val description: String,

    @NotNull
    @field:Schema(description = "The default status ")
    val status: Status
)
