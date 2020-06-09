package com.practice.project1.controllers;

import com.practice.project1.models.User;
import com.practice.project1.services.UserService;
import com.practice.project1.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(Constants.USER_END_POINT)
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService=userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user)
    {
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable(name="id") UUID uuid)
    {
        return userService.getUser(uuid);
    }
}
