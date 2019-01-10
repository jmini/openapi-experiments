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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LongModel
 */

public class LongModel {
  public static final String SERIALIZED_NAME_LONG1 = "Long1";
  @SerializedName(SERIALIZED_NAME_LONG1)
  private Long long1;

  public static final String SERIALIZED_NAME_LONG2 = "Long2";
  @SerializedName(SERIALIZED_NAME_LONG2)
  private Long long2;

  public LongModel long1(Long long1) {
    this.long1 = long1;
    return this;
  }

   /**
   * Get long1
   * @return long1
  **/
  @ApiModelProperty(value = "")
  public Long getLong1() {
    return long1;
  }

  public void setLong1(Long long1) {
    this.long1 = long1;
  }

  public LongModel long2(Long long2) {
    this.long2 = long2;
    return this;
  }

   /**
   * Get long2
   * @return long2
  **/
  @ApiModelProperty(value = "")
  public Long getLong2() {
    return long2;
  }

  public void setLong2(Long long2) {
    this.long2 = long2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongModel longModel = (LongModel) o;
    return Objects.equals(this.long1, longModel.long1) &&
        Objects.equals(this.long2, longModel.long2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(long1, long2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongModel {\n");
    sb.append("    long1: ").append(toIndentedString(long1)).append("\n");
    sb.append("    long2: ").append(toIndentedString(long2)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

