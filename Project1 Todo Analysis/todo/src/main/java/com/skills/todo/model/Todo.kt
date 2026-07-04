package com.skills.todo.model

import com.skills.todo.dto.Status
import java.util.Date


data class Todo(
    val id: Int,
    val title: String,
    val description: String,
    val createdAt: Date,
    val updatedAt: Date?, // this will be populated when the status is changed to DONE
    val status: Status = Status.TODO
)
