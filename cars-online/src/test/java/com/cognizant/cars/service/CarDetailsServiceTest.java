package com.cognizant.cars.service;

import com.cognizant.cars.dto.GenericOutputDto;
import com.cognizant.cars.dto.model.Car;
import com.cognizant.cars.exception.CarsBusinessException;
import com.cognizant.cars.repository.CarRepository;
import com.cognizant.cars.service.impl.CarDetailsServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith({MockitoExtension.class}) public class CarDetailsServiceTest {

    @Mock private CarRepository carRepository;

    @InjectMocks private CarDetailsServiceImpl carDetailsService;

    @Test public void testFetchCarList() throws CarsBusinessException {
        Car car1 = Car.builder().make("Volkswagen").model("Jetta III").year_model(1995).build();
        Car car2 = Car.builder().make("Volkswagen").model("Jetta III").year_model(2000).build();
        List<Car> expected = List.of(car1, car2);
        Mockito.when(carRepository.findAll()).thenReturn(expected);
        GenericOutputDto actual = carDetailsService.fetchCarsList();
        Assertions.assertEquals(actual.getCars(), expected);
    }

    @Test public void testFetchCarListException() throws CarsBusinessException {
        List<Car> expected = new ArrayList<>();
        Mockito.when(carRepository.findAll()).thenReturn(expected);
        Assertions.assertThrows(CarsBusinessException.class, () -> {
            carDetailsService.fetchCarsList();
        }, "No cars present!");
    }
}
