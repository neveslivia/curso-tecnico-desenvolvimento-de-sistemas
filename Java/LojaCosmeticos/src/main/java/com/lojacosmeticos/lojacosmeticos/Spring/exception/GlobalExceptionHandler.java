package com.lojacosmeticos.lojacosmeticos.Spring.exception;

import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

        @ExceptionHandler(Exception.class)
        public ResponseEntity<String> handleGenericException(Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Erro interno do servidor: " + ex.getMessage());
        }

        @ExceptionHandler(ValidationException.class)
        public ResponseEntity<String> handleValidationException(ValidationException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Erro de validação: " + ex.getMessage());
        }

        @ExceptionHandler(EntityNotFoundException.class)
        public ResponseEntity<String> handleEntityNotFoundException(EntityNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Entidade não encontrada: " + ex.getMessage());
        }

        @ExceptionHandler(org.springframework.validation.BindException.class)
        public ResponseEntity<String> handleBindException(BindingResult bindingResult) {
            StringBuilder sb = new StringBuilder();
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                sb.append(fieldError.getField()).append(" : ").append(fieldError.getDefaultMessage()).append("\n");
            }
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Erro de validação nos campos: \n" + sb.toString());
        }
    }


