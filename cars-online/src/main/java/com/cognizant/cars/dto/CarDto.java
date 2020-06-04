package com.cognizant.cars.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {
  private String make;

  private String model;

  private Integer year_model;

  private BigDecimal price;

  private Boolean licensed;
}
