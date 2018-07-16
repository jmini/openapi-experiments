package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.StringEnum;






public class ObjWithEnums   {
  /**
   * Gets or Sets iprop
   */
  public enum IpropEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3);

    private Integer value;

    IpropEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IpropEnum fromValue(String text) {
      for (IpropEnum b : IpropEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("IProp")
  private IpropEnum iprop = null;

  /**
   * Gets or Sets lprop
   */
  public enum LpropEnum {
    NUMBER_20(20l),
    
    NUMBER_30(30l),
    
    NUMBER_40(40l);

    private Long value;

    LpropEnum(Long value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LpropEnum fromValue(String text) {
      for (LpropEnum b : LpropEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("LProp")
  private LpropEnum lprop = null;

  @JsonProperty("SProp")
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

