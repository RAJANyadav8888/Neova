package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoOrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOrmApplication.class, args);
		System.out.println("started.");
	}

}
