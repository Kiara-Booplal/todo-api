package com.skills.todo.contoller


import com.skills.todo.dto.TodoRequest
import com.skills.todo.dto.TodoResponse
import com.skills.todo.dto.UpdateRequest
import com.skills.todo.service.TodoService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/todo/items")
class TodoController(private val todoService: TodoService) {

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    fun createTodo(@Valid @RequestBody request: TodoRequest): TodoResponse {
        return todoService.createTodo(request)
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    fun getTodos(): List<TodoResponse> {

        return TODO("Provide the return value")
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getTodo(@PathVariable id: Long): TodoResponse {

        return TODO("Provide the return value")
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun updateTodo(@PathVariable id: Long, @Valid @RequestBody request: UpdateRequest): TodoResponse {

        return TODO("Provide the return value")
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteTodo(@PathVariable id: Long) {

        return TODO("Provide the return value")
    }
}