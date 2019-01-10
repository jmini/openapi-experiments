package fr.jmini.openapi.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static LongEnumWithCustomName fromValue(String text) {
    for (LongEnumWithCustomName b : LongEnumWithCustomName.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


