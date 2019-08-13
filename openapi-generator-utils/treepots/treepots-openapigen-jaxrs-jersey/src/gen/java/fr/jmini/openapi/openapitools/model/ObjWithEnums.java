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


package fr.jmini.openapi.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.jmini.openapi.openapitools.model.Enum2WithCustomName;
import fr.jmini.openapi.openapitools.model.Int2Enum;
import fr.jmini.openapi.openapitools.model.IntEnum;
import fr.jmini.openapi.openapitools.model.Long2Enum;
import fr.jmini.openapi.openapitools.model.LongEnum;
import fr.jmini.openapi.openapitools.model.String2Enum;
import fr.jmini.openapi.openapitools.model.StringEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ObjWithEnums
 */

public class ObjWithEnums   {
  public static final String JSON_PROPERTY_IPROP = "IProp";
  @JsonProperty(JSON_PROPERTY_IPROP)
  private IntEnum iprop;

  public static final String JSON_PROPERTY_LPROP = "LProp";
  @JsonProperty(JSON_PROPERTY_LPROP)
  private LongEnum lprop;

  public static final String JSON_PROPERTY_SPROP = "SProp";
  @JsonProperty(JSON_PROPERTY_SPROP)
  private StringEnum sprop;

  public static final String JSON_PROPERTY_IPROP2 = "IProp2";
  @JsonProperty(JSON_PROPERTY_IPROP2)
  private Int2Enum iprop2 = Int2Enum.NUMBER_2;

  public static final String JSON_PROPERTY_LPROP2 = "LProp2";
  @JsonProperty(JSON_PROPERTY_LPROP2)
  private Long2Enum lprop2 = Long2Enum.NUMBER_30;

  public static final String JSON_PROPERTY_SPROP2 = "SProp2";
  @JsonProperty(JSON_PROPERTY_SPROP2)
  private String2Enum sprop2 = String2Enum.B;

  public static final String JSON_PROPERTY_CUSTOM = "Custom";
  @JsonProperty(JSON_PROPERTY_CUSTOM)
  private Enum2WithCustomName custom = Enum2WithCustomName.BAR;

  public ObjWithEnums iprop(IntEnum iprop) {
    this.iprop = iprop;
    return this;
  }

  /**
   * Get iprop
   * @return iprop
   **/
  @JsonProperty("IProp")
  @ApiModelProperty(value = "")
  @Valid 
  public IntEnum getIprop() {
    return iprop;
  }

  public void setIprop(IntEnum iprop) {
    this.iprop = iprop;
  }

  public ObjWithEnums lprop(LongEnum lprop) {
    this.lprop = lprop;
    return this;
  }

  /**
   * Get lprop
   * @return lprop
   **/
  @JsonProperty("LProp")
  @ApiModelProperty(value = "")
  @Valid 
  public LongEnum getLprop() {
    return lprop;
  }

  public void setLprop(LongEnum lprop) {
    this.lprop = lprop;
  }

  public ObjWithEnums sprop(StringEnum sprop) {
    this.sprop = sprop;
    return this;
  }

  /**
   * Get sprop
   * @return sprop
   **/
  @JsonProperty("SProp")
  @ApiModelProperty(value = "")
  @Valid 
  public StringEnum getSprop() {
    return sprop;
  }

  public void setSprop(StringEnum sprop) {
    this.sprop = sprop;
  }

  public ObjWithEnums iprop2(Int2Enum iprop2) {
    this.iprop2 = iprop2;
    return this;
  }

  /**
   * Get iprop2
   * @return iprop2
   **/
  @JsonProperty("IProp2")
  @ApiModelProperty(value = "")
  @Valid 
  public Int2Enum getIprop2() {
    return iprop2;
  }

  public void setIprop2(Int2Enum iprop2) {
    this.iprop2 = iprop2;
  }

  public ObjWithEnums lprop2(Long2Enum lprop2) {
    this.lprop2 = lprop2;
    return this;
  }

  /**
   * Get lprop2
   * @return lprop2
   **/
  @JsonProperty("LProp2")
  @ApiModelProperty(value = "")
  @Valid 
  public Long2Enum getLprop2() {
    return lprop2;
  }

  public void setLprop2(Long2Enum lprop2) {
    this.lprop2 = lprop2;
  }

  public ObjWithEnums sprop2(String2Enum sprop2) {
    this.sprop2 = sprop2;
    return this;
  }

  /**
   * Get sprop2
   * @return sprop2
   **/
  @JsonProperty("SProp2")
  @ApiModelProperty(value = "")
  @Valid 
  public String2Enum getSprop2() {
    return sprop2;
  }

  public void setSprop2(String2Enum sprop2) {
    this.sprop2 = sprop2;
  }

  public ObjWithEnums custom(Enum2WithCustomName custom) {
    this.custom = custom;
    return this;
  }

  /**
   * Get custom
   * @return custom
   **/
  @JsonProperty("Custom")
  @ApiModelProperty(value = "")
  @Valid 
  public Enum2WithCustomName getCustom() {
    return custom;
  }

  public void setCustom(Enum2WithCustomName custom) {
    this.custom = custom;
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
    return Objects.equals(this.iprop, objWithEnums.iprop) &&
        Objects.equals(this.lprop, objWithEnums.lprop) &&
        Objects.equals(this.sprop, objWithEnums.sprop) &&
        Objects.equals(this.iprop2, objWithEnums.iprop2) &&
        Objects.equals(this.lprop2, objWithEnums.lprop2) &&
        Objects.equals(this.sprop2, objWithEnums.sprop2) &&
        Objects.equals(this.custom, objWithEnums.custom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iprop, lprop, sprop, iprop2, lprop2, sprop2, custom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjWithEnums {\n");
    
    sb.append("    iprop: ").append(toIndentedString(iprop)).append("\n");
    sb.append("    lprop: ").append(toIndentedString(lprop)).append("\n");
    sb.append("    sprop: ").append(toIndentedString(sprop)).append("\n");
    sb.append("    iprop2: ").append(toIndentedString(iprop2)).append("\n");
    sb.append("    lprop2: ").append(toIndentedString(lprop2)).append("\n");
    sb.append("    sprop2: ").append(toIndentedString(sprop2)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
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

