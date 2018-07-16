package org.openapitools.model;



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

  public static LongEnum fromValue(String text) {
    for (LongEnum b : LongEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

