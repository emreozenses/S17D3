package com.workintech.zoo.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.ControllerAdvice;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class KangarooErrorResponse {
    private int status;
    private String message;
    private long timeStamp;
}
