package com.example.demo.Student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class studentController {


    private final studentService studentService;

    @Autowired

    public studentController(com.example.demo.Student.studentService studentService) {
        this.studentService =studentService;
    }

    @GetMapping
    public List<student> getStudents(){
        return studentService.getStudents();
    }


        @PostMapping
    public void registernewStudent(@RequestBody student student){
        studentService.addNewStudent(student);

    }
}
