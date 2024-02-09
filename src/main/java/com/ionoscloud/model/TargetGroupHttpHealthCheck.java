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
 * TargetGroupHttpHealthCheck
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-01T15:22:04.229Z[Etc/UTC]")

public class TargetGroupHttpHealthCheck {
  
  /**
   * Specify the target&#39;s response type to match ALB&#39;s request.
   */
  @JsonAdapter(MatchTypeEnum.Adapter.class)
  public enum MatchTypeEnum {
    STATUS_CODE("STATUS_CODE"),
    
    RESPONSE_BODY("RESPONSE_BODY");

    private String value;

    MatchTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MatchTypeEnum fromValue(String value) {

      for (MatchTypeEnum b : MatchTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MatchTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MatchTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MatchTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MatchTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MATCH_TYPE = "matchType";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private MatchTypeEnum matchType;


  /**
   * The method used for the health check request.
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    HEAD("HEAD"),
    
    PUT("PUT"),
    
    POST("POST"),
    
    GET("GET"),
    
    TRACE("TRACE"),
    
    PATCH("PATCH"),
    
    OPTIONS("OPTIONS");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {

      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private MethodEnum method;


  public static final String SERIALIZED_NAME_NEGATE = "negate";
  @SerializedName(SERIALIZED_NAME_NEGATE)
  private Boolean negate;


  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;


  public static final String SERIALIZED_NAME_REGEX = "regex";
  @SerializedName(SERIALIZED_NAME_REGEX)
  private Boolean regex;


  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private String response;

  

  public TargetGroupHttpHealthCheck matchType(MatchTypeEnum matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Specify the target&#39;s response type to match ALB&#39;s request.
   * @return matchType
  **/
  @ApiModelProperty(example = "STATUS_CODE", required = true, value = "Specify the target's response type to match ALB's request.")

  public MatchTypeEnum getMatchType() {
    return matchType;
  }


  public void setMatchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
  }



  public TargetGroupHttpHealthCheck method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * The method used for the health check request.
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GET", value = "The method used for the health check request.")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }



  public TargetGroupHttpHealthCheck negate(Boolean negate) {
    
    this.negate = negate;
    return this;
  }

   /**
   * Specifies whether to negate an individual entry; the default value is &#39;FALSE&#39;.
   * @return negate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Specifies whether to negate an individual entry; the default value is 'FALSE'.")

  public Boolean getNegate() {
    return negate;
  }


  public void setNegate(Boolean negate) {
    this.negate = negate;
  }



  public TargetGroupHttpHealthCheck path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The destination URL for HTTP the health check; the default is &#39;/&#39;.
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/monitoring", value = "The destination URL for HTTP the health check; the default is '/'.")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }



  public TargetGroupHttpHealthCheck regex(Boolean regex) {
    
    this.regex = regex;
    return this;
  }

   /**
   * Specifies whether to use a regular expression to parse the response body; the default value is &#39;FALSE&#39;.  By using regular expressions, you can flexibly customize the expected response from a healthy server.
   * @return regex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Specifies whether to use a regular expression to parse the response body; the default value is 'FALSE'.  By using regular expressions, you can flexibly customize the expected response from a healthy server.")

  public Boolean getRegex() {
    return regex;
  }


  public void setRegex(Boolean regex) {
    this.regex = regex;
  }



  public TargetGroupHttpHealthCheck response(String response) {
    
    this.response = response;
    return this;
  }

   /**
   * The response returned by the request. It can be a status code or a response body depending on the definition of &#39;matchType&#39;.
   * @return response
  **/
  @ApiModelProperty(example = "200", required = true, value = "The response returned by the request. It can be a status code or a response body depending on the definition of 'matchType'.")

  public String getResponse() {
    return response;
  }


  public void setResponse(String response) {
    this.response = response;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetGroupHttpHealthCheck targetGroupHttpHealthCheck = (TargetGroupHttpHealthCheck) o;
    return Objects.equals(this.matchType, targetGroupHttpHealthCheck.matchType) && Objects.equals(this.method, targetGroupHttpHealthCheck.method) && Objects.equals(this.negate, targetGroupHttpHealthCheck.negate) && Objects.equals(this.path, targetGroupHttpHealthCheck.path) && Objects.equals(this.regex, targetGroupHttpHealthCheck.regex) && Objects.equals(this.response, targetGroupHttpHealthCheck.response);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetGroupHttpHealthCheck {\n");
    
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");

    sb.append("    method: ").append(toIndentedString(method)).append("\n");

    sb.append("    negate: ").append(toIndentedString(negate)).append("\n");

    sb.append("    path: ").append(toIndentedString(path)).append("\n");

    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");

    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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



// TargetGroupHttpHealthCheck instantiates a new TargetGroupHttpHealthCheck object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public TargetGroupHttpHealthCheck(MatchTypeEnum MatchType, String Response) {

	this.matchType = MatchType;
	this.response = Response;
}

public TargetGroupHttpHealthCheck() {
}

}
