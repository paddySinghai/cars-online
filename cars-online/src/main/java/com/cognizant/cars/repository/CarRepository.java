package com.cognizant.cars.repository;

import com.cognizant.cars.dto.model.Car;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository to fetch cars list and cars Details
 *
 * @author Padmalaya Singhai
 */
@Repository
public interface CarRepository extends MongoRepository<Car, ObjectId> {}
