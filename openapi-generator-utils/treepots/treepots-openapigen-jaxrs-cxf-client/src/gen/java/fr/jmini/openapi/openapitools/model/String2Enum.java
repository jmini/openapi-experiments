package fr.jmini.openapi.openapitools.model;



/**
 * Gets or Sets String2Enum
 */
public enum String2Enum {
  
  C("c"),
  
  B("b"),
  
  A("a");

  private String value;

  String2Enum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static String2Enum fromValue(String value) {
    for (String2Enum b : String2Enum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
  
}

