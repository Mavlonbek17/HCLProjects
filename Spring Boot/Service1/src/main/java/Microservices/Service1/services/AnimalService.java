package Microservices.Service1.services;

import Microservices.Service1.entities.Animal;
import Microservices.Service1.repos.AnimalRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {
    @Autowired
    AnimalRep animalRep;
    public void save(Animal animal){
        animalRep.save(animal);
    }

}
