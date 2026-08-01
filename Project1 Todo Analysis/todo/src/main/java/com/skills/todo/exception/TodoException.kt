package com.skills.todo.exception

class TodoException(
    val resourceId: Any,
    message: String = "The Todo resource with ID $resourceId was not found in the database ",
): RuntimeException(message)