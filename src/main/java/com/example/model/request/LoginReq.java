package com.example.model.request;

import lombok.Getter;
import lombok.Setter;

public class LoginReq {

    @Getter
    @Setter
    private String email;
     @Getter
     @Setter
     private String password;

    public LoginReq(String email, String password) {
        this.email = email;
        this.password = password;
    }


}
