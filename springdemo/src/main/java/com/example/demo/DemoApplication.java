package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {
	public record Student(String name, Integer age) {}

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(DemoApplication.class, args);

//		ObjectMapper objectMapper = new ObjectMapper();
//
//		String json = objectMapper.writeValueAsString(new Student("Mary", 21));
//		System.out.println(json);
//
//		Student object = objectMapper.readValue("{\"name\":\"Mary\",\"age\":21}", Student.class);
//		System.out.println(object);
	}
}
