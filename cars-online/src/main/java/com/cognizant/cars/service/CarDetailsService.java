package com.cognizant.cars.service;

import com.cognizant.cars.dto.GenericOutputDto;
import com.cognizant.cars.exception.CarsBusinessException;

/**
 * Interface class containing methods to fetch cars List and cara Details
 *
 * @author Padmalaya Singhai
 */
public interface CarDetailsService {
  /**
   * Method to fetch cars List
   *
   * @return output - GenericOutputDto - Object of GenericOutputDto containing list of cars
   * @throws CarsBusinessException throws CarsBusinessException
   */
  public GenericOutputDto fetchCarsList() throws CarsBusinessException;
}
