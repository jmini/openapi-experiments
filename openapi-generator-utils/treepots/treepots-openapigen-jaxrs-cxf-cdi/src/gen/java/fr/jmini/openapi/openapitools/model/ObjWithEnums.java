package fr.jmini.openapi.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.jmini.openapi.openapitools.model.StringEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ObjWithEnums   {
  

@XmlType(name="IpropEnum")
@XmlEnum(Integer.class)
public enum IpropEnum {

    @XmlEnumValue("1") NUMBER_1(Integer.valueOf(1)), @XmlEnumValue("2") NUMBER_2(Integer.valueOf(2)), @XmlEnumValue("3") NUMBER_3(Integer.valueOf(3));


    private Integer value;

    IpropEnum(Integer v) {
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

  private IpropEnum iprop = null;


@XmlType(name="LpropEnum")
@XmlEnum(Long.class)
public enum LpropEnum {

    @XmlEnumValue("20l") NUMBER_20(Long.valueOf(20l)), @XmlEnumValue("30l") NUMBER_30(Long.valueOf(30l)), @XmlEnumValue("40l") NUMBER_40(Long.valueOf(40l));


    private Long value;

    LpropEnum(Long v) {
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

  private LpropEnum lprop = null;

  private StringEnum sprop = null;


  /**
   **/
  public ObjWithEnums iprop(IpropEnum iprop) {
    this.iprop = iprop;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("IProp")
  public IpropEnum getIprop() {
    return iprop;
  }
  public void setIprop(IpropEnum iprop) {
    this.iprop = iprop;
  }


  /**
   **/
  public ObjWithEnums lprop(LpropEnum lprop) {
    this.lprop = lprop;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("LProp")
  public LpropEnum getLprop() {
    return lprop;
  }
  public void setLprop(LpropEnum lprop) {
    this.lprop = lprop;
  }


  /**
   **/
  public ObjWithEnums sprop(StringEnum sprop) {
    this.sprop = sprop;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("SProp")
  public StringEnum getSprop() {
    return sprop;
  }
  public void setSprop(StringEnum sprop) {
    this.sprop = sprop;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjWithEnums objWithEnums = (ObjWithEnums) o;
    return Objects.equals(iprop, objWithEnums.iprop) &&
        Objects.equals(lprop, objWithEnums.lprop) &&
        Objects.equals(sprop, objWithEnums.sprop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iprop, lprop, sprop);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
