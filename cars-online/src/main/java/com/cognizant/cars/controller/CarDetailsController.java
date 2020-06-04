package com.cognizant.cars.controller;

import com.cognizant.cars.dto.GenericOutputDto;
import com.cognizant.cars.exception.CarsBusinessException;
import com.cognizant.cars.service.CarDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/cars")
public class CarDetailsController {

  private final CarDetailsService carDetailsService;

  @Autowired
  public CarDetailsController(CarDetailsService carDetailsService) {
    this.carDetailsService = carDetailsService;
  }

  // @ApiOperation(value = "Fetch All Cars List")
  @GetMapping(
      value = "/carsList",
      headers = "Accept=application/json",
      produces = {MediaType.APPLICATION_JSON_VALUE})
  public GenericOutputDto fetchCarsList() throws CarsBusinessException {
    return carDetailsService.fetchCarsList();
  }
}
