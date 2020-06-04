package com.cognizant.cars.dto;

import com.cognizant.cars.dto.model.Car;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GenericOutputDto {

  private List<Car> carsList;
  private String errorCode;
  private String errorMessage;
}
