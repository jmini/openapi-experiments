package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ErrorModel   {
  

  private Integer statusCode = null;

  private String statusDescription = null;

  private String errorMessage = null;

  /**
   * http status code
   **/
  
  @ApiModelProperty(value = "http status code")
  @JsonProperty("statusCode")
  public Integer getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  /**
   * http status reason phrase
   **/
  
  @ApiModelProperty(value = "http status reason phrase")
  @JsonProperty("statusDescription")
  public String getStatusDescription() {
    return statusDescription;
  }
  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }

  /**
   * error description
   **/
  
  @ApiModelProperty(value = "error description")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorModel errorModel = (ErrorModel) o;
    return Objects.equals(statusCode, errorModel.statusCode) &&
        Objects.equals(statusDescription, errorModel.statusDescription) &&
        Objects.equals(errorMessage, errorModel.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, statusDescription, errorMessage);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

