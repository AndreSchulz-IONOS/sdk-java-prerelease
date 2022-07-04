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
import com.ionoscloud.model.IpConsumer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IpBlockProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T14:02:16.072Z[Etc/UTC]")

public class IpBlockProperties {
  public static final String SERIALIZED_NAME_IPS = "ips";
  @SerializedName(SERIALIZED_NAME_IPS)
  private List<String> ips = null;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IP_CONSUMERS = "ipConsumers";
  @SerializedName(SERIALIZED_NAME_IP_CONSUMERS)
  private List<IpConsumer> ipConsumers = null;


   /**
   * Collection of IPs, associated with the IP Block.
   * @return ips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"22.231.113.64\", \"22.231.113.65\", \"22.231.113.66\"]", value = "Collection of IPs, associated with the IP Block.")

  public List<String> getIps() {
    return ips;
  }


  public void setIps(List<String> ips) {
    this.ips = ips;
  }


  public IpBlockProperties location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Location of that IP block. Property cannot be modified after it is created (disallowed in update requests).
   * @return location
  **/
  @ApiModelProperty(example = "us/las", required = true, value = "Location of that IP block. Property cannot be modified after it is created (disallowed in update requests).")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public IpBlockProperties size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * The size of the IP block.
   * @return size
  **/
  @ApiModelProperty(example = "5", required = true, value = "The size of the IP block.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public IpBlockProperties name(String name) {
    
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


   /**
   * Read-Only attribute. Lists consumption detail for an individual IP
   * @return ipConsumers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{ \"ipConsumers\": [ { \"ip\" : \"192.18.2.11\", \"mac\" : \"02:01:3f:52:6e:57\", \"nicId\" : \"0e8ee463-1174-46f2-87ba-a5c79c14d8e5\", \"serverId\" : \"e6a3466f-8d6e-4cb6-8001-f4e245f222b7\", \"serverName\" : \"Unnamed Server\", \"datacenterId\" : \"6e54a9ec-aace-4176-8ee4-1c3a704fccfc\", \"datacenterName\" : \"IpConsumerDC\", \"k8sNodePoolUuid\" : \"6e54a9ec-aace-4176-8ee4-1c3a704fcc12\", \"k8sClusterUuid\" : \"6e54a9ec-aace-4176-8ee4-1c3a704fcc23\"} ] }", value = "Read-Only attribute. Lists consumption detail for an individual IP")

  public List<IpConsumer> getIpConsumers() {
    return ipConsumers;
  }


  public void setIpConsumers(List<IpConsumer> ipConsumers) {
    this.ipConsumers = ipConsumers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpBlockProperties ipBlockProperties = (IpBlockProperties) o;
    return Objects.equals(this.ips, ipBlockProperties.ips) && Objects.equals(this.location, ipBlockProperties.location) && Objects.equals(this.size, ipBlockProperties.size) && Objects.equals(this.name, ipBlockProperties.name) && Objects.equals(this.ipConsumers, ipBlockProperties.ipConsumers);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpBlockProperties {\n");
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ipConsumers: ").append(toIndentedString(ipConsumers)).append("\n");
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

