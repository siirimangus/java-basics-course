package com.example.demo.controllers;

import com.example.demo.dto.HelloDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public HelloDto hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        String message = String.format("Hello %s!", name);

        return new HelloDto(message);
    }
}
