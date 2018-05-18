package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ItemWithBoolean   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("name")
  private String name = null;

  /**
   **/
  public ItemWithBoolean id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public ItemWithBoolean active(Boolean active) {
    this.active = active;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean isActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  public ItemWithBoolean name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemWithBoolean itemWithBoolean = (ItemWithBoolean) o;
    return Objects.equals(id, itemWithBoolean.id) &&
        Objects.equals(active, itemWithBoolean.active) &&
        Objects.equals(name, itemWithBoolean.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemWithBoolean {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

