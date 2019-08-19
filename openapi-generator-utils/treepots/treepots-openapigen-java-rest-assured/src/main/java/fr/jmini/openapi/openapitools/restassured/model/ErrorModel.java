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


package fr.jmini.openapi.openapitools.restassured.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ErrorModel
 */

public class ErrorModel {
  public static final String SERIALIZED_NAME_STATUS_CODE = "statusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public static final String SERIALIZED_NAME_STATUS_DESCRIPTION = "statusDescription";
  @SerializedName(SERIALIZED_NAME_STATUS_DESCRIPTION)
  private String statusDescription;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;


  public ErrorModel statusCode(Integer statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * http status code
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "http status code")

  public Integer getStatusCode() {
    return statusCode;
  }



  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  public ErrorModel statusDescription(String statusDescription) {
    
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * http status reason phrase
   * @return statusDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "http status reason phrase")

  public String getStatusDescription() {
    return statusDescription;
  }



  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }


  public ErrorModel errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * error description
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "error description")

  public String getErrorMessage() {
    return errorMessage;
  }



  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorModel errorModel = (ErrorModel) o;
    return Objects.equals(this.statusCode, errorModel.statusCode) &&
        Objects.equals(this.statusDescription, errorModel.statusDescription) &&
        Objects.equals(this.errorMessage, errorModel.errorMessage);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

