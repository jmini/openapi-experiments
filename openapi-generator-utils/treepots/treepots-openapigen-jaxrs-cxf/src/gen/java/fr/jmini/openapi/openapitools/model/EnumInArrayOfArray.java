package fr.jmini.openapi.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EnumInArrayOfArray  {
  
@XmlType(name="P1Enum")
@XmlEnum(String.class)
public enum P1Enum {

@XmlEnumValue("valA") VALA(String.valueOf("valA")), @XmlEnumValue("valB") VALB(String.valueOf("valB")), @XmlEnumValue("valC") VALC(String.valueOf("valC"));


    private String value;

    P1Enum (String v) {
        value = v;
    }

    public String value() {
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
}

  @ApiModelProperty(value = "")
  private List<P1Enum> p1 = null;

@XmlType(name="P2Enum")
@XmlEnum(String.class)
public enum P2Enum {

@XmlEnumValue("val1") VAL1(String.valueOf("val1")), @XmlEnumValue("val2") VAL2(String.valueOf("val2")), @XmlEnumValue("val3") VAL3(String.valueOf("val3"));


    private String value;

    P2Enum (String v) {
        value = v;
    }

    public String value() {
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
}

  @ApiModelProperty(value = "")
  @Valid
  private List<List<P2Enum>> p2 = null;

@XmlType(name="P3Enum")
@XmlEnum(String.class)
public enum P3Enum {

@XmlEnumValue("lorem") LOREM_ENUM_VALUE(String.valueOf("lorem")), @XmlEnumValue("ipsum") IPSUM_ENUM_VALUE(String.valueOf("ipsum"));


    private String value;

    P3Enum (String v) {
        value = v;
    }

    public String value() {
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
}

  @ApiModelProperty(value = "")
  @Valid
  private List<List<List<P3Enum>>> p3 = null;
 /**
   * Get p1
   * @return p1
  **/
  @JsonProperty("p1")
  public List<P1Enum> getP1() {
    return p1;
  }

  public void setP1(List<P1Enum> p1) {
    this.p1 = p1;
  }

  public EnumInArrayOfArray p1(List<P1Enum> p1) {
    this.p1 = p1;
    return this;
  }

  public EnumInArrayOfArray addP1Item(P1Enum p1Item) {
    this.p1.add(p1Item);
    return this;
  }

 /**
   * Get p2
   * @return p2
  **/
  @JsonProperty("p2")
  public List<List<P2Enum>> getP2() {
    return p2;
  }

  public void setP2(List<List<P2Enum>> p2) {
    this.p2 = p2;
  }

  public EnumInArrayOfArray p2(List<List<P2Enum>> p2) {
    this.p2 = p2;
    return this;
  }

  public EnumInArrayOfArray addP2Item(List<P2Enum> p2Item) {
    this.p2.add(p2Item);
    return this;
  }

 /**
   * Get p3
   * @return p3
  **/
  @JsonProperty("p3")
  public List<List<List<P3Enum>>> getP3() {
    return p3;
  }

  public void setP3(List<List<List<P3Enum>>> p3) {
    this.p3 = p3;
  }

  public EnumInArrayOfArray p3(List<List<List<P3Enum>>> p3) {
    this.p3 = p3;
    return this;
  }

  public EnumInArrayOfArray addP3Item(List<List<P3Enum>> p3Item) {
    this.p3.add(p3Item);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

