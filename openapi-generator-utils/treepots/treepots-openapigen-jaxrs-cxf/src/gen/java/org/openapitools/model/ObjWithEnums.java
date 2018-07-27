package org.openapitools.model;

import org.openapitools.model.StringEnum;
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

public class ObjWithEnums  {
  
@XmlType(name="IpropEnum")
@XmlEnum(Integer.class)
public enum IpropEnum {

@XmlEnumValue("1") NUMBER_1(Integer.valueOf(1)), @XmlEnumValue("2") NUMBER_2(Integer.valueOf(2)), @XmlEnumValue("3") NUMBER_3(Integer.valueOf(3));


    private Integer value;

    IpropEnum (Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IpropEnum fromValue(String v) {
        for (IpropEnum b : IpropEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}

  @ApiModelProperty(value = "")
  private IpropEnum iprop = null;

@XmlType(name="LpropEnum")
@XmlEnum(Long.class)
public enum LpropEnum {

@XmlEnumValue("20l") NUMBER_20(Long.valueOf(20l)), @XmlEnumValue("30l") NUMBER_30(Long.valueOf(30l)), @XmlEnumValue("40l") NUMBER_40(Long.valueOf(40l));


    private Long value;

    LpropEnum (Long v) {
        value = v;
    }

    public Long value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LpropEnum fromValue(String v) {
        for (LpropEnum b : LpropEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}

  @ApiModelProperty(value = "")
  private LpropEnum lprop = null;

  @ApiModelProperty(value = "")
  @Valid
  private StringEnum sprop = null;
 /**
   * Get iprop
   * @return iprop
  **/
  @JsonProperty("IProp")
  public Integer getIprop() {
    if (iprop == null) {
      return null;
    }
    return iprop.value();
  }

  public void setIprop(IpropEnum iprop) {
    this.iprop = iprop;
  }

  public ObjWithEnums iprop(IpropEnum iprop) {
    this.iprop = iprop;
    return this;
  }

 /**
   * Get lprop
   * @return lprop
  **/
  @JsonProperty("LProp")
  public Long getLprop() {
    if (lprop == null) {
      return null;
    }
    return lprop.value();
  }

  public void setLprop(LpropEnum lprop) {
    this.lprop = lprop;
  }

  public ObjWithEnums lprop(LpropEnum lprop) {
    this.lprop = lprop;
    return this;
  }

 /**
   * Get sprop
   * @return sprop
  **/
  @JsonProperty("SProp")
  public StringEnum getSprop() {
    return sprop;
  }

  public void setSprop(StringEnum sprop) {
    this.sprop = sprop;
  }

  public ObjWithEnums sprop(StringEnum sprop) {
    this.sprop = sprop;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjWithEnums {\n");
    
    sb.append("    iprop: ").append(toIndentedString(iprop)).append("\n");
    sb.append("    lprop: ").append(toIndentedString(lprop)).append("\n");
    sb.append("    sprop: ").append(toIndentedString(sprop)).append("\n");
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

