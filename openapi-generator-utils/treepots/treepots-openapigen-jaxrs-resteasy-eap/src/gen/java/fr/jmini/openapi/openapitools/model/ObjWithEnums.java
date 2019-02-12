package fr.jmini.openapi.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.jmini.openapi.openapitools.model.IntEnum;
import fr.jmini.openapi.openapitools.model.LongEnum;
import fr.jmini.openapi.openapitools.model.String2Enum;
import fr.jmini.openapi.openapitools.model.StringEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ObjWithEnums   {
  

  private IntEnum iprop;

  private LongEnum lprop;

  private StringEnum sprop;

  private String2Enum sprop2 = String2Enum.B;

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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("SProp2")
  public String2Enum getSprop2() {
    return sprop2;
  }
  public void setSprop2(String2Enum sprop2) {
    this.sprop2 = sprop2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjWithEnums objWithEnums = (ObjWithEnums) o;
    return Objects.equals(iprop, objWithEnums.iprop) &&
        Objects.equals(lprop, objWithEnums.lprop) &&
        Objects.equals(sprop, objWithEnums.sprop) &&
        Objects.equals(sprop2, objWithEnums.sprop2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iprop, lprop, sprop, sprop2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjWithEnums {\n");
    
    sb.append("    iprop: ").append(toIndentedString(iprop)).append("\n");
    sb.append("    lprop: ").append(toIndentedString(lprop)).append("\n");
    sb.append("    sprop: ").append(toIndentedString(sprop)).append("\n");
    sb.append("    sprop2: ").append(toIndentedString(sprop2)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

