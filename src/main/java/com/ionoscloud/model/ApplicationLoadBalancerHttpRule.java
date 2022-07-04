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
import com.ionoscloud.model.ApplicationLoadBalancerHttpRuleCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApplicationLoadBalancerHttpRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-04T14:02:16.072Z[Etc/UTC]")

public class ApplicationLoadBalancerHttpRule {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Type of the HTTP rule.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FORWARD("FORWARD"),
    
    STATIC("STATIC"),
    
    REDIRECT("REDIRECT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {

      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_TARGET_GROUP = "targetGroup";
  @SerializedName(SERIALIZED_NAME_TARGET_GROUP)
  private String targetGroup;

  public static final String SERIALIZED_NAME_DROP_QUERY = "dropQuery";
  @SerializedName(SERIALIZED_NAME_DROP_QUERY)
  private Boolean dropQuery;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  /**
   * Valid only for REDIRECT and STATIC actions. For REDIRECT actions, default is 301 and possible values are 301, 302, 303, 307, and 308. For STATIC actions, default is 503 and valid range is 200 to 599.
   */
  @JsonAdapter(StatusCodeEnum.Adapter.class)
  public enum StatusCodeEnum {
    NUMBER_301(301),
    
    NUMBER_302(302),
    
    NUMBER_303(303),
    
    NUMBER_307(307),
    
    NUMBER_308(308),
    
    NUMBER_200(200),
    
    NUMBER_503(503),
    
    NUMBER_599(599);

    private Integer value;

    StatusCodeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusCodeEnum fromValue(Integer value) {

      for (StatusCodeEnum b : StatusCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusCodeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return StatusCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS_CODE = "statusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private StatusCodeEnum statusCode;

  public static final String SERIALIZED_NAME_RESPONSE_MESSAGE = "responseMessage";
  @SerializedName(SERIALIZED_NAME_RESPONSE_MESSAGE)
  private String responseMessage;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<ApplicationLoadBalancerHttpRuleCondition> conditions = null;


  public ApplicationLoadBalancerHttpRule name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The unique name of the Application Load Balancer HTTP rule.
   * @return name
  **/
  @ApiModelProperty(example = "My Application Load Balancer HTTP rule", required = true, value = "The unique name of the Application Load Balancer HTTP rule.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ApplicationLoadBalancerHttpRule type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of the HTTP rule.
   * @return type
  **/
  @ApiModelProperty(example = "FORWARD", required = true, value = "Type of the HTTP rule.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ApplicationLoadBalancerHttpRule targetGroup(String targetGroup) {
    
    this.targetGroup = targetGroup;
    return this;
  }

   /**
   * The ID of the target group; mandatory and only valid for FORWARD actions.
   * @return targetGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "96e514d0-73e4-4abd-8fbc-c0f53b79bfae", value = "The ID of the target group; mandatory and only valid for FORWARD actions.")

  public String getTargetGroup() {
    return targetGroup;
  }


  public void setTargetGroup(String targetGroup) {
    this.targetGroup = targetGroup;
  }


  public ApplicationLoadBalancerHttpRule dropQuery(Boolean dropQuery) {
    
    this.dropQuery = dropQuery;
    return this;
  }

   /**
   * Default is false; valid only for REDIRECT actions.
   * @return dropQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Default is false; valid only for REDIRECT actions.")

  public Boolean getDropQuery() {
    return dropQuery;
  }


  public void setDropQuery(Boolean dropQuery) {
    this.dropQuery = dropQuery;
  }


  public ApplicationLoadBalancerHttpRule location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * The location for redirecting; mandatory and valid only for REDIRECT actions.
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "www.ionos.com", value = "The location for redirecting; mandatory and valid only for REDIRECT actions.")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public ApplicationLoadBalancerHttpRule statusCode(StatusCodeEnum statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Valid only for REDIRECT and STATIC actions. For REDIRECT actions, default is 301 and possible values are 301, 302, 303, 307, and 308. For STATIC actions, default is 503 and valid range is 200 to 599.
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "301", value = "Valid only for REDIRECT and STATIC actions. For REDIRECT actions, default is 301 and possible values are 301, 302, 303, 307, and 308. For STATIC actions, default is 503 and valid range is 200 to 599.")

  public StatusCodeEnum getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }


  public ApplicationLoadBalancerHttpRule responseMessage(String responseMessage) {
    
    this.responseMessage = responseMessage;
    return this;
  }

   /**
   * The response message of the request; mandatory for STATIC actions.
   * @return responseMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Application Down", value = "The response message of the request; mandatory for STATIC actions.")

  public String getResponseMessage() {
    return responseMessage;
  }


  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }


  public ApplicationLoadBalancerHttpRule contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Valid only for STATIC actions.
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "text/html", value = "Valid only for STATIC actions.")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public ApplicationLoadBalancerHttpRule conditions(List<ApplicationLoadBalancerHttpRuleCondition> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public ApplicationLoadBalancerHttpRule addConditionsItem(ApplicationLoadBalancerHttpRuleCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<ApplicationLoadBalancerHttpRuleCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * An array of items in the collection.The action is only performed if each and every condition is met; if no conditions are set, the rule will always be performed.
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of items in the collection.The action is only performed if each and every condition is met; if no conditions are set, the rule will always be performed.")

  public List<ApplicationLoadBalancerHttpRuleCondition> getConditions() {
    return conditions;
  }


  public void setConditions(List<ApplicationLoadBalancerHttpRuleCondition> conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationLoadBalancerHttpRule applicationLoadBalancerHttpRule = (ApplicationLoadBalancerHttpRule) o;
    return Objects.equals(this.name, applicationLoadBalancerHttpRule.name) && Objects.equals(this.type, applicationLoadBalancerHttpRule.type) && Objects.equals(this.targetGroup, applicationLoadBalancerHttpRule.targetGroup) && Objects.equals(this.dropQuery, applicationLoadBalancerHttpRule.dropQuery) && Objects.equals(this.location, applicationLoadBalancerHttpRule.location) && Objects.equals(this.statusCode, applicationLoadBalancerHttpRule.statusCode) && Objects.equals(this.responseMessage, applicationLoadBalancerHttpRule.responseMessage) && Objects.equals(this.contentType, applicationLoadBalancerHttpRule.contentType) && Objects.equals(this.conditions, applicationLoadBalancerHttpRule.conditions);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationLoadBalancerHttpRule {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    targetGroup: ").append(toIndentedString(targetGroup)).append("\n");
    sb.append("    dropQuery: ").append(toIndentedString(dropQuery)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

