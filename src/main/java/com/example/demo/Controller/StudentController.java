package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.UserService;


@RestController
public class StudentController {
    @Autowired
    private UserService service;
     
    @GetMapping("/users")
    public List<Student> listAll() {
        List<Student> students = service.get_all();
        return students;
        
    }
     
}
