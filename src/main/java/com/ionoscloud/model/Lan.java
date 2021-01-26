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
import com.ionoscloud.model.DatacenterElementMetadata;
import com.ionoscloud.model.LanEntities;
import com.ionoscloud.model.LanProperties;
import com.ionoscloud.model.Type;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;

/**
 * Lan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-26T12:54:38.415Z[Etc/UTC]")

public class Lan {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Type type;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private DatacenterElementMetadata metadata;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private LanProperties properties;

  public static final String SERIALIZED_NAME_ENTITIES = "entities";
  @SerializedName(SERIALIZED_NAME_ENTITIES)
  private LanEntities entities;


   /**
   * The resource&#39;s unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "The resource's unique identifier")

  public String getId() {
    return id;
  }




  public Lan type(Type type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of object that has been created
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"lan\"", value = "The type of object that has been created")

  public Type getType() {
    return type;
  }


  public void setType(Type type) {
    this.type = type;
  }


   /**
   * URL to the object representation (absolute path)
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<RESOURCE-URI>", value = "URL to the object representation (absolute path)")

  public URI getHref() {
    return href;
  }




  public Lan metadata(DatacenterElementMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatacenterElementMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(DatacenterElementMetadata metadata) {
    this.metadata = metadata;
  }


  public Lan properties(LanProperties properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(required = true, value = "")

  public LanProperties getProperties() {
    return properties;
  }


  public void setProperties(LanProperties properties) {
    this.properties = properties;
  }


  public Lan entities(LanEntities entities) {
    
    this.entities = entities;
    return this;
  }

   /**
   * Get entities
   * @return entities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LanEntities getEntities() {
    return entities;
  }


  public void setEntities(LanEntities entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lan lan = (Lan) o;
    return Objects.equals(this.id, lan.id) && Objects.equals(this.type, lan.type) && Objects.equals(this.href, lan.href) && Objects.equals(this.metadata, lan.metadata) && Objects.equals(this.properties, lan.properties) && Objects.equals(this.entities, lan.entities);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lan {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

