package com.cognizant.cars.exception;

import com.cognizant.cars.dto.GenericOutputDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Exception Handler for Cars Online Module
 *
 * @author Padmalaya Singhai
 */
@ControllerAdvice
public class CarsExceptionController {

  @ExceptionHandler(CarsBusinessException.class)
  public ResponseEntity<Object> exception(CarsBusinessException exception) {
    GenericOutputDto outputDto = new GenericOutputDto();
    outputDto.setErrorCode(exception.getErrorCode());
    outputDto.setErrorMessage(exception.getErrorMessage());
    return ResponseEntity.badRequest().body(outputDto);
  }
}
