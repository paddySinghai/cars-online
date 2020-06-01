package com.cognizant.cars.service.impl;

import com.cognizant.cars.dto.GenericOutputDto;
import com.cognizant.cars.exception.CarsBusinessException;
import com.cognizant.cars.service.CarDetailsService;
import org.springframework.stereotype.Service;

@Service
public class CarDetailsServiceImpl implements CarDetailsService {
    @Override public GenericOutputDto fetchCarList() throws CarsBusinessException {
        return null;
    }
}
