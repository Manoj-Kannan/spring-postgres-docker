package com.example.SpringPostgresDocker.controller;

import com.example.SpringPostgresDocker.Students;
import com.example.SpringPostgresDocker.respository.StudentsRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentsRepo studentsRepo;

    @GetMapping("/")
    public String greet() {
        return "Hello World!!";
    }

    @GetMapping("/getStudents")
    public List<Students> studentsList() {
        return studentsRepo.findAll();
    }

    @RequestMapping("/addStudent")
    public String addStudent() {
        Students s = new Students();
        s.setName("Kumar");
        s.setAge(26);
        s.setGrade("E");

        studentsRepo.save(s);
        return "Added new student";
    }
}
