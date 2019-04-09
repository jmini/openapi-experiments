package fr.jmini.openapi.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets LongEnum
 */
public enum LongEnum {
  
  NUMBER_20(20l),
  
  NUMBER_30(30l),
  
  NUMBER_40(40l);

  private Long value;

  LongEnum(Long value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LongEnum fromValue(Long value) {
    for (LongEnum b : LongEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


