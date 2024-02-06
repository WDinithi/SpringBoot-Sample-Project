package com.example.springbootpractice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v/user")
@CrossOrigin
public class UserController {
    @GetMapping("/getUser")
    public String getUser(){
        return "Dinithi";
    }

    @PostMapping("/getUserPost")
    public String getPost(){
        return "Dinithi1";
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
