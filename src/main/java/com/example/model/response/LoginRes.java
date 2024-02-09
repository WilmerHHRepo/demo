package com.example.model.response;

import lombok.Getter;
import lombok.Setter;

public class LoginRes {
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String token;

    public LoginRes(String email, String token) {
        this.email = email;
        this.token = token;
    }
}
