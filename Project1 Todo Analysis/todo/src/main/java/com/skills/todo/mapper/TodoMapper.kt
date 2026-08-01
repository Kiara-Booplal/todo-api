package com.skills.todo.mapper

import com.skills.todo.dto.TodoRequest
import com.skills.todo.dto.TodoResponse
import com.skills.todo.dto.UpdateRequest
import com.skills.todo.model.Todo
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.MappingTarget
import org.mapstruct.NullValuePropertyMappingStrategy

@Mapper(componentModel = "spring",  nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE )
interface TodoMapper {

    @Mapping( target = "id", ignore = true)
    @Mapping( target = "createdAt",  expression = "java(java.time.LocalDateTime.now())")
    @Mapping( target = "updatedAt", ignore = true)
    @Mapping(target = "status" , expression = "java(com.skills.todo.dto.Status.TODO)")
    fun requestToModel(request: TodoRequest): Todo

    fun modelToResponse(todo: Todo): TodoResponse

    fun updateRequestToModel(updateRequest: UpdateRequest,  @MappingTarget todo: Todo): Todo
}