package com.spring.userdept.controllers;

import com.spring.userdept.entities.User;
import com.spring.userdept.repositories.UserReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserReposity reposity;

    @GetMapping
    public List<User> findAll() {
        List<User> result = reposity.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        User result = reposity.findById(id).get();
        return result;
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        User result = reposity.save(user);
        return result;
    }
}
