package fr.jmini.openapi.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets EnumWithCustomName
 */
public enum EnumWithCustomName {
  
  FOO(1),
  
  BAR(2);

  private Integer value;

  EnumWithCustomName(Integer value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EnumWithCustomName fromValue(String text) {
    for (EnumWithCustomName b : EnumWithCustomName.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


