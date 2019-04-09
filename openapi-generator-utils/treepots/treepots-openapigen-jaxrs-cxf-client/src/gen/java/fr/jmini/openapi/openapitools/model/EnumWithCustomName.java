package fr.jmini.openapi.openapitools.model;



/**
 * Gets or Sets EnumWithCustomName
 */
public enum EnumWithCustomName {
  
  FOO(1),
  
  BAR(2);

  private Integer value;

  EnumWithCustomName(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumWithCustomName fromValue(Integer value) {
    for (EnumWithCustomName b : EnumWithCustomName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
  
}

