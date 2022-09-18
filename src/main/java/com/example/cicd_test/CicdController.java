package com.example.cicd_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdController {

    @GetMapping("/")
    public String healthChck(){
        return "health";
    }

}
