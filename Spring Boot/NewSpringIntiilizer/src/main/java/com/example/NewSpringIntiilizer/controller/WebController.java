package com.example.NewSpringIntiilizer.controller;

import com.example.NewSpringIntiilizer.entity.User;
import com.example.NewSpringIntiilizer.service.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.*;


@Controller
public class WebController {


    @Autowired
    WebService webService;

    @GetMapping("/")
    public String register(Model model) {
        model.addAttribute("errorMessage", null);
        model.addAttribute("applicationName", "Form");
        return "login";
    }




    @PostMapping("/submit")
    public String submit(@Valid User user, BindingResult binding, Model model, @RequestParam("myfile") MultipartFile file) throws IOException{
        if (binding.hasErrors()) {
            model.addAttribute("errorMessage", binding);
            return "login";


        } else {
            String mylocation = System.getProperty("user.dir") + "/src/main/resources/static/";
            String filename = file.getOriginalFilename();

            File mySavedFile = new File(mylocation + filename);

            InputStream inputStream = file.getInputStream();

            OutputStream outputStream = new FileOutputStream(mySavedFile);

            int read = 0;
            byte[] bytes = new byte[1024];

            while ((read = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, read);
            }
           user.setImg_link("http://localhost:8080/" + filename);
            webService.saveUser(user);
            return "redirect:/";
        }
    }


}
