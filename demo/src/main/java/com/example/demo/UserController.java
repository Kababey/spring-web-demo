package com.example.demo;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
public class UserController {
    @PostMapping("/user")
    public void user(@Valid @RequestBody User user){
        System.out.println(user);
    }
}
