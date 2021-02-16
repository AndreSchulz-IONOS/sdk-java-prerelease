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
import com.ionoscloud.model.Lans;
import com.ionoscloud.model.Loadbalancers;
import com.ionoscloud.model.Servers;
import com.ionoscloud.model.Volumes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DataCenterEntities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-16T14:06:11.337Z[Etc/UTC]")

public class DataCenterEntities {
  public static final String SERIALIZED_NAME_SERVERS = "servers";
  @SerializedName(SERIALIZED_NAME_SERVERS)
  private Servers servers;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private Volumes volumes;

  public static final String SERIALIZED_NAME_LOADBALANCERS = "loadbalancers";
  @SerializedName(SERIALIZED_NAME_LOADBALANCERS)
  private Loadbalancers loadbalancers;

  public static final String SERIALIZED_NAME_LANS = "lans";
  @SerializedName(SERIALIZED_NAME_LANS)
  private Lans lans;


  public DataCenterEntities servers(Servers servers) {
    
    this.servers = servers;
    return this;
  }

   /**
   * Get servers
   * @return servers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Servers getServers() {
    return servers;
  }


  public void setServers(Servers servers) {
    this.servers = servers;
  }


  public DataCenterEntities volumes(Volumes volumes) {
    
    this.volumes = volumes;
    return this;
  }

   /**
   * Get volumes
   * @return volumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Volumes getVolumes() {
    return volumes;
  }


  public void setVolumes(Volumes volumes) {
    this.volumes = volumes;
  }


  public DataCenterEntities loadbalancers(Loadbalancers loadbalancers) {
    
    this.loadbalancers = loadbalancers;
    return this;
  }

   /**
   * Get loadbalancers
   * @return loadbalancers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Loadbalancers getLoadbalancers() {
    return loadbalancers;
  }


  public void setLoadbalancers(Loadbalancers loadbalancers) {
    this.loadbalancers = loadbalancers;
  }


  public DataCenterEntities lans(Lans lans) {
    
    this.lans = lans;
    return this;
  }

   /**
   * Get lans
   * @return lans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Lans getLans() {
    return lans;
  }


  public void setLans(Lans lans) {
    this.lans = lans;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataCenterEntities dataCenterEntities = (DataCenterEntities) o;
    return Objects.equals(this.servers, dataCenterEntities.servers) && Objects.equals(this.volumes, dataCenterEntities.volumes) && Objects.equals(this.loadbalancers, dataCenterEntities.loadbalancers) && Objects.equals(this.lans, dataCenterEntities.lans);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataCenterEntities {\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    loadbalancers: ").append(toIndentedString(loadbalancers)).append("\n");
    sb.append("    lans: ").append(toIndentedString(lans)).append("\n");
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

