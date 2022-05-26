package com.example.mavlonbek.service;


import com.example.mavlonbek.Repo.UserRepository;
import com.example.mavlonbek.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void save(User user)
    {
        userRepository.save(user);
    }


}
