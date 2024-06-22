package com.example.testpsycho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.testpsycho.entities")
public class TestpsychoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestpsychoApplication.class, args);
	}

}
