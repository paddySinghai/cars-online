package com.cognizant.cars.dto;

import com.cognizant.cars.dto.model.Car;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.List;

/**
 * Generic output dto for Cars Online Module
 *
 * @author Padmalaya Singhai
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GenericOutputDto {
  @ApiModelProperty(value = "List of cars Available")
  private List<Car> cars;

  @ApiModelProperty(value = "error Code")
  private String errorCode;

  @ApiModelProperty(value = "error Message")
  private String errorMessage;
}
