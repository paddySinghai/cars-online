package com.cognizant.cars.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Exception class for Cars Online Module
 *
 * @author Padmalaya Singhai
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarsBusinessException extends Exception {

  private String errorCode;
  private String errorMessage;
}
