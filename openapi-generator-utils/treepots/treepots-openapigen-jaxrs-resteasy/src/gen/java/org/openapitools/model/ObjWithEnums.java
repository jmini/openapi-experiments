package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.IntEnum;
import org.openapitools.model.LongEnum;
import org.openapitools.model.StringEnum;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ObjWithEnums   {
  
  private IntEnum iprop = null;
  private LongEnum lprop = null;
  private StringEnum sprop = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("IProp")
  public IntEnum getIprop() {
    return iprop;
  }
  public void setIprop(IntEnum iprop) {
    this.iprop = iprop;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("LProp")
  public LongEnum getLprop() {
    return lprop;
  }
  public void setLprop(LongEnum lprop) {
    this.lprop = lprop;
  }

  /**
   **/
  
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

