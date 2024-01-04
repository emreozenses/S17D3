package com.workintech.zoo.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class KoalaException extends RuntimeException{

    HttpStatus status;

    public KoalaException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
