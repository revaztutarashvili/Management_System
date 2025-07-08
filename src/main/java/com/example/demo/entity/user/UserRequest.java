package com.example.demo.entity.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRequest {
    @NotBlank
    @Size(min = 8, max = 24, message = "userName characters: 8-24")
    private String userName;

    @NotBlank(message = "message can't be blank")
    @Size(min = 4, max = 12, message = "min 4 - max 12 characters ")
    private String name;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
