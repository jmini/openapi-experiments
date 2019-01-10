package fr.jmini.openapi.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;






public class EnumInArrayOfArray   {
  /**
   * Gets or Sets p1
   */
  public enum P1Enum {
    VALA("valA"),
    
    VALB("valB"),
    
    VALC("valC");

    private String value;

    P1Enum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static P1Enum fromValue(String text) {
      for (P1Enum b : P1Enum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("p1")
  private List<P1Enum> p1 = null;

  /**
   * Gets or Sets p2
   */
  public enum P2Enum {
    VAL1("val1"),
    
    VAL2("val2"),
    
    VAL3("val3");

    private String value;

    P2Enum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static P2Enum fromValue(String text) {
      for (P2Enum b : P2Enum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("p2")
  private List<List<P2Enum>> p2 = null;

  /**
   * Gets or Sets p3
   */
  public enum P3Enum {
    LOREM_ENUM_VALUE("lorem"),
    
    IPSUM_ENUM_VALUE("ipsum");

    private String value;

    P3Enum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static P3Enum fromValue(String text) {
      for (P3Enum b : P3Enum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("p3")
  private List<List<List<P3Enum>>> p3 = null;

  /**
   **/
  public EnumInArrayOfArray p1(List<P1Enum> p1) {
    this.p1 = p1;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("p1")
  public List<P1Enum> getP1() {
    return p1;
  }
  public void setP1(List<P1Enum> p1) {
    this.p1 = p1;
  }

  /**
   **/
  public EnumInArrayOfArray p2(List<List<P2Enum>> p2) {
    this.p2 = p2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("p2")
  public List<List<P2Enum>> getP2() {
    return p2;
  }
  public void setP2(List<List<P2Enum>> p2) {
    this.p2 = p2;
  }

  /**
   **/
  public EnumInArrayOfArray p3(List<List<List<P3Enum>>> p3) {
    this.p3 = p3;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("p3")
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
    return Objects.equals(p1, enumInArrayOfArray.p1) &&
        Objects.equals(p2, enumInArrayOfArray.p2) &&
        Objects.equals(p3, enumInArrayOfArray.p3);
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

