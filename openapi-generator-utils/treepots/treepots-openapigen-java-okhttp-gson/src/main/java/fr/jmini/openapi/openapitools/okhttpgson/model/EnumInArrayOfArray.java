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
import java.util.ArrayList;
import java.util.List;

/**
 * EnumInArrayOfArray
 */

public class EnumInArrayOfArray {
  /**
   * Gets or Sets p1
   */
  @JsonAdapter(P1Enum.Adapter.class)
  public enum P1Enum {
    VALA("valA"),
    
    VALB("valB"),
    
    VALC("valC");

    private String value;

    P1Enum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static P1Enum fromValue(String value) {
      for (P1Enum b : P1Enum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<P1Enum> {
      @Override
      public void write(final JsonWriter jsonWriter, final P1Enum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public P1Enum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return P1Enum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_P1 = "p1";
  @SerializedName(SERIALIZED_NAME_P1)
  private List<P1Enum> p1 = null;

  /**
   * Gets or Sets p2
   */
  @JsonAdapter(P2Enum.Adapter.class)
  public enum P2Enum {
    VAL1("val1"),
    
    VAL2("val2"),
    
    VAL3("val3");

    private String value;

    P2Enum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static P2Enum fromValue(String value) {
      for (P2Enum b : P2Enum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<P2Enum> {
      @Override
      public void write(final JsonWriter jsonWriter, final P2Enum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public P2Enum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return P2Enum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_P2 = "p2";
  @SerializedName(SERIALIZED_NAME_P2)
  private List<List<P2Enum>> p2 = null;

  /**
   * Gets or Sets p3
   */
  @JsonAdapter(P3Enum.Adapter.class)
  public enum P3Enum {
    /**
     * This is a lorem
     */
    LOREM_ENUM_VALUE("lorem"),
    
    /**
     * This is a ipsum
     */
    IPSUM_ENUM_VALUE("ipsum");

    private String value;

    P3Enum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static P3Enum fromValue(String value) {
      for (P3Enum b : P3Enum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<P3Enum> {
      @Override
      public void write(final JsonWriter jsonWriter, final P3Enum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public P3Enum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return P3Enum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_P3 = "p3";
  @SerializedName(SERIALIZED_NAME_P3)
  private List<List<List<P3Enum>>> p3 = null;


  public EnumInArrayOfArray p1(List<P1Enum> p1) {
    
    this.p1 = p1;
    return this;
  }

  public EnumInArrayOfArray addP1Item(P1Enum p1Item) {
    if (this.p1 == null) {
      this.p1 = new ArrayList<P1Enum>();
    }
    this.p1.add(p1Item);
    return this;
  }

   /**
   * Get p1
   * @return p1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<P1Enum> getP1() {
    return p1;
  }



  public void setP1(List<P1Enum> p1) {
    this.p1 = p1;
  }


  public EnumInArrayOfArray p2(List<List<P2Enum>> p2) {
    
    this.p2 = p2;
    return this;
  }

  public EnumInArrayOfArray addP2Item(List<P2Enum> p2Item) {
    if (this.p2 == null) {
      this.p2 = new ArrayList<List<P2Enum>>();
    }
    this.p2.add(p2Item);
    return this;
  }

   /**
   * Get p2
   * @return p2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<List<P2Enum>> getP2() {
    return p2;
  }



  public void setP2(List<List<P2Enum>> p2) {
    this.p2 = p2;
  }


  public EnumInArrayOfArray p3(List<List<List<P3Enum>>> p3) {
    
    this.p3 = p3;
    return this;
  }

  public EnumInArrayOfArray addP3Item(List<List<P3Enum>> p3Item) {
    if (this.p3 == null) {
      this.p3 = new ArrayList<List<List<P3Enum>>>();
    }
    this.p3.add(p3Item);
    return this;
  }

   /**
   * Get p3
   * @return p3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<List<List<P3Enum>>> getP3() {
    return p3;
  }



  public void setP3(List<List<List<P3Enum>>> p3) {
    this.p3 = p3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumInArrayOfArray enumInArrayOfArray = (EnumInArrayOfArray) o;
    return Objects.equals(this.p1, enumInArrayOfArray.p1) &&
        Objects.equals(this.p2, enumInArrayOfArray.p2) &&
        Objects.equals(this.p3, enumInArrayOfArray.p3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(p1, p2, p3);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumInArrayOfArray {\n");
    sb.append("    p1: ").append(toIndentedString(p1)).append("\n");
    sb.append("    p2: ").append(toIndentedString(p2)).append("\n");
    sb.append("    p3: ").append(toIndentedString(p3)).append("\n");
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

