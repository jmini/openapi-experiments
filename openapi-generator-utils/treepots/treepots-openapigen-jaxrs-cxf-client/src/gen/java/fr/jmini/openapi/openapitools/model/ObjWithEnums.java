package fr.jmini.openapi.openapitools.model;

import fr.jmini.openapi.openapitools.model.IntEnum;
import fr.jmini.openapi.openapitools.model.LongEnum;
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
  private IntEnum iprop = null;

  @ApiModelProperty(value = "")
  private LongEnum lprop = null;

  @ApiModelProperty(value = "")
  private StringEnum sprop = null;
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

