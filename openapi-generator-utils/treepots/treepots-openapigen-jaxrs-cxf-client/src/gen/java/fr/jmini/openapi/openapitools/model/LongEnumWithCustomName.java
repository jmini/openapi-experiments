package fr.jmini.openapi.openapitools.model;



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
  public String toString() {
    return String.valueOf(value);
  }

  public static LongEnumWithCustomName fromValue(Long value) {
    for (LongEnumWithCustomName b : LongEnumWithCustomName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
  
}

