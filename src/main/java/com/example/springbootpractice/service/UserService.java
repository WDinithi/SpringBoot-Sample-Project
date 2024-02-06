package com.example.springbootpractice.service;

import com.example.springbootpractice.dto.UserDto;
import com.example.springbootpractice.entity.User;
import com.example.springbootpractice.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
@Autowired
    private UserRepo userRepo;
@Autowired
    private ModelMapper modelMapper;

public UserDto saveUser(UserDto userDto){
    userRepo.save(modelMapper.map(userDto, User.class));
    return userDto;
}
}
