package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Demo {
    @GetMapping("/")
    public String home() {
        return "Hello from Spring Web!";
    }

  }
