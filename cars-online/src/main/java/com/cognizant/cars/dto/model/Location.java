package com.cognizant.cars.dto.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
/**
 * Dto for Location Details
 *
 * @author Padmalaya Singhai
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Location implements Serializable {
  @ApiModelProperty(value = "Latitude Value")
  private String lat;

  @ApiModelProperty(value = "Longitude Value")
  @JsonAlias(value = "long")
  private String longitude;
}
