package com.neoteric.HotelManningMahiDev.exceptions;

import org.hibernate.TransientObjectException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmailAlreadyTakenException.class)
    public ResponseEntity<ErrorResponse> handleEmailExistException(EmailAlreadyTakenException ex) {
        ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(), HttpStatus.NOT_ACCEPTABLE.value(), "use different gmail", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(NoCredentialsFoundException.class)
    public ResponseEntity<ErrorResponse> NoCredentialsFoundException(NoCredentialsFoundException ex) {
        ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(), HttpStatus.NOT_ACCEPTABLE.value(), "check  the Credentials", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(TransientObjectException.class)
    public ResponseEntity<ErrorResponse> TransientObjectException(TransientObjectException e){
        ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(), HttpStatus.NOT_ACCEPTABLE.value(), "check the object saving in the service", e.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_ACCEPTABLE);
    }

    //    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<ErrorResponse>  MethodArgumentNotValidException(MethodArgumentNotValidException ex){
//        ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(),HttpStatus.NOT_ACCEPTABLE.value(),"invalid details",ex.getMessage());
//        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_ACCEPTABLE);
//    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationException(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error ->
                errors.put(error.getField(), error.getDefaultMessage())
        );

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
//@ExceptionHandler(MethodArgumentNotValidException.class)
//public ResponseEntity<Map<String, String>> handleValidationException(MethodArgumentNotValidException ex) {
//    Map<String, String> errors = new HashMap<>();
//
//    ex.getBindingResult().getFieldErrors().forEach(error -> {
//        errors.put(error.getField(), error.getDefaultMessage());
//        // Log the error to see if it's getting captured
//        System.out.println("Error field: " + error.getField() + ", message: " + error.getDefaultMessage());
//    });
//
//    return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
//}

//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ErrorResponse>  handleException(Exception ex) {
//        ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR.value(), "Internal Server Error", ex.getMessage());
//        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
    }
