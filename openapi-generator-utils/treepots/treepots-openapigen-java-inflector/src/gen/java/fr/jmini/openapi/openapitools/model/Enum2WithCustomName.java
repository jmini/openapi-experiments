package fr.jmini.openapi.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static Enum2WithCustomName fromValue(String text) {
    for (Enum2WithCustomName b : Enum2WithCustomName.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


