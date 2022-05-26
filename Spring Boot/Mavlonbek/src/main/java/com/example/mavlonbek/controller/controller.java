package com.example.mavlonbek.controller;


import com.example.mavlonbek.entity.User;
import com.example.mavlonbek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {

    @Autowired
    UserService userService;


    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("myname","Mavlonek");
        return "index";
    }

    @GetMapping("/register")
    public String register(Model model){
        return "register";
    }


    @PostMapping("/save")
    public String save(Model model, @RequestParam("name")String name,@RequestParam("surname")String surname,@RequestParam("email")String email,@RequestParam("password")String password){
        model.addAttribute("password",password);
        model.addAttribute("email",email);
        model.addAttribute("name",name);
        model.addAttribute("surname",surname);


        User user = new User();
        user.setName(name);
        user.setSurname(surname);
        user.setEmail(email);
        user.setPassword(password);

        userService.save(user);
        model.addAttribute("id",user.getId()+" The user Id");
        return "save";

    }




}
