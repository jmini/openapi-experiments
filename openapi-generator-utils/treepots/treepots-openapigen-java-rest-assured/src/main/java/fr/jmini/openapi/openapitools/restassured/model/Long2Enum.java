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
 * Gets or Sets Long2Enum
 */
@JsonAdapter(Long2Enum.Adapter.class)
public enum Long2Enum {
  
  NUMBER_20(20l),
  
  NUMBER_30(30l),
  
  NUMBER_40(40l);

  private Long value;

  Long2Enum(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Long2Enum fromValue(Long value) {
    for (Long2Enum b : Long2Enum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Long2Enum> {
    @Override
    public void write(final JsonWriter jsonWriter, final Long2Enum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Long2Enum read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return Long2Enum.fromValue(value);
    }
  }
}

