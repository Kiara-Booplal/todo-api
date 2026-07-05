package com.skills.todo.model

import com.skills.todo.dto.Status
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime


@Entity
@Schema(description = "This represents the data object that gets stored into the database")
data class Todo(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @field:Schema(description = "The uniques id of the todo item")
    val id: Long,

    @field:Schema(description = "The title of the item that needs to be done")
    var title: String,

    @field:Schema(description = "The description of the item that needs to be done")
    var description: String,

    @CreationTimestamp
    @field:Schema(description = "The date the item was created")
    val createdAt: LocalDateTime,

    @UpdateTimestamp
    @field:Schema(description = "The date the item was modified")
    var updatedAt: LocalDateTime? = null,// for now at any field change we will update, later we will get it to change only when the status is DONE

    @field:Schema(description = "The current status of the item")
    var status: Status = Status.TODO
)
