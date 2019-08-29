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


package fr.jmini.openapi.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * NodeAllOf
 */
@JsonPropertyOrder({
  NodeAllOf.JSON_PROPERTY_CHILDREN_IDS
})

public class NodeAllOf   {
  public static final String JSON_PROPERTY_CHILDREN_IDS = "childrenIds";
  @JsonProperty(JSON_PROPERTY_CHILDREN_IDS)
  private List<String> childrenIds = null;

  public NodeAllOf childrenIds(List<String> childrenIds) {
    this.childrenIds = childrenIds;
    return this;
  }

  public NodeAllOf addChildrenIdsItem(String childrenIdsItem) {
    if (this.childrenIds == null) {
      this.childrenIds = new ArrayList<String>();
    }
    this.childrenIds.add(childrenIdsItem);
    return this;
  }

  /**
   * Get childrenIds
   * @return childrenIds
   **/
  @JsonProperty("childrenIds")
  @ApiModelProperty(value = "")
  
  public List<String> getChildrenIds() {
    return childrenIds;
  }

  public void setChildrenIds(List<String> childrenIds) {
    this.childrenIds = childrenIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeAllOf nodeAllOf = (NodeAllOf) o;
    return Objects.equals(this.childrenIds, nodeAllOf.childrenIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childrenIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeAllOf {\n");
    
    sb.append("    childrenIds: ").append(toIndentedString(childrenIds)).append("\n");
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

