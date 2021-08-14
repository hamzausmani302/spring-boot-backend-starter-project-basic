package com.example.demo.Contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contoller {
    
    @GetMapping("/")
    public String getAllTopics(){
        return "<h1>hamza usmani</h1>";
    }
    

}
