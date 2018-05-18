/*
 * OpenAPI Tree Pots
 * Example spec
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
 * ObjWithEnums
 */

public class ObjWithEnums {
  /**
   * Gets or Sets iprop
   */
  @JsonAdapter(IpropEnum.Adapter.class)
  public enum IpropEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3);

    private Integer value;

    IpropEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IpropEnum fromValue(String text) {
      for (IpropEnum b : IpropEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IpropEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IpropEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IpropEnum read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return IpropEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_IPROP = "IProp";
  @SerializedName(SERIALIZED_NAME_IPROP)
  private IpropEnum iprop = null;

  /**
   * Gets or Sets lprop
   */
  @JsonAdapter(LpropEnum.Adapter.class)
  public enum LpropEnum {
    NUMBER_20(20l),
    
    NUMBER_30(30l),
    
    NUMBER_40(40l);

    private Long value;

    LpropEnum(Long value) {
      this.value = value;
    }

    public Long getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LpropEnum fromValue(String text) {
      for (LpropEnum b : LpropEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LpropEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LpropEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LpropEnum read(final JsonReader jsonReader) throws IOException {
        Long value = jsonReader.nextLong();
        return LpropEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_LPROP = "LProp";
  @SerializedName(SERIALIZED_NAME_LPROP)
  private LpropEnum lprop = null;

  /**
   * Gets or Sets sprop
   */
  @JsonAdapter(SpropEnum.Adapter.class)
  public enum SpropEnum {
    NUMBER_20(20l),
    
    NUMBER_30(30l),
    
    NUMBER_40(40l);

    private Long value;

    SpropEnum(Long value) {
      this.value = value;
    }

    public Long getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SpropEnum fromValue(String text) {
      for (SpropEnum b : SpropEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SpropEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpropEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SpropEnum read(final JsonReader jsonReader) throws IOException {
        Long value = jsonReader.nextLong();
        return SpropEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_SPROP = "SProp";
  @SerializedName(SERIALIZED_NAME_SPROP)
  private SpropEnum sprop = null;

  public ObjWithEnums iprop(IpropEnum iprop) {
    this.iprop = iprop;
    return this;
  }

   /**
   * Get iprop
   * @return iprop
  **/
  @ApiModelProperty(value = "")
  public IpropEnum getIprop() {
    return iprop;
  }

  public void setIprop(IpropEnum iprop) {
    this.iprop = iprop;
  }

  public ObjWithEnums lprop(LpropEnum lprop) {
    this.lprop = lprop;
    return this;
  }

   /**
   * Get lprop
   * @return lprop
  **/
  @ApiModelProperty(value = "")
  public LpropEnum getLprop() {
    return lprop;
  }

  public void setLprop(LpropEnum lprop) {
    this.lprop = lprop;
  }

  public ObjWithEnums sprop(SpropEnum sprop) {
    this.sprop = sprop;
    return this;
  }

   /**
   * Get sprop
   * @return sprop
  **/
  @ApiModelProperty(value = "")
  public SpropEnum getSprop() {
    return sprop;
  }

  public void setSprop(SpropEnum sprop) {
    this.sprop = sprop;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjWithEnums objWithEnums = (ObjWithEnums) o;
    return Objects.equals(this.iprop, objWithEnums.iprop) &&
        Objects.equals(this.lprop, objWithEnums.lprop) &&
        Objects.equals(this.sprop, objWithEnums.sprop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iprop, lprop, sprop);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjWithEnums {\n");
    
    sb.append("    iprop: ").append(toIndentedString(iprop)).append("\n");
    sb.append("    lprop: ").append(toIndentedString(lprop)).append("\n");
    sb.append("    sprop: ").append(toIndentedString(sprop)).append("\n");
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

