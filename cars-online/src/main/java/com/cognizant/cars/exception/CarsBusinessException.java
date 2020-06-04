package com.cognizant.cars.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarsBusinessException extends Exception {

  private String errorCode;
  private String errorMessage;
}
