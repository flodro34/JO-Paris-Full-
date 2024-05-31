package com.fdr.users_microservice.controllers;

import com.fdr.users_microservice.entities.User;
import com.fdr.users_microservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")

public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("all")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

}
