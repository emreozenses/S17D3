package com.workintech.zoo.exceptions;

import org.springframework.http.HttpStatus;

public class KangarooValidation {

    private static final String ID_IS_NOT_VALID = "Id must bet greater than 0";

    public static void isIdNotValid(long id){
        if (id <= 0){
            throw new KangarooException(ID_IS_NOT_VALID, HttpStatus.BAD_REQUEST);
        }
    }



}
