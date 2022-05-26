package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;


@Service
public class studentService {

    private final StudentRepository studentRepository;

   @Autowired
    public studentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }




    public List<student> getStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(student student) {
        Optional<student> studentOptional=studentRepository.findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        studentRepository.save(student);
    }
}
