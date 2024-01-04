package com.workintech.zoo.exceptions;

import com.workintech.zoo.entity.Koala;
import org.springframework.http.HttpStatus;

import java.util.Map;

public class KoalaValidation {

    private static final String ID_IS_NOT_VALID = "Id must be greater than 0";
    private static final String KOALA_IS_NOT_EXIST = "The koala which has this id is not exist";

    public static void isIdNotValid(long id){
        if(id<=0){
            throw new KoalaException(ID_IS_NOT_VALID, HttpStatus.BAD_REQUEST);
        }
    }

    public static void isKoalaNotExist(Map<Long, Koala> koalaMap, long id){
        if(!koalaMap.containsKey(id)){
            throw new KoalaException(KOALA_IS_NOT_EXIST,HttpStatus.NOT_FOUND);
        }
    }
}
