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
import com.ionoscloud.model.NetworkLoadBalancerForwardingRuleHealthCheck;
import com.ionoscloud.model.NetworkLoadBalancerForwardingRuleTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NetworkLoadBalancerForwardingRuleProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T14:47:41.954Z[Etc/UTC]")

public class NetworkLoadBalancerForwardingRuleProperties {
  
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  /**
   * Balancing algorithm
   */
  @JsonAdapter(AlgorithmEnum.Adapter.class)
  public enum AlgorithmEnum {
    ROUND_ROBIN("ROUND_ROBIN"),
    
    LEAST_CONNECTION("LEAST_CONNECTION"),
    
    RANDOM("RANDOM"),
    
    SOURCE_IP("SOURCE_IP");

    private String value;

    AlgorithmEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlgorithmEnum fromValue(String value) {

      for (AlgorithmEnum b : AlgorithmEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AlgorithmEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlgorithmEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlgorithmEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AlgorithmEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALGORITHM = "algorithm";
  @SerializedName(SERIALIZED_NAME_ALGORITHM)
  private AlgorithmEnum algorithm;


  /**
   * Balancing protocol
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    HTTP("HTTP"),
    
    TCP("TCP");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProtocolEnum fromValue(String value) {

      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProtocolEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private ProtocolEnum protocol;


  public static final String SERIALIZED_NAME_LISTENER_IP = "listenerIp";
  @SerializedName(SERIALIZED_NAME_LISTENER_IP)
  private String listenerIp;


  public static final String SERIALIZED_NAME_LISTENER_PORT = "listenerPort";
  @SerializedName(SERIALIZED_NAME_LISTENER_PORT)
  private Integer listenerPort;


  public static final String SERIALIZED_NAME_HEALTH_CHECK = "healthCheck";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK)
  private NetworkLoadBalancerForwardingRuleHealthCheck healthCheck;


  public static final String SERIALIZED_NAME_TARGETS = "targets";
  @SerializedName(SERIALIZED_NAME_TARGETS)
  private List<NetworkLoadBalancerForwardingRuleTarget> targets = new ArrayList<NetworkLoadBalancerForwardingRuleTarget>();

  

  public NetworkLoadBalancerForwardingRuleProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the Network Load Balancer forwarding rule.
   * @return name
  **/
  @ApiModelProperty(example = "My Network Load Balancer forwarding rule", required = true, value = "The name of the Network Load Balancer forwarding rule.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  public NetworkLoadBalancerForwardingRuleProperties algorithm(AlgorithmEnum algorithm) {
    
    this.algorithm = algorithm;
    return this;
  }

   /**
   * Balancing algorithm
   * @return algorithm
  **/
  @ApiModelProperty(example = "ROUND_ROBIN", required = true, value = "Balancing algorithm")

  public AlgorithmEnum getAlgorithm() {
    return algorithm;
  }


  public void setAlgorithm(AlgorithmEnum algorithm) {
    this.algorithm = algorithm;
  }



  public NetworkLoadBalancerForwardingRuleProperties protocol(ProtocolEnum protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Balancing protocol
   * @return protocol
  **/
  @ApiModelProperty(example = "HTTP", required = true, value = "Balancing protocol")

  public ProtocolEnum getProtocol() {
    return protocol;
  }


  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }



  public NetworkLoadBalancerForwardingRuleProperties listenerIp(String listenerIp) {
    
    this.listenerIp = listenerIp;
    return this;
  }

   /**
   * Listening (inbound) IP
   * @return listenerIp
  **/
  @ApiModelProperty(example = "81.173.1.2", required = true, value = "Listening (inbound) IP")

  public String getListenerIp() {
    return listenerIp;
  }


  public void setListenerIp(String listenerIp) {
    this.listenerIp = listenerIp;
  }



  public NetworkLoadBalancerForwardingRuleProperties listenerPort(Integer listenerPort) {
    
    this.listenerPort = listenerPort;
    return this;
  }

   /**
   * Listening (inbound) port number; valid range is 1 to 65535.
   * @return listenerPort
  **/
  @ApiModelProperty(example = "8080", required = true, value = "Listening (inbound) port number; valid range is 1 to 65535.")

  public Integer getListenerPort() {
    return listenerPort;
  }


  public void setListenerPort(Integer listenerPort) {
    this.listenerPort = listenerPort;
  }



  public NetworkLoadBalancerForwardingRuleProperties healthCheck(NetworkLoadBalancerForwardingRuleHealthCheck healthCheck) {
    
    this.healthCheck = healthCheck;
    return this;
  }

   /**
   * Get healthCheck
   * @return healthCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NetworkLoadBalancerForwardingRuleHealthCheck getHealthCheck() {
    return healthCheck;
  }


  public void setHealthCheck(NetworkLoadBalancerForwardingRuleHealthCheck healthCheck) {
    this.healthCheck = healthCheck;
  }



  public NetworkLoadBalancerForwardingRuleProperties targets(List<NetworkLoadBalancerForwardingRuleTarget> targets) {
    
    this.targets = targets;
    return this;
  }

  public NetworkLoadBalancerForwardingRuleProperties addTargetsItem(NetworkLoadBalancerForwardingRuleTarget targetsItem) {
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * Array of items in the collection.
   * @return targets
  **/
  @ApiModelProperty(required = true, value = "Array of items in the collection.")

  public List<NetworkLoadBalancerForwardingRuleTarget> getTargets() {
    return targets;
  }


  public void setTargets(List<NetworkLoadBalancerForwardingRuleTarget> targets) {
    this.targets = targets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkLoadBalancerForwardingRuleProperties networkLoadBalancerForwardingRuleProperties = (NetworkLoadBalancerForwardingRuleProperties) o;
    return Objects.equals(this.name, networkLoadBalancerForwardingRuleProperties.name) && Objects.equals(this.algorithm, networkLoadBalancerForwardingRuleProperties.algorithm) && Objects.equals(this.protocol, networkLoadBalancerForwardingRuleProperties.protocol) && Objects.equals(this.listenerIp, networkLoadBalancerForwardingRuleProperties.listenerIp) && Objects.equals(this.listenerPort, networkLoadBalancerForwardingRuleProperties.listenerPort) && Objects.equals(this.healthCheck, networkLoadBalancerForwardingRuleProperties.healthCheck) && Objects.equals(this.targets, networkLoadBalancerForwardingRuleProperties.targets);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkLoadBalancerForwardingRuleProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");

    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");

    sb.append("    listenerIp: ").append(toIndentedString(listenerIp)).append("\n");

    sb.append("    listenerPort: ").append(toIndentedString(listenerPort)).append("\n");

    sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");

    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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

