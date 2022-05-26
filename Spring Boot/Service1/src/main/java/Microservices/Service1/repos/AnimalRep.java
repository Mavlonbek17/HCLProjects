package Microservices.Service1.repos;

import Microservices.Service1.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRep extends JpaRepository<Animal,Long>{
}
