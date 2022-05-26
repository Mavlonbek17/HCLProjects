package com.example.demo.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StudentRepository
        extends JpaRepository<student,Long> {
    @Query("Select s From student s where s.email = ?1 ")
    Optional<student> findStudentByEmail(String email);

}
