package com.workintech.zoo.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class KangarooException extends RuntimeException {

    private HttpStatus status;

    public KangarooException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
