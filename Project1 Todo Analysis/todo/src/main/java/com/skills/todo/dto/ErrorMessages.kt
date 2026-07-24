package com.skills.todo.dto


data class ErrorMessage(
    val code: Int,
    val httpStatus: String,
    val message: String?
)
