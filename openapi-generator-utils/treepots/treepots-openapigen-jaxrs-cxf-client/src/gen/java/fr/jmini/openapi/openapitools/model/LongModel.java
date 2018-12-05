package fr.jmini.openapi.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LongModel  {
  
  @ApiModelProperty(value = "")
  private Long long1;

  @ApiModelProperty(value = "")
  private Long long2;
 /**
   * Get long1
   * @return long1
  **/
  @JsonProperty("Long1")
  public Long getLong1() {
    return long1;
  }

  public void setLong1(Long long1) {
    this.long1 = long1;
  }

  public LongModel long1(Long long1) {
    this.long1 = long1;
    return this;
  }

 /**
   * Get long2
   * @return long2
  **/
  @JsonProperty("Long2")
  public Long getLong2() {
    return long2;
  }

  public void setLong2(Long long2) {
    this.long2 = long2;
  }

  public LongModel long2(Long long2) {
    this.long2 = long2;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

