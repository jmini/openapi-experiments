package fr.jmini.openapi.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets LongEnumWithCustomName
 */
public enum LongEnumWithCustomName {
  
  TWENTY(20l),
  
  THIRTY(30l),
  
  FORTY(40l);

  private Long value;

  LongEnumWithCustomName(Long value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LongEnumWithCustomName fromValue(Long value) {
    for (LongEnumWithCustomName b : LongEnumWithCustomName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


