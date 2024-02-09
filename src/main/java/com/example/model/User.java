package com.example.model;

import lombok.Getter;
import lombok.Setter;

public class User {

    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String password;
    @Getter
    @Setter
    private String firstName;
    @Getter
    @Setter
    private String lastName;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
