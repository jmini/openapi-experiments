/*
 * OpenAPI Tree Pots
 * Example spec
 *
 * The version of the OpenAPI document: 1.0.0
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
 * Gets or Sets Enum2WithCustomName
 */
@JsonAdapter(Enum2WithCustomName.Adapter.class)
public enum Enum2WithCustomName {
  
  FOO(1),
  
  BAR(2);

  private Integer value;

  Enum2WithCustomName(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Enum2WithCustomName fromValue(Integer value) {
    for (Enum2WithCustomName b : Enum2WithCustomName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Enum2WithCustomName> {
    @Override
    public void write(final JsonWriter jsonWriter, final Enum2WithCustomName enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Enum2WithCustomName read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return Enum2WithCustomName.fromValue(value);
    }
  }
}

