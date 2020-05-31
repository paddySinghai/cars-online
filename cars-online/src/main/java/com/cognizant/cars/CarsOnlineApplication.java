package com.cognizant.cars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.cognizant.cars")
public class CarsOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsOnlineApplication.class, args);
	}

}
