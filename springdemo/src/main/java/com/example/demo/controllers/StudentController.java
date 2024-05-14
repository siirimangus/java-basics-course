package com.example.demo.controllers;

import com.example.demo.dto.StudentDto;
import com.example.demo.dto.StudentResponseDto;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @PostMapping("/student")
    public StudentResponseDto postStudent(@Valid @RequestBody StudentDto student) {
        return new StudentResponseDto("Student object is valid");
    }
}
