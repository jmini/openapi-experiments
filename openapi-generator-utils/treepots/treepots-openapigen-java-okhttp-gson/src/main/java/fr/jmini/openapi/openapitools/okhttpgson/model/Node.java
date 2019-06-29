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


package fr.jmini.openapi.openapitools.okhttpgson.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import fr.jmini.openapi.openapitools.okhttpgson.model.Element;
import fr.jmini.openapi.openapitools.okhttpgson.model.NodeAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Node
 */

public class Node extends Element {
  public static final String SERIALIZED_NAME_CHILDREN_IDS = "childrenIds";
  @SerializedName(SERIALIZED_NAME_CHILDREN_IDS)
  private List<String> childrenIds = new ArrayList<String>();

  public Node childrenIds(List<String> childrenIds) {
    this.childrenIds = childrenIds;
    return this;
  }

  public Node addChildrenIdsItem(String childrenIdsItem) {
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
    Node node = (Node) o;
    return Objects.equals(this.childrenIds, node.childrenIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childrenIds, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

