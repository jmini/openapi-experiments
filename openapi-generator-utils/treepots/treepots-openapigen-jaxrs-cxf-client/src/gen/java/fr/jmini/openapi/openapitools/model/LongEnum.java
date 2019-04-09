package fr.jmini.openapi.openapitools.model;



/**
 * Gets or Sets LongEnum
 */
public enum LongEnum {
  
  NUMBER_20(20l),
  
  NUMBER_30(30l),
  
  NUMBER_40(40l);

  private Long value;

  LongEnum(Long value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LongEnum fromValue(Long value) {
    for (LongEnum b : LongEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
  
}

