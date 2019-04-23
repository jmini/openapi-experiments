package fr.jmini.openapi.openapitools.model;

import fr.jmini.openapi.openapitools.model.Element;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class Node extends Element  {
  
  private @Valid List<String> childrenIds = new ArrayList<String>();

  /**
   **/
  public Node childrenIds(List<String> childrenIds) {
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

