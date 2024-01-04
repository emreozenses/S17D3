package com.workintech.zoo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<KangarooErrorResponse> handleException(KangarooException kangarooException){
        KangarooErrorResponse errorResponse = new KangarooErrorResponse(kangarooException.getStatus().value(), kangarooException.getMessage(),System.currentTimeMillis());
        return new ResponseEntity<>(errorResponse,kangarooException.getStatus());
    }

    @ExceptionHandler
    public ResponseEntity<KoalaErrorResponse> handleException(KoalaException koalaException){
        KoalaErrorResponse errorResponse = new KoalaErrorResponse(koalaException.getStatus().value(), koalaException.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(errorResponse,koalaException.getStatus());
    }


    @ExceptionHandler
    public ResponseEntity<KangarooErrorResponse> handleException(Exception exception){
        KangarooErrorResponse errorResponse = new KangarooErrorResponse(HttpStatus.BAD_REQUEST.value(), exception.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }
}
