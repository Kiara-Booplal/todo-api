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
            message = errorMessage.joinToString(", ")
        )
        return ResponseEntity.badRequest()
            .body(body)
    }

    @ExceptionHandler(value = [Exception::class])
    fun handleException(ex: Exception): ResponseEntity<ErrorMessage> {
        val body = ErrorMessage(
            code = HttpStatus.INTERNAL_SERVER_ERROR.value(),
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR.name,
            message ="An unexpected error  has occured while processing the request"
        )
        return ResponseEntity.internalServerError()
            .body(body)
    }
    @ExceptionHandler(value = [TodoException::class])
    fun handleResopurceNotFoundException(ex: TodoException): ResponseEntity<ErrorMessage> {
        val body = ErrorMessage(
            code = HttpStatus.NOT_FOUND.value(),
            httpStatus = HttpStatus.NOT_FOUND.name,
            message = ex.message
        )
        return ResponseEntity(body, HttpStatus.NOT_FOUND)
    }
}