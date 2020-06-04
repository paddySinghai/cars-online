package com.cognizant.cars.service;

import com.cognizant.cars.dto.GenericOutputDto;
import com.cognizant.cars.exception.CarsBusinessException;

public interface CarDetailsService {
    public GenericOutputDto fetchCarsList() throws CarsBusinessException;
}
