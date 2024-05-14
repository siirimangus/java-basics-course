package com.example.demo.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record StudentDto(
        @NotBlank
        String name,

        @NotNull
        @Min(16)
        Integer age
) { }
