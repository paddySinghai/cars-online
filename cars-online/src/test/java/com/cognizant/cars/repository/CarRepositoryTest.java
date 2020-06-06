package com.cognizant.cars.repository;

import com.cognizant.cars.dto.model.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataMongoTest
public class CarRepositoryTest {

  @Autowired
  private CarRepository carRepository;

  @Test
  public void testFetchCarList() {
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
    carRepository.saveAll(expected);
    // when
    List<Car> actual = carRepository.findAll();
    // then
    assertThat(actual).isNotEmpty();
  }

  @Test
  public void testFetchCarDetails() {
    // given
    Car car =
        Car.builder()
            .make("Volkswagen")
            .model("Jetta III")
            .year_model(1995)
            .date_added(LocalDate.parse("2020-01-08"))
            .build();
    carRepository.save(car);
    // when
    Optional<Car> actual = carRepository.findById(car.getId());
    // then
    assertTrue(actual.isPresent());
    assertEquals(actual.get(), car);
  }
}
