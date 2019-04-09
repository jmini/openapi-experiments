package fr.jmini.openapi.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets Long2Enum
 */
public enum Long2Enum {
  
  NUMBER_20(20l),
  
  NUMBER_30(30l),
  
  NUMBER_40(40l);

  private Long value;

  Long2Enum(Long value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Long2Enum fromValue(Long value) {
    for (Long2Enum b : Long2Enum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
  
}

