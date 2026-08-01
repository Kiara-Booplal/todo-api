package com.skills.todo.service

import com.skills.todo.dto.TodoRequest
import com.skills.todo.dto.TodoResponse
import com.skills.todo.exception.TodoException
import com.skills.todo.mapper.TodoMapper
import com.skills.todo.repository.TodoRepo
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class TodoService(
    private val todoRepo: TodoRepo,
    private val todoMapper: TodoMapper
) {
    fun createTodo(request: TodoRequest): TodoResponse{
        val entity = todoMapper.requestToModel(request)
        todoRepo.save(entity)
        return todoMapper.modelToResponse(entity)
    }

    fun displayAllTodos(): List<TodoResponse>{
        val entity = emptyList<TodoResponse>()
        return todoRepo.findAll().map { todoMapper.modelToResponse(it) }
    }

    fun displaySpecifiedTodo(id : Long): TodoResponse {
        val todo = todoRepo.findByIdOrNull(id) ?: throw TodoException(id)
        return todoMapper.modelToResponse(todo)
    }
}