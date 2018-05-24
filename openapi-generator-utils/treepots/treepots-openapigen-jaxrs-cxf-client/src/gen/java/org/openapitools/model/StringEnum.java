package org.openapitools.model;



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
  public String toString() {
    return String.valueOf(value);
  }

  public static StringEnum fromValue(String text) {
    for (StringEnum b : StringEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

