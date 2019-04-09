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

  public static IntEnum fromValue(Integer value) {
    for (IntEnum b : IntEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
  
}

