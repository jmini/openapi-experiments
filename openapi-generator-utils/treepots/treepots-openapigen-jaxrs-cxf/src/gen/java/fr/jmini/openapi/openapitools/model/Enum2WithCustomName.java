package fr.jmini.openapi.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets Enum2WithCustomName
 */
public enum Enum2WithCustomName {
  
  FOO(1),
  
  BAR(2);

  private Integer value;

  Enum2WithCustomName(Integer value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Enum2WithCustomName fromValue(Integer value) {
    for (Enum2WithCustomName b : Enum2WithCustomName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
  
}

