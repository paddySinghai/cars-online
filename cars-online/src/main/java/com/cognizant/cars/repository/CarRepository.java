package com.cognizant.cars.repository;

import com.cognizant.cars.dto.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car, String> {
}
