package Microservices.Service1.controllers;

import Microservices.Service1.entities.Animal;
import Microservices.Service1.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    AnimalService animalService;
    @PostMapping("/animal")
    public String add(@RequestBody Animal animal){
        animalService.save(animal);
        return "added successfully";

    }
}
