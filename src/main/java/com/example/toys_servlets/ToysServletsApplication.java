package com.example.toys_servlets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ToysServletsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToysServletsApplication.class, args);
	}

}
