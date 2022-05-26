package com.example.practise_project.controllers;


import com.example.practise_project.entity.User;
import com.example.practise_project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("Myname","Mavlonbek");
        return "index";
    }


    @GetMapping("register")
    public String register(Model model){
        return "register";
    }

    @GetMapping("/login/{loginType}")

    public String login(Model model, @PathVariable("loginType") String type){

        if(type.equals("user")){
            return "user";
        }else if(type.equals("admin")){
            return "admin";
        }else{
            return "login";
        }

//        model.addAttribute("loginType",type);
//        return "login";
    }

//
//    @GetMapping("/login/admin")
//    public String adminlogin(Model model){
//        return "admin";
//    }
//
//
//
//
//    @GetMapping("/login/user")
//    public String userlogin(Model model){
//        return "user";
//    }
fd

    @GetMapping("/home")
    public String home(Model model){
        return "home";
    }




    @GetMapping("/submit")
    public String submit(Model model, @RequestParam("username") String username, String password){


        model.addAttribute("username",username);
        model.addAttribute("password",password);
        return "submit";
    }




    @PostMapping("/save")
    public String save(Model model,@RequestParam("name") String username,@RequestParam("password") String password,@RequestParam("email")String email){
        model.addAttribute("username",username);
        model.addAttribute("password",password);
        model.addAttribute("email",email);

        User user = new User();
        user.setEmail(email);
        user.setName(username);
        user.setPassword(password);

        userService.save(user);
        model.addAttribute("id",user.getId()+" User");
        return "save";
    }





}
