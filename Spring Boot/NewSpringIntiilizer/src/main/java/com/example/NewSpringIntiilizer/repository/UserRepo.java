package com.example.NewSpringIntiilizer.repository;

import com.example.NewSpringIntiilizer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long>{


}
