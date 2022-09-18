package com.example.cicd_test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdController {


    @GetMapping("/health")
    public ResponseEntity<String> healthcheck(){
        return ResponseEntity.ok("check please");
    }

}
