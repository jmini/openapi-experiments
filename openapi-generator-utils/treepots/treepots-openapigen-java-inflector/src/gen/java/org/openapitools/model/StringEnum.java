package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;



import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets StringEnum
 */
public enum StringEnum {
  
  C("c"),
  
  B("b"),
  
  A("a");

  private String value;

  StringEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static StringEnum fromValue(String text) {
    for (StringEnum b : StringEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


