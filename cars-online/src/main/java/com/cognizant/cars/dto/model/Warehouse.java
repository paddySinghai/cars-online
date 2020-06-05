package com.cognizant.cars.dto.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.io.Serializable;
/**
 * Dto for Warehouse Details
 *
 * @author Padmalaya Singhai
 */
@Document
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Warehouse implements Serializable {
  @ApiModelProperty(value = "Object Id")
  @MongoId
  private ObjectId id;

  @ApiModelProperty(value = "Warehouse name")
  private String name;

  @ApiModelProperty(value = "Location Details")
  private Location location;
}
