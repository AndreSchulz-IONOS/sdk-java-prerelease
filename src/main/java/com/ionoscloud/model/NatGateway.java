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
import com.ionoscloud.model.DatacenterElementMetadata;
import com.ionoscloud.model.NatGatewayEntities;
import com.ionoscloud.model.NatGatewayProperties;
import com.ionoscloud.model.Type;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;

/**
 * NatGateway
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T14:47:41.954Z[Etc/UTC]")

public class NatGateway {
  
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
  private NatGatewayProperties properties;


  public static final String SERIALIZED_NAME_ENTITIES = "entities";
  @SerializedName(SERIALIZED_NAME_ENTITIES)
  private NatGatewayEntities entities;

  

   /**
   * The resource&#39;s unique identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15f67991-0f51-4efc-a8ad-ef1fb31a480c", value = "The resource's unique identifier.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }



  public NatGateway type(Type type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of object that has been created.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"nat-gateway\"", value = "The type of object that has been created.")

  public Type getType() {
    return type;
  }


  public void setType(Type type) {
    this.type = type;
  }



   /**
   * URL to the object representation (absolute path).
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<RESOURCE-URI>", value = "URL to the object representation (absolute path).")

  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }



  public NatGateway metadata(DatacenterElementMetadata metadata) {
    
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



  public NatGateway properties(NatGatewayProperties properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(required = true, value = "")

  public NatGatewayProperties getProperties() {
    return properties;
  }


  public void setProperties(NatGatewayProperties properties) {
    this.properties = properties;
  }



  public NatGateway entities(NatGatewayEntities entities) {
    
    this.entities = entities;
    return this;
  }

   /**
   * Get entities
   * @return entities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NatGatewayEntities getEntities() {
    return entities;
  }


  public void setEntities(NatGatewayEntities entities) {
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
    NatGateway natGateway = (NatGateway) o;
    return Objects.equals(this.id, natGateway.id) && Objects.equals(this.type, natGateway.type) && Objects.equals(this.href, natGateway.href) && Objects.equals(this.metadata, natGateway.metadata) && Objects.equals(this.properties, natGateway.properties) && Objects.equals(this.entities, natGateway.entities);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NatGateway {\n");
    
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

