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
 * Gets or Sets String2Enum
 */
@JsonAdapter(String2Enum.Adapter.class)
public enum String2Enum {
  
  C("c"),
  
  B("b"),
  
  A("a");

  private String value;

  String2Enum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static String2Enum fromValue(String value) {
    for (String2Enum b : String2Enum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<String2Enum> {
    @Override
    public void write(final JsonWriter jsonWriter, final String2Enum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public String2Enum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return String2Enum.fromValue(value);
    }
  }
}

