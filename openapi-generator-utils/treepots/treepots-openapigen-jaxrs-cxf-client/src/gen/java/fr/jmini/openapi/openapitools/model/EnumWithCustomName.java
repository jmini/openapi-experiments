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

  public static EnumWithCustomName fromValue(String text) {
    for (EnumWithCustomName b : EnumWithCustomName.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
  
}

