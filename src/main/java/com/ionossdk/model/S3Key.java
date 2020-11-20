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


package com.ionossdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ionossdk.model.S3KeyMetadata;
import com.ionossdk.model.S3KeyProperties;
import com.ionossdk.model.Type;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;

/**
 * S3Key
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-20T17:37:47.381927+02:00[Europe/Bucharest]")
public class S3Key {
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
  private S3KeyMetadata metadata;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private S3KeyProperties properties;


   /**
   * The resource&#39;s unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15f67991-0f51-4efc-a8ad-ef1fb31a480c", value = "The resource's unique identifier")

  public String getId() {
    return id;
  }




  public S3Key type(Type type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the resource
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"group\"", value = "The type of the resource")

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
  @ApiModelProperty(example = "https://<API_HOST>/cloudapi/v5/um/users/15f67991-0f51-4efc-a8ad-ef1fb31a480c/s3keys/78fa888e106456c1482d", value = "URL to the object representation (absolute path)")

  public URI getHref() {
    return href;
  }




  public S3Key metadata(S3KeyMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public S3KeyMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(S3KeyMetadata metadata) {
    this.metadata = metadata;
  }


  public S3Key properties(S3KeyProperties properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(required = true, value = "")

  public S3KeyProperties getProperties() {
    return properties;
  }


  public void setProperties(S3KeyProperties properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3Key s3Key = (S3Key) o;
    return Objects.equals(this.id, s3Key.id) &&
        Objects.equals(this.type, s3Key.type) &&
        Objects.equals(this.href, s3Key.href) &&
        Objects.equals(this.metadata, s3Key.metadata) &&
        Objects.equals(this.properties, s3Key.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, href, metadata, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3Key {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
