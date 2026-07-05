package com.skills.todo.repository

import com.skills.todo.model.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepo : JpaRepository<Todo, Long> {
    // using jpa findById method so we don't need to define
//    That one interface gives you for free:
//
//    save() — create and update
//    findById() — get specific item
//    findAll() — get all items
//    deleteById() — delete specific item
}