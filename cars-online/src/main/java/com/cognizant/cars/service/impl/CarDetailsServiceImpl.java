package com.cognizant.cars.service.impl;

import com.cognizant.cars.dto.GenericOutputDto;
import com.cognizant.cars.dto.model.Car;
import com.cognizant.cars.exception.CarsBusinessException;
import com.cognizant.cars.repository.CarRepository;
import com.cognizant.cars.service.CarDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarDetailsServiceImpl implements CarDetailsService {

  private final CarRepository carRepository;

  @Autowired
  public CarDetailsServiceImpl(CarRepository carRepository) {
    this.carRepository = carRepository;
  }

  @Override
  public GenericOutputDto fetchCarsList() throws CarsBusinessException {
    List<Car> carsList = carRepository.findAll();
    if (carsList.isEmpty()) {
      throw new CarsBusinessException("NO_CARS_PRESENT", "No cars present!");
    }
    return GenericOutputDto.builder().carsList(carsList).build();
  }
}
