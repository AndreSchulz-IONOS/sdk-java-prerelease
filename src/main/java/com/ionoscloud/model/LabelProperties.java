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
 * LabelProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-24T08:15:36.431Z[Etc/UTC]")

public class LabelProperties {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resourceId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resourceType";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public static final String SERIALIZED_NAME_RESOURCE_HREF = "resourceHref";
  @SerializedName(SERIALIZED_NAME_RESOURCE_HREF)
  private String resourceHref;


  public LabelProperties key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * A Label Key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "environment", value = "A Label Key")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public LabelProperties value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * A Label Value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "production", value = "A Label Value")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public LabelProperties resourceId(String resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * The id of the resource
   * @return resourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "700e1cab-99b2-4c30-ba8c-1d273ddba022", value = "The id of the resource")

  public String getResourceId() {
    return resourceId;
  }


  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public LabelProperties resourceType(String resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * The type of the resource on which the label is applied.
   * @return resourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "datacenter", value = "The type of the resource on which the label is applied.")

  public String getResourceType() {
    return resourceType;
  }


  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  public LabelProperties resourceHref(String resourceHref) {
    
    this.resourceHref = resourceHref;
    return this;
  }

   /**
   * URL to the Resource (absolute path) on which the label is applied.
   * @return resourceHref
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://<hostname>/datacenters/700e1cab-99b2-4c30-ba8c-1d273ddba022", value = "URL to the Resource (absolute path) on which the label is applied.")

  public String getResourceHref() {
    return resourceHref;
  }


  public void setResourceHref(String resourceHref) {
    this.resourceHref = resourceHref;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelProperties labelProperties = (LabelProperties) o;
    return Objects.equals(this.key, labelProperties.key) && Objects.equals(this.value, labelProperties.value) && Objects.equals(this.resourceId, labelProperties.resourceId) && Objects.equals(this.resourceType, labelProperties.resourceType) && Objects.equals(this.resourceHref, labelProperties.resourceHref);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelProperties {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceHref: ").append(toIndentedString(resourceHref)).append("\n");
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

