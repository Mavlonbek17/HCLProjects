package com.example.mavlonbek.Repo;

import com.example.mavlonbek.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
