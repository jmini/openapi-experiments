package fr.jmini.openapi.openapitools.model;



/**
 * Gets or Sets Int2Enum
 */
public enum Int2Enum {
  
  NUMBER_1(1),
  
  NUMBER_2(2),
  
  NUMBER_3(3);

  private Integer value;

  Int2Enum(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Int2Enum fromValue(String text) {
    for (Int2Enum b : Int2Enum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
  
}

