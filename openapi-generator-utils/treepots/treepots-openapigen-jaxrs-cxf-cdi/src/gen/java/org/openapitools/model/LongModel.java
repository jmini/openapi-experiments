package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class LongModel   {
  
  private Long long1 = null;

  private Long long2 = null;


  /**
   **/
  public LongModel long1(Long long1) {
    this.long1 = long1;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Long1")
  public Long getLong1() {
    return long1;
  }
  public void setLong1(Long long1) {
    this.long1 = long1;
  }


  /**
   **/
  public LongModel long2(Long long2) {
    this.long2 = long2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Long2")
  public Long getLong2() {
    return long2;
  }
  public void setLong2(Long long2) {
    this.long2 = long2;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongModel longModel = (LongModel) o;
    return Objects.equals(long1, longModel.long1) &&
        Objects.equals(long2, longModel.long2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(long1, long2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongModel {\n");
    
    sb.append("    long1: ").append(toIndentedString(long1)).append("\n");
    sb.append("    long2: ").append(toIndentedString(long2)).append("\n");
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

