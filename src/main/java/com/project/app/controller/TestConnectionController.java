package com.project.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class TestConnectionController {

    @GetMapping("/api/v1test")
    public String testConnection(){
        return "connect success";
    }
}
