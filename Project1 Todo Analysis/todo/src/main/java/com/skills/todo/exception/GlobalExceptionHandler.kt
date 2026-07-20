package com.skills.todo.exception

import com.skills.todo.dto.ErrorMessage
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(value = ([MethodArgumentNotValidException::class]))
    fun handleBadRequest(ex: MethodArgumentNotValidException): ResponseEntity<ErrorMessage> {
        val errorCode = ex.statusCode.value()
        val errorMessage = ex.fieldErrors.map{ "${it.field} : ${it.defaultMessage}" }
        val errorHttpStatus = HttpStatus.BAD_REQUEST.name
        val body = ErrorMessage(
            code = errorCode,
            httpStatus = errorHttpStatus,
            message = errorMessage
        )
        return ResponseEntity.badRequest()
            .body(body)
    }
}