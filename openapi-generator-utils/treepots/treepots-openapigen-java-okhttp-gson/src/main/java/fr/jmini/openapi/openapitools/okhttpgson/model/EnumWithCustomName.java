/*
 * OpenAPI Tree Pots
 * Example spec
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.jmini.openapi.openapitools.okhttpgson.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets EnumWithCustomName
 */
@JsonAdapter(EnumWithCustomName.Adapter.class)
public enum EnumWithCustomName {
  
  FOO(1),
  
  BAR(2);

  private Integer value;

  EnumWithCustomName(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
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

  public static class Adapter extends TypeAdapter<EnumWithCustomName> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumWithCustomName enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumWithCustomName read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return EnumWithCustomName.fromValue(String.valueOf(value));
    }
  }
}

