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

  public static Int2Enum fromValue(Integer value) {
    for (Int2Enum b : Int2Enum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
  
}

