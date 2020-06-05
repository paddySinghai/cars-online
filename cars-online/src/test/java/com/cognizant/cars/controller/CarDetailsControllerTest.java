package com.cognizant.cars.controller;

import com.cognizant.cars.dto.GenericOutputDto;
import com.cognizant.cars.dto.model.Car;
import com.cognizant.cars.service.CarDetailsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Test Class Implementation for CarDetailsController
 *
 * @author Padmalaya Singhai
 */
@AutoConfigureMockMvc
@ContextConfiguration(classes = {CarDetailsController.class})
@WebMvcTest
public class CarDetailsControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private CarDetailsService carDetailsService;

  @Test
  public void tesFetchCarList() throws Exception {
    Car car1 = Car.builder().make("Volkswagen").model("Jetta III").year_model(1995).build();
    Car car2 = Car.builder().make("Volkswagen").model("Jetta III").year_model(2000).build();
    List<Car> expected = List.of(car1, car2);
    GenericOutputDto outputDto = GenericOutputDto.builder().cars(expected).build();
    given(carDetailsService.fetchCarsList()).willReturn(outputDto);
    mockMvc.perform(get("/cars/carsList")).andExpect(status().isOk());
  }
}
