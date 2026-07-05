package com.skills.todo.contoller


import com.skills.todo.dto.TodoRequest
import com.skills.todo.dto.TodoResponse
import com.skills.todo.dto.UpdateRequest
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
class TodoController {

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    fun createTodo(@RequestBody request: TodoRequest): TodoResponse {

        return TODO("Provide the return value")
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    fun getTodos(): List<TodoResponse>{

        return TODO("Provide the return value")
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getTodo(@PathVariable id: Long): TodoResponse {

        return TODO("Provide the return value")
    }

   @PatchMapping("/{id}")
   @ResponseStatus(HttpStatus.OK)
   fun updateTodo(@PathVariable id: Long, @RequestBody request: UpdateRequest): TodoResponse {

       return TODO("Provide the return value")
   }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteTodo(@PathVariable id: Long) {

        return TODO("Provide the return value")
    }
}