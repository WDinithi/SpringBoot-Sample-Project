package com.example.springbootpractice.repo;

import com.example.springbootpractice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
