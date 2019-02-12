package fr.jmini.openapi.openapitools.model;



/**
 * Gets or Sets Enum2WithCustomName
 */
public enum Enum2WithCustomName {
  
  FOO(1),
  
  BAR(2);

  private Integer value;

  Enum2WithCustomName(Integer value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Enum2WithCustomName fromValue(String text) {
    for (Enum2WithCustomName b : Enum2WithCustomName.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
  
}

