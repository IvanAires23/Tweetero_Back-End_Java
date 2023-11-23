package com.tweetero.api.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.api.dto.UserDTO;

@RestController
@RequestMapping("/sign-up")
public class UserController {

    String signUp(@RequestBody UserDTO req) {
        return "ok";
    }

}
