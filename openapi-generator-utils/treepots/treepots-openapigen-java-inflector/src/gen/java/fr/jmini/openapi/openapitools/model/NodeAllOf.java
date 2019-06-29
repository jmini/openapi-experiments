package fr.jmini.openapi.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;






public class NodeAllOf   {
  @JsonProperty("childrenIds")
  private List<String> childrenIds = null;

  /**
   **/
  public NodeAllOf childrenIds(List<String> childrenIds) {
    this.childrenIds = childrenIds;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("childrenIds")
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
    return Objects.equals(childrenIds, nodeAllOf.childrenIds);
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

