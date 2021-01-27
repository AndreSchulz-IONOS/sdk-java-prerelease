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

/**
 * IpConsumer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-27T13:42:21.767Z[Etc/UTC]")

public class IpConsumer {
  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_MAC = "mac";
  @SerializedName(SERIALIZED_NAME_MAC)
  private String mac;

  public static final String SERIALIZED_NAME_NIC_ID = "nicId";
  @SerializedName(SERIALIZED_NAME_NIC_ID)
  private String nicId;

  public static final String SERIALIZED_NAME_SERVER_ID = "serverId";
  @SerializedName(SERIALIZED_NAME_SERVER_ID)
  private String serverId;

  public static final String SERIALIZED_NAME_SERVER_NAME = "serverName";
  @SerializedName(SERIALIZED_NAME_SERVER_NAME)
  private String serverName;

  public static final String SERIALIZED_NAME_DATACENTER_ID = "datacenterId";
  @SerializedName(SERIALIZED_NAME_DATACENTER_ID)
  private String datacenterId;

  public static final String SERIALIZED_NAME_DATACENTER_NAME = "datacenterName";
  @SerializedName(SERIALIZED_NAME_DATACENTER_NAME)
  private String datacenterName;


  public IpConsumer ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }


  public IpConsumer mac(String mac) {
    
    this.mac = mac;
    return this;
  }

   /**
   * Get mac
   * @return mac
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMac() {
    return mac;
  }


  public void setMac(String mac) {
    this.mac = mac;
  }


  public IpConsumer nicId(String nicId) {
    
    this.nicId = nicId;
    return this;
  }

   /**
   * Get nicId
   * @return nicId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNicId() {
    return nicId;
  }


  public void setNicId(String nicId) {
    this.nicId = nicId;
  }


  public IpConsumer serverId(String serverId) {
    
    this.serverId = serverId;
    return this;
  }

   /**
   * Get serverId
   * @return serverId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServerId() {
    return serverId;
  }


  public void setServerId(String serverId) {
    this.serverId = serverId;
  }


  public IpConsumer serverName(String serverName) {
    
    this.serverName = serverName;
    return this;
  }

   /**
   * Get serverName
   * @return serverName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServerName() {
    return serverName;
  }


  public void setServerName(String serverName) {
    this.serverName = serverName;
  }


  public IpConsumer datacenterId(String datacenterId) {
    
    this.datacenterId = datacenterId;
    return this;
  }

   /**
   * Get datacenterId
   * @return datacenterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatacenterId() {
    return datacenterId;
  }


  public void setDatacenterId(String datacenterId) {
    this.datacenterId = datacenterId;
  }


  public IpConsumer datacenterName(String datacenterName) {
    
    this.datacenterName = datacenterName;
    return this;
  }

   /**
   * Get datacenterName
   * @return datacenterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatacenterName() {
    return datacenterName;
  }


  public void setDatacenterName(String datacenterName) {
    this.datacenterName = datacenterName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpConsumer ipConsumer = (IpConsumer) o;
    return Objects.equals(this.ip, ipConsumer.ip) && Objects.equals(this.mac, ipConsumer.mac) && Objects.equals(this.nicId, ipConsumer.nicId) && Objects.equals(this.serverId, ipConsumer.serverId) && Objects.equals(this.serverName, ipConsumer.serverName) && Objects.equals(this.datacenterId, ipConsumer.datacenterId) && Objects.equals(this.datacenterName, ipConsumer.datacenterName);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpConsumer {\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
    sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    datacenterId: ").append(toIndentedString(datacenterId)).append("\n");
    sb.append("    datacenterName: ").append(toIndentedString(datacenterName)).append("\n");
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

