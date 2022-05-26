package com.example.mavlonbek.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;


    @Size(min = 4,max = 30,message = "Name should be less than 30 chars or bigger than 4 char")
    String name;

    @Size(min = 4,max = 30,message = "Name should be less than 30 chars or bigger than 4 char")
    String surname;


    @Email(message = "Invalid email")
    @Column(unique = true)
    String email;


    @Size(min = 4,max = 30,message = "Name should be less than 30 chars or bigger than 4 char")
    String password;





}
