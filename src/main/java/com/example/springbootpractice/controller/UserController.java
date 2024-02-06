package com.example.springbootpractice.controller;

import com.example.springbootpractice.dto.UserDto;
import com.example.springbootpractice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser(){
        return "Dinithi";
    }

    @PostMapping("/getUserPost")
    public UserDto saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }


    @PutMapping("/getUserPut")
    public String getPut(){
        return "Dinithi2";
    }

    @DeleteMapping("/getUserPut")
    public String getDelete(){
        return "Dinithi3";
    }
}
