package com.skills.todo.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "This represents the fields a user is able to modify")
data class UpdateRequest(
    @field:Schema(description = "The title of the item that needs to be done")
    val title: String,

    @field:Schema(description = "The description of the item that needs to be done")
    val description: String,

    @field:Schema(description = "The default status ")
    val status: Status
)
