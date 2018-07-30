package fr.jmini.openapi.openapitools.model;



/**
 * Gets or Sets IntEnum
 */
public enum IntEnum {
  
  NUMBER_1(1),
  
  NUMBER_2(2),
  
  NUMBER_3(3);

  private Integer value;

  IntEnum(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IntEnum fromValue(String text) {
    for (IntEnum b : IntEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
  
}

