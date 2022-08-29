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
 * BackupUnitProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T14:47:41.954Z[Etc/UTC]")

public class BackupUnitProperties {
  
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;


  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  

  public BackupUnitProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the  resource (alphanumeric characters only).
   * @return name
  **/
  @ApiModelProperty(example = "BackupUnitName", required = true, value = "The name of the  resource (alphanumeric characters only).")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  public BackupUnitProperties password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The password associated with that resource.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mypass123", value = "The password associated with that resource.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }



  public BackupUnitProperties email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email associated with the backup unit. Bear in mind that this email does not be the same email as of the user.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "email@email.com", value = "The email associated with the backup unit. Bear in mind that this email does not be the same email as of the user.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupUnitProperties backupUnitProperties = (BackupUnitProperties) o;
    return Objects.equals(this.name, backupUnitProperties.name) && Objects.equals(this.password, backupUnitProperties.password) && Objects.equals(this.email, backupUnitProperties.email);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupUnitProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    password: ").append(toIndentedString(password)).append("\n");

    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

