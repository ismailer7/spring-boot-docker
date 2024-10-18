package com.github.actions.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class HelloController {

    @GetMapping("/test")
    String hello() {
        return "Hello From Azure.";
    }

}
