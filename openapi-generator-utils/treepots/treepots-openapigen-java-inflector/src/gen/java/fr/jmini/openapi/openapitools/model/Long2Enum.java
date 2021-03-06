package fr.jmini.openapi.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static Long2Enum fromValue(String text) {
    for (Long2Enum b : Long2Enum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


