package com.tweetero.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.api.dto.UserDTO;
import com.tweetero.api.model.User;
import com.tweetero.api.repository.UserRepository;

@RestController
@RequestMapping("/api/sign-up")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    void signUp(@RequestBody UserDTO req) {
        repository.save(new User(req));
    }

}
