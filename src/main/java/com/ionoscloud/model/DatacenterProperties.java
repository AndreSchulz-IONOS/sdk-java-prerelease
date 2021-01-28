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
 * DatacenterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-28T09:19:33.484Z[Etc/UTC]")

public class DatacenterProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

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

  public static final String SERIALIZED_NAME_SEC_AUTH_PROTECTION = "secAuthProtection";
  @SerializedName(SERIALIZED_NAME_SEC_AUTH_PROTECTION)
  private Boolean secAuthProtection;


  public DatacenterProperties name(String name) {
    
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


  public DatacenterProperties description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description for the datacenter, e.g. staging, production
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Production Datacenter", value = "A description for the datacenter, e.g. staging, production")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DatacenterProperties location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * The physical location where the datacenter will be created. This will be where all of your servers live. Property cannot be modified after datacenter creation (disallowed in update requests)
   * @return location
  **/
  @ApiModelProperty(example = "us/las", required = true, value = "The physical location where the datacenter will be created. This will be where all of your servers live. Property cannot be modified after datacenter creation (disallowed in update requests)")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


   /**
   * The version of that Data Center. Gets incremented with every change
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "The version of that Data Center. Gets incremented with every change")

  public Integer getVersion() {
    return version;
  }




   /**
   * List of features supported by the location this data center is part of
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[SSD]", value = "List of features supported by the location this data center is part of")

  public List<FeaturesEnum> getFeatures() {
    return features;
  }




  public DatacenterProperties secAuthProtection(Boolean secAuthProtection) {
    
    this.secAuthProtection = secAuthProtection;
    return this;
  }

   /**
   * Boolean value representing if the data center requires extra protection e.g. two factor protection
   * @return secAuthProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Boolean value representing if the data center requires extra protection e.g. two factor protection")

  public Boolean getSecAuthProtection() {
    return secAuthProtection;
  }


  public void setSecAuthProtection(Boolean secAuthProtection) {
    this.secAuthProtection = secAuthProtection;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatacenterProperties datacenterProperties = (DatacenterProperties) o;
    return Objects.equals(this.name, datacenterProperties.name) && Objects.equals(this.description, datacenterProperties.description) && Objects.equals(this.location, datacenterProperties.location) && Objects.equals(this.version, datacenterProperties.version) && Objects.equals(this.features, datacenterProperties.features) && Objects.equals(this.secAuthProtection, datacenterProperties.secAuthProtection);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatacenterProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    secAuthProtection: ").append(toIndentedString(secAuthProtection)).append("\n");
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

