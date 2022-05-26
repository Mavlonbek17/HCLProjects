package com.example.practise_project.entity;


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

    @Size(min=4,max = 20,message = "Name should have minimum 4 and max 20 characters")
    String name;



    @Email(message = "Invalid email")
    @Column(unique = true)
    String email;


    @Size(min = 4,max = 20,message = "Password should have minimum 4 and max 20 characters")

    String password;

    String resume;


}
