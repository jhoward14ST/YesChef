package com.jhoward14ST.YesChef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class YesChefApplication {

	public static void main(String[] args) {
		SpringApplication.run(YesChefApplication.class, args);
	}

	@GetMapping("/")
	public String apiRoot() {
		return "Welcome to the YesChef API";
	}
}
