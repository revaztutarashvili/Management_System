package com.example.demo.controller;

import com.example.demo.entity.user.UserRequest;
import com.example.demo.entity.user.UserResponse;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/user")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserResponse create(@RequestBody @Valid UserRequest userRequest){
        return userService.createUser(userRequest);
    }

    @GetMapping("/{userId}")
    public UserResponse view (@PathVariable("userId") Long userId){
        return userService.view(userId);
    }

}
