/*
 * CLOUD API
 * An enterprise-grade Infrastructure is provided as a Service (IaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.   The API allows you to perform a variety of management tasks such as spinning up additional servers, adding volumes, adjusting networking, and so forth. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive.
 *
 * The version of the OpenAPI document: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.model;

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
import java.util.ArrayList;
import java.util.List;

/**
 * LocationProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-27T13:42:21.767Z[Etc/UTC]")

public class LocationProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets features
   */
  @JsonAdapter(FeaturesEnum.Adapter.class)
  public enum FeaturesEnum {
    SSD("SSD"),
    
    SSD_STORAGE_ZONING("SSD_STORAGE_ZONING");

    private String value;

    FeaturesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeaturesEnum fromValue(String value) {
      for (FeaturesEnum b : FeaturesEnum.values()) {
        if (b.value.equals(value) || value.equals("collection")) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FeaturesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeaturesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeaturesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeaturesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<FeaturesEnum> features = null;

  public static final String SERIALIZED_NAME_IMAGE_ALIASES = "imageAliases";
  @SerializedName(SERIALIZED_NAME_IMAGE_ALIASES)
  private List<String> imageAliases = null;


  public LocationProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name of that resource
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My resource", value = "A name of that resource")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


   /**
   * List of features supported by the location
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[SSD]", value = "List of features supported by the location")

  public List<FeaturesEnum> getFeatures() {
    return features;
  }




   /**
   * List of image aliases available for the location
   * @return imageAliases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of image aliases available for the location")

  public List<String> getImageAliases() {
    return imageAliases;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationProperties locationProperties = (LocationProperties) o;
    return Objects.equals(this.name, locationProperties.name) && Objects.equals(this.features, locationProperties.features) && Objects.equals(this.imageAliases, locationProperties.imageAliases);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    imageAliases: ").append(toIndentedString(imageAliases)).append("\n");
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

