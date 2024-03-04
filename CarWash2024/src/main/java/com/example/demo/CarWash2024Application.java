package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages =
{"com.example.demo",
 "com.example.model"
})
public class CarWash2024Application {

	public static void main(String[] args) {
		SpringApplication.run(CarWash2024Application.class, args);
	}

}
