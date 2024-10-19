package com.github.actions.controllers;

import com.github.actions.services.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/v1")
@RestController
public class HelloController {

    private final FileService fileService;

    @GetMapping("/test")
    String hello() {
        return fileService.greeting();
    }

}
