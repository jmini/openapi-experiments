package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.StringEnum;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ObjWithEnums   {
  

  private StringEnum sprop = null;

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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjWithEnums objWithEnums = (ObjWithEnums) o;
    return Objects.equals(sprop, objWithEnums.sprop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sprop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjWithEnums {\n");
    
    sb.append("    sprop: ").append(toIndentedString(sprop)).append("\n");
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

