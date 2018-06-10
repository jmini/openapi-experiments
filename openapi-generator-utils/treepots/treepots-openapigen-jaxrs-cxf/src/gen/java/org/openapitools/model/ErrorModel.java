package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorModel  {
  
  @ApiModelProperty(value = "http status code")
 /**
   * http status code
  **/
  private Integer statusCode = null;

  @ApiModelProperty(value = "http status reason phrase")
 /**
   * http status reason phrase
  **/
  private String statusDescription = null;

  @ApiModelProperty(value = "error description")
 /**
   * error description
  **/
  private String errorMessage = null;
 /**
   * http status code
   * @return statusCode
  **/
  @JsonProperty("statusCode")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public ErrorModel statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

 /**
   * http status reason phrase
   * @return statusDescription
  **/
  @JsonProperty("statusDescription")
  public String getStatusDescription() {
    return statusDescription;
  }

  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }

  public ErrorModel statusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
    return this;
  }

 /**
   * error description
   * @return errorMessage
  **/
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ErrorModel errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorModel {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

