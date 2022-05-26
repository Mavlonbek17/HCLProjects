package com.example.NewSpringIntiilizer.service;

import com.example.NewSpringIntiilizer.entity.User;
import com.example.NewSpringIntiilizer.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebService {
    @Autowired
    UserRepo userRepo;

    public void saveUser(User user) {
        userRepo.save(user);
    }
}
