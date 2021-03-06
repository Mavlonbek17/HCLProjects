package com.example.practise_project.services;

import com.example.practise_project.entity.User;
import com.example.practise_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void save(User user){userRepository.save(user);}
}
