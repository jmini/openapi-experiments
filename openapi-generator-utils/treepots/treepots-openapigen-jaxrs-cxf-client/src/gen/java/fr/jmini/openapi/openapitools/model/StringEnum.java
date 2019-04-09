package fr.jmini.openapi.openapitools.model;



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

  public static StringEnum fromValue(String value) {
    for (StringEnum b : StringEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
  
}

