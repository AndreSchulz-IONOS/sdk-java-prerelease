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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CpuArchitectureProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-01T15:22:04.229Z[Etc/UTC]")

public class CpuArchitectureProperties {
  
  public static final String SERIALIZED_NAME_CPU_FAMILY = "cpuFamily";
  @SerializedName(SERIALIZED_NAME_CPU_FAMILY)
  private String cpuFamily;


  public static final String SERIALIZED_NAME_MAX_CORES = "maxCores";
  @SerializedName(SERIALIZED_NAME_MAX_CORES)
  private Integer maxCores;


  public static final String SERIALIZED_NAME_MAX_RAM = "maxRam";
  @SerializedName(SERIALIZED_NAME_MAX_RAM)
  private Integer maxRam;


  public static final String SERIALIZED_NAME_VENDOR = "vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  private String vendor;

  

  public CpuArchitectureProperties cpuFamily(String cpuFamily) {
    
    this.cpuFamily = cpuFamily;
    return this;
  }

   /**
   * A valid CPU family name.
   * @return cpuFamily
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AMD_OPTERON", value = "A valid CPU family name.")

  public String getCpuFamily() {
    return cpuFamily;
  }


  public void setCpuFamily(String cpuFamily) {
    this.cpuFamily = cpuFamily;
  }



  public CpuArchitectureProperties maxCores(Integer maxCores) {
    
    this.maxCores = maxCores;
    return this;
  }

   /**
   * The maximum number of cores available.
   * @return maxCores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "62", value = "The maximum number of cores available.")

  public Integer getMaxCores() {
    return maxCores;
  }


  public void setMaxCores(Integer maxCores) {
    this.maxCores = maxCores;
  }



  public CpuArchitectureProperties maxRam(Integer maxRam) {
    
    this.maxRam = maxRam;
    return this;
  }

   /**
   * The maximum RAM size in MB.
   * @return maxRam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "245760", value = "The maximum RAM size in MB.")

  public Integer getMaxRam() {
    return maxRam;
  }


  public void setMaxRam(Integer maxRam) {
    this.maxRam = maxRam;
  }



  public CpuArchitectureProperties vendor(String vendor) {
    
    this.vendor = vendor;
    return this;
  }

   /**
   * A valid CPU vendor name.
   * @return vendor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AuthenticAMD", value = "A valid CPU vendor name.")

  public String getVendor() {
    return vendor;
  }


  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CpuArchitectureProperties cpuArchitectureProperties = (CpuArchitectureProperties) o;
    return Objects.equals(this.cpuFamily, cpuArchitectureProperties.cpuFamily) && Objects.equals(this.maxCores, cpuArchitectureProperties.maxCores) && Objects.equals(this.maxRam, cpuArchitectureProperties.maxRam) && Objects.equals(this.vendor, cpuArchitectureProperties.vendor);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CpuArchitectureProperties {\n");
    
    sb.append("    cpuFamily: ").append(toIndentedString(cpuFamily)).append("\n");

    sb.append("    maxCores: ").append(toIndentedString(maxCores)).append("\n");

    sb.append("    maxRam: ").append(toIndentedString(maxRam)).append("\n");

    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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



// CpuArchitectureProperties instantiates a new CpuArchitectureProperties object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public CpuArchitectureProperties() {

}


}
