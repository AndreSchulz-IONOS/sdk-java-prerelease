/*
 * CLOUD API
 * IONOS Enterprise-grade Infrastructure as a Service (IaaS) solutions can be managed through the Cloud API, in addition or as an alternative to the \"Data Center Designer\" (DCD) browser-based tool.    Both methods employ consistent concepts and features, deliver similar power and flexibility, and can be used to perform a multitude of management tasks, including adding servers, volumes, configuring networks, and so on.
 *
 * The version of the OpenAPI document: 6.0
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
import com.ionoscloud.model.CpuArchitectureProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DatacenterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T14:47:41.954Z[Etc/UTC]")

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


  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<String> features = null;


  public static final String SERIALIZED_NAME_SEC_AUTH_PROTECTION = "secAuthProtection";
  @SerializedName(SERIALIZED_NAME_SEC_AUTH_PROTECTION)
  private Boolean secAuthProtection;


  public static final String SERIALIZED_NAME_CPU_ARCHITECTURE = "cpuArchitecture";
  @SerializedName(SERIALIZED_NAME_CPU_ARCHITECTURE)
  private List<CpuArchitectureProperties> cpuArchitecture = null;

  

  public DatacenterProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the  resource.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My resource", value = "The name of the  resource.")

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
   * A description for the datacenter, such as staging, production.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Production Datacenter", value = "A description for the datacenter, such as staging, production.")

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
   * The physical location where the datacenter will be created. This will be where all of your servers live. Property cannot be modified after datacenter creation (disallowed in update requests).
   * @return location
  **/
  @ApiModelProperty(example = "us/las", required = true, value = "The physical location where the datacenter will be created. This will be where all of your servers live. Property cannot be modified after datacenter creation (disallowed in update requests).")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }



   /**
   * The version of the data center; incremented with every change.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "The version of the data center; incremented with every change.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }



   /**
   * List of features supported by the location where this data center is provisioned.
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[SSD]", value = "List of features supported by the location where this data center is provisioned.")

  public List<String> getFeatures() {
    return features;
  }


  public void setFeatures(List<String> features) {
    this.features = features;
  }



  public DatacenterProperties secAuthProtection(Boolean secAuthProtection) {
    
    this.secAuthProtection = secAuthProtection;
    return this;
  }

   /**
   * Boolean value representing if the data center requires extra protection, such as two-step verification.
   * @return secAuthProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Boolean value representing if the data center requires extra protection, such as two-step verification.")

  public Boolean getSecAuthProtection() {
    return secAuthProtection;
  }


  public void setSecAuthProtection(Boolean secAuthProtection) {
    this.secAuthProtection = secAuthProtection;
  }



   /**
   * Array of features and CPU families available in a location
   * @return cpuArchitecture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of features and CPU families available in a location")

  public List<CpuArchitectureProperties> getCpuArchitecture() {
    return cpuArchitecture;
  }


  public void setCpuArchitecture(List<CpuArchitectureProperties> cpuArchitecture) {
    this.cpuArchitecture = cpuArchitecture;
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
    return Objects.equals(this.name, datacenterProperties.name) && Objects.equals(this.description, datacenterProperties.description) && Objects.equals(this.location, datacenterProperties.location) && Objects.equals(this.version, datacenterProperties.version) && Objects.equals(this.features, datacenterProperties.features) && Objects.equals(this.secAuthProtection, datacenterProperties.secAuthProtection) && Objects.equals(this.cpuArchitecture, datacenterProperties.cpuArchitecture);
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

    sb.append("    cpuArchitecture: ").append(toIndentedString(cpuArchitecture)).append("\n");
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

