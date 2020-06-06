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
import org.springframework.data.domain.Sort;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ExtendWith({MockitoExtension.class})
public class CarDetailsServiceTest {

  @Mock
  private CarRepository carRepository;

  @InjectMocks
  private CarDetailsServiceImpl carDetailsService;

  @Test
  public void testFetchCarList() throws CarsBusinessException {
    // given
    Car car1 =
        Car.builder()
            .make("Volkswagen")
            .model("Jetta III")
            .year_model(1995)
            .date_added(LocalDate.parse("2020-01-08"))
            .build();
    Car car2 =
        Car.builder()
            .make("Volkswagen")
            .model("Jetta III")
            .year_model(2000)
            .date_added(LocalDate.parse("2019-01-08"))
            .build();
    List<Car> expected = List.of(car1, car2);
    // when
    Mockito.when(carRepository.findAll(Sort.by("date_added").descending())).thenReturn(expected);
    GenericOutputDto actual = carDetailsService.fetchCarsList();
    // then
    Assertions.assertEquals(actual.getCars(), expected);
    Assertions.assertEquals(actual.getCars().get(0), car1);
  }

  @Test
  public void testFetchCarListException() throws CarsBusinessException {
    // given
    List<Car> expected = new ArrayList<>();
    // when
    Mockito.when(carRepository.findAll(Sort.by("date_added").descending())).thenReturn(expected);
    // then
    Assertions.assertThrows(
        CarsBusinessException.class,
        () -> {
          carDetailsService.fetchCarsList();
        },
        "No cars present!");
  }
}
