package com.skills.todo.dto

import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.NotBlank

@Schema(description = "Represents a Todo Request")
data class TodoRequest(
    @field:NotBlank
    @field:Schema(description = "The title of the item that needs to be done")
    val title: String,

    @field:NotBlank
    @field:Schema(description = "The description of the item that needs to be done")
    val description: String,
)
