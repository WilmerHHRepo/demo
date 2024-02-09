package com.example.model.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

public class ErrorRes {

    @Getter
    @Setter
    HttpStatus httpStatus;
    @Getter
    @Setter
    String message;

    public ErrorRes(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }
}
