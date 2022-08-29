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
import java.util.ArrayList;
import java.util.List;

/**
 * ApplicationLoadBalancerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T14:47:41.954Z[Etc/UTC]")

public class ApplicationLoadBalancerProperties {
  
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_LISTENER_LAN = "listenerLan";
  @SerializedName(SERIALIZED_NAME_LISTENER_LAN)
  private Integer listenerLan;


  public static final String SERIALIZED_NAME_IPS = "ips";
  @SerializedName(SERIALIZED_NAME_IPS)
  private List<String> ips = null;


  public static final String SERIALIZED_NAME_TARGET_LAN = "targetLan";
  @SerializedName(SERIALIZED_NAME_TARGET_LAN)
  private Integer targetLan;


  public static final String SERIALIZED_NAME_LB_PRIVATE_IPS = "lbPrivateIps";
  @SerializedName(SERIALIZED_NAME_LB_PRIVATE_IPS)
  private List<String> lbPrivateIps = null;

  

  public ApplicationLoadBalancerProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the Application Load Balancer.
   * @return name
  **/
  @ApiModelProperty(example = "My Application Load Balancer", required = true, value = "The name of the Application Load Balancer.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  public ApplicationLoadBalancerProperties listenerLan(Integer listenerLan) {
    
    this.listenerLan = listenerLan;
    return this;
  }

   /**
   * ID of the listening (inbound) LAN.
   * @return listenerLan
  **/
  @ApiModelProperty(example = "1", required = true, value = "ID of the listening (inbound) LAN.")

  public Integer getListenerLan() {
    return listenerLan;
  }


  public void setListenerLan(Integer listenerLan) {
    this.listenerLan = listenerLan;
  }



  public ApplicationLoadBalancerProperties ips(List<String> ips) {
    
    this.ips = ips;
    return this;
  }

  public ApplicationLoadBalancerProperties addIpsItem(String ipsItem) {
    if (this.ips == null) {
      this.ips = new ArrayList<String>();
    }
    this.ips.add(ipsItem);
    return this;
  }

   /**
   * Collection of the Application Load Balancer IP addresses. (Inbound and outbound) IPs of the listenerLan are customer-reserved public IPs for the public Load Balancers, and private IPs for the private Load Balancers.
   * @return ips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[81.173.1.2, 22.231.2.2, 22.231.2.3]", value = "Collection of the Application Load Balancer IP addresses. (Inbound and outbound) IPs of the listenerLan are customer-reserved public IPs for the public Load Balancers, and private IPs for the private Load Balancers.")

  public List<String> getIps() {
    return ips;
  }


  public void setIps(List<String> ips) {
    this.ips = ips;
  }



  public ApplicationLoadBalancerProperties targetLan(Integer targetLan) {
    
    this.targetLan = targetLan;
    return this;
  }

   /**
   * ID of the balanced private target LAN (outbound).
   * @return targetLan
  **/
  @ApiModelProperty(example = "2", required = true, value = "ID of the balanced private target LAN (outbound).")

  public Integer getTargetLan() {
    return targetLan;
  }


  public void setTargetLan(Integer targetLan) {
    this.targetLan = targetLan;
  }



  public ApplicationLoadBalancerProperties lbPrivateIps(List<String> lbPrivateIps) {
    
    this.lbPrivateIps = lbPrivateIps;
    return this;
  }

  public ApplicationLoadBalancerProperties addLbPrivateIpsItem(String lbPrivateIpsItem) {
    if (this.lbPrivateIps == null) {
      this.lbPrivateIps = new ArrayList<String>();
    }
    this.lbPrivateIps.add(lbPrivateIpsItem);
    return this;
  }

   /**
   * Collection of private IP addresses with the subnet mask of the Application Load Balancer. IPs must contain valid a subnet mask. If no IP is provided, the system will generate an IP with /24 subnet.
   * @return lbPrivateIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[81.173.1.5/24, 22.231.2.5/24]", value = "Collection of private IP addresses with the subnet mask of the Application Load Balancer. IPs must contain valid a subnet mask. If no IP is provided, the system will generate an IP with /24 subnet.")

  public List<String> getLbPrivateIps() {
    return lbPrivateIps;
  }


  public void setLbPrivateIps(List<String> lbPrivateIps) {
    this.lbPrivateIps = lbPrivateIps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationLoadBalancerProperties applicationLoadBalancerProperties = (ApplicationLoadBalancerProperties) o;
    return Objects.equals(this.name, applicationLoadBalancerProperties.name) && Objects.equals(this.listenerLan, applicationLoadBalancerProperties.listenerLan) && Objects.equals(this.ips, applicationLoadBalancerProperties.ips) && Objects.equals(this.targetLan, applicationLoadBalancerProperties.targetLan) && Objects.equals(this.lbPrivateIps, applicationLoadBalancerProperties.lbPrivateIps);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationLoadBalancerProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    listenerLan: ").append(toIndentedString(listenerLan)).append("\n");

    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");

    sb.append("    targetLan: ").append(toIndentedString(targetLan)).append("\n");

    sb.append("    lbPrivateIps: ").append(toIndentedString(lbPrivateIps)).append("\n");
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

