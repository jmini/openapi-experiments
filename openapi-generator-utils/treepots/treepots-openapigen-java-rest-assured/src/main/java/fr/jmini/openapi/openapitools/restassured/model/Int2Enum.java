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


package fr.jmini.openapi.openapitools.restassured.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Int2Enum
 */
@JsonAdapter(Int2Enum.Adapter.class)
public enum Int2Enum {
  
  NUMBER_1(1),
  
  NUMBER_2(2),
  
  NUMBER_3(3);

  private Integer value;

  Int2Enum(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
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

  public static class Adapter extends TypeAdapter<Int2Enum> {
    @Override
    public void write(final JsonWriter jsonWriter, final Int2Enum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Int2Enum read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return Int2Enum.fromValue(value);
    }
  }
}
