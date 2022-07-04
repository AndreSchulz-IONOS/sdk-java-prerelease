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
 * TargetGroupTarget
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T09:11:50.011Z[Etc/UTC]")

public class TargetGroupTarget {
  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;

  public static final String SERIALIZED_NAME_HEALTH_CHECK_ENABLED = "healthCheckEnabled";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK_ENABLED)
  private Boolean healthCheckEnabled;

  public static final String SERIALIZED_NAME_MAINTENANCE_ENABLED = "maintenanceEnabled";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_ENABLED)
  private Boolean maintenanceEnabled;


  public TargetGroupTarget ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * The IP of the balanced target VM.
   * @return ip
  **/
  @ApiModelProperty(example = "22.231.2.2", required = true, value = "The IP of the balanced target VM.")

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }


  public TargetGroupTarget port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * The port of the balanced target service; valid range is 1 to 65535.
   * @return port
  **/
  @ApiModelProperty(example = "8080", required = true, value = "The port of the balanced target service; valid range is 1 to 65535.")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public TargetGroupTarget weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Traffic is distributed in proportion to target weight, relative to the combined weight of all targets. A target with higher weight receives a greater share of traffic. Valid range is 0 to 256 and default is 1; targets with weight of 0 do not participate in load balancing but still accept persistent connections. It is best use values in the middle of the range to leave room for later adjustments.
   * @return weight
  **/
  @ApiModelProperty(example = "123", required = true, value = "Traffic is distributed in proportion to target weight, relative to the combined weight of all targets. A target with higher weight receives a greater share of traffic. Valid range is 0 to 256 and default is 1; targets with weight of 0 do not participate in load balancing but still accept persistent connections. It is best use values in the middle of the range to leave room for later adjustments.")

  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  public TargetGroupTarget healthCheckEnabled(Boolean healthCheckEnabled) {
    
    this.healthCheckEnabled = healthCheckEnabled;
    return this;
  }

   /**
   * When the health check is enabled, the target is available only when it accepts regular TCP or HTTP connection attempts for state checking. The state check consists of one connection attempt with the target&#39;s address and port. The default value is &#39;TRUE&#39;.
   * @return healthCheckEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the health check is enabled, the target is available only when it accepts regular TCP or HTTP connection attempts for state checking. The state check consists of one connection attempt with the target's address and port. The default value is 'TRUE'.")

  public Boolean getHealthCheckEnabled() {
    return healthCheckEnabled;
  }


  public void setHealthCheckEnabled(Boolean healthCheckEnabled) {
    this.healthCheckEnabled = healthCheckEnabled;
  }


  public TargetGroupTarget maintenanceEnabled(Boolean maintenanceEnabled) {
    
    this.maintenanceEnabled = maintenanceEnabled;
    return this;
  }

   /**
   * When the maintenance mode is enabled, the target is prevented from receiving traffic; the default value is &#39;FALSE&#39;.
   * @return maintenanceEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the maintenance mode is enabled, the target is prevented from receiving traffic; the default value is 'FALSE'.")

  public Boolean getMaintenanceEnabled() {
    return maintenanceEnabled;
  }


  public void setMaintenanceEnabled(Boolean maintenanceEnabled) {
    this.maintenanceEnabled = maintenanceEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetGroupTarget targetGroupTarget = (TargetGroupTarget) o;
    return Objects.equals(this.ip, targetGroupTarget.ip) && Objects.equals(this.port, targetGroupTarget.port) && Objects.equals(this.weight, targetGroupTarget.weight) && Objects.equals(this.healthCheckEnabled, targetGroupTarget.healthCheckEnabled) && Objects.equals(this.maintenanceEnabled, targetGroupTarget.maintenanceEnabled);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetGroupTarget {\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    healthCheckEnabled: ").append(toIndentedString(healthCheckEnabled)).append("\n");
    sb.append("    maintenanceEnabled: ").append(toIndentedString(maintenanceEnabled)).append("\n");
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
