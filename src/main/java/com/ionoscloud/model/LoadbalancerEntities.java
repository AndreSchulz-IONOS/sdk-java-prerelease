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
import com.ionoscloud.model.BalancedNics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LoadbalancerEntities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-08T12:49:39.918Z[Etc/UTC]")

public class LoadbalancerEntities {
  
  public static final String SERIALIZED_NAME_BALANCEDNICS = "balancednics";
  @SerializedName(SERIALIZED_NAME_BALANCEDNICS)
  private BalancedNics balancednics;

  

  public LoadbalancerEntities balancednics(BalancedNics balancednics) {
    
    this.balancednics = balancednics;
    return this;
  }

   /**
   * Get balancednics
   * @return balancednics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BalancedNics getBalancednics() {
    return balancednics;
  }


  public void setBalancednics(BalancedNics balancednics) {
    this.balancednics = balancednics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadbalancerEntities loadbalancerEntities = (LoadbalancerEntities) o;
    return Objects.equals(this.balancednics, loadbalancerEntities.balancednics);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadbalancerEntities {\n");
    
    sb.append("    balancednics: ").append(toIndentedString(balancednics)).append("\n");
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

