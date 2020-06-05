package com.cognizant.cars.dto.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
/**
 * Dto for Car Details
 *
 * @author Padmalaya Singhai
 */
@Document
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car implements Serializable {
  @ApiModelProperty(value = "Object Id")
  @MongoId
  private ObjectId id;

  @ApiModelProperty(value = "Make")
  private String make;

  @ApiModelProperty(value = "Model Details")
  private String model;

  @ApiModelProperty(value = "Year Model")
  private Integer year_model;

  @ApiModelProperty(value = "Price")
  private BigDecimal price;

  @ApiModelProperty(value = "If Licensed")
  private Boolean licensed;

  @ApiModelProperty(value = "Warehouse details")
  private List<Warehouse> warehouse;

  @ApiModelProperty(value = "Date Added")
  @JsonDeserialize(using = LocalDateDeserializer.class)
  @JsonSerialize(using = LocalDateSerializer.class)
  private LocalDate date_added;
}
