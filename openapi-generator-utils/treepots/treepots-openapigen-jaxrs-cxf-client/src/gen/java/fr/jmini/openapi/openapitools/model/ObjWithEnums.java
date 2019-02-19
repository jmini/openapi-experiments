package fr.jmini.openapi.openapitools.model;

import fr.jmini.openapi.openapitools.model.Enum2WithCustomName;
import fr.jmini.openapi.openapitools.model.Int2Enum;
import fr.jmini.openapi.openapitools.model.IntEnum;
import fr.jmini.openapi.openapitools.model.Long2Enum;
import fr.jmini.openapi.openapitools.model.LongEnum;
import fr.jmini.openapi.openapitools.model.String2Enum;
import fr.jmini.openapi.openapitools.model.StringEnum;

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
  
  @ApiModelProperty(value = "")
  private IntEnum iprop;

  @ApiModelProperty(value = "")
  private LongEnum lprop;

  @ApiModelProperty(value = "")
  private StringEnum sprop;

  @ApiModelProperty(value = "")
  private Int2Enum iprop2 = Int2Enum.NUMBER_2;

  @ApiModelProperty(value = "")
  private Long2Enum lprop2 = Long2Enum.NUMBER_30;

  @ApiModelProperty(value = "")
  private String2Enum sprop2 = String2Enum.B;

  @ApiModelProperty(value = "")
  private Enum2WithCustomName custom = Enum2WithCustomName.BAR;
 /**
   * Get iprop
   * @return iprop
  **/
  @JsonProperty("IProp")
  public IntEnum getIprop() {
    return iprop;
  }

  public void setIprop(IntEnum iprop) {
    this.iprop = iprop;
  }

  public ObjWithEnums iprop(IntEnum iprop) {
    this.iprop = iprop;
    return this;
  }

 /**
   * Get lprop
   * @return lprop
  **/
  @JsonProperty("LProp")
  public LongEnum getLprop() {
    return lprop;
  }

  public void setLprop(LongEnum lprop) {
    this.lprop = lprop;
  }

  public ObjWithEnums lprop(LongEnum lprop) {
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

 /**
   * Get iprop2
   * @return iprop2
  **/
  @JsonProperty("IProp2")
  public Int2Enum getIprop2() {
    return iprop2;
  }

  public void setIprop2(Int2Enum iprop2) {
    this.iprop2 = iprop2;
  }

  public ObjWithEnums iprop2(Int2Enum iprop2) {
    this.iprop2 = iprop2;
    return this;
  }

 /**
   * Get lprop2
   * @return lprop2
  **/
  @JsonProperty("LProp2")
  public Long2Enum getLprop2() {
    return lprop2;
  }

  public void setLprop2(Long2Enum lprop2) {
    this.lprop2 = lprop2;
  }

  public ObjWithEnums lprop2(Long2Enum lprop2) {
    this.lprop2 = lprop2;
    return this;
  }

 /**
   * Get sprop2
   * @return sprop2
  **/
  @JsonProperty("SProp2")
  public String2Enum getSprop2() {
    return sprop2;
  }

  public void setSprop2(String2Enum sprop2) {
    this.sprop2 = sprop2;
  }

  public ObjWithEnums sprop2(String2Enum sprop2) {
    this.sprop2 = sprop2;
    return this;
  }

 /**
   * Get custom
   * @return custom
  **/
  @JsonProperty("Custom")
  public Enum2WithCustomName getCustom() {
    return custom;
  }

  public void setCustom(Enum2WithCustomName custom) {
    this.custom = custom;
  }

  public ObjWithEnums custom(Enum2WithCustomName custom) {
    this.custom = custom;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

