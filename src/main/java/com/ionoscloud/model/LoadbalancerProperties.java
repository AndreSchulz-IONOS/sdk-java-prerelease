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
 * LoadbalancerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-27T14:18:19.688Z[Etc/UTC]")

public class LoadbalancerProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * IPv4 address of the loadbalancer. All attached NICs will inherit this IP. Leaving value null will assign IP automatically
   */
  @JsonAdapter(IpEnum.Adapter.class)
  public enum IpEnum {
    _VALID_IP_ADDRESS_("@Valid IP address@"),
    
    NULL("null");

    private String value;

    IpEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IpEnum fromValue(String value) {
      for (IpEnum b : IpEnum.values()) {
        if (b.value.equals(value) || value.equals("collection")) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IpEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IpEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IpEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IpEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private IpEnum ip;

  public static final String SERIALIZED_NAME_DHCP = "dhcp";
  @SerializedName(SERIALIZED_NAME_DHCP)
  private Boolean dhcp;


  public LoadbalancerProperties name(String name) {
    
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


  public LoadbalancerProperties ip(IpEnum ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * IPv4 address of the loadbalancer. All attached NICs will inherit this IP. Leaving value null will assign IP automatically
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22.231.113.64", value = "IPv4 address of the loadbalancer. All attached NICs will inherit this IP. Leaving value null will assign IP automatically")

  public IpEnum getIp() {
    return ip;
  }


  public void setIp(IpEnum ip) {
    this.ip = ip;
  }


  public LoadbalancerProperties dhcp(Boolean dhcp) {
    
    this.dhcp = dhcp;
    return this;
  }

   /**
   * Indicates if the loadbalancer will reserve an IP using DHCP
   * @return dhcp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates if the loadbalancer will reserve an IP using DHCP")

  public Boolean getDhcp() {
    return dhcp;
  }


  public void setDhcp(Boolean dhcp) {
    this.dhcp = dhcp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadbalancerProperties loadbalancerProperties = (LoadbalancerProperties) o;
    return Objects.equals(this.name, loadbalancerProperties.name) && Objects.equals(this.ip, loadbalancerProperties.ip) && Objects.equals(this.dhcp, loadbalancerProperties.dhcp);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadbalancerProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    dhcp: ").append(toIndentedString(dhcp)).append("\n");
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

