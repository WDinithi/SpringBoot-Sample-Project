package com.example.springbootpractice.service;

import com.example.springbootpractice.dto.UserDto;
import com.example.springbootpractice.entity.User;
import com.example.springbootpractice.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    public UserDto saveUser(UserDto userDto) {
        userRepo.save(modelMapper.map(userDto, User.class));
        return userDto;
    }

    public List<UserDto> getAllUser() {
        List<User> userList = userRepo.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDto>>() {
        }.getType());
    }
    public UserDto updateUser(UserDto userDto) {
        userRepo.save(modelMapper.map(userDto, User.class));
        return userDto;
    }

    public boolean deleteUser(UserDto userDto){
        userRepo.delete(modelMapper.map(userDto, User.class));
        return true;
    }
}