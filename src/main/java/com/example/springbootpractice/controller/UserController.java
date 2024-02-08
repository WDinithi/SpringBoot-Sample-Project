package com.example.springbootpractice.controller;

import com.example.springbootpractice.dto.UserDto;
import com.example.springbootpractice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<UserDto> getUser(){
        return userService.getAllUser();
    }

    @PostMapping("/getUserSave")
    public UserDto saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }


    @PutMapping("/getUserUpdate")
    public UserDto updateUser(@RequestBody UserDto userDto){
        return userService.updateUser(userDto);
    }

    @DeleteMapping("/getUserDelete")
    public boolean deleteUser(@RequestBody UserDto userDto){
        return userService.deleteUser(userDto);
    }
}
