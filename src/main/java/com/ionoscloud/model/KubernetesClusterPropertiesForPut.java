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
import com.ionoscloud.model.KubernetesMaintenanceWindow;
import com.ionoscloud.model.S3Bucket;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * KubernetesClusterPropertiesForPut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-01T15:22:04.229Z[Etc/UTC]")

public class KubernetesClusterPropertiesForPut {
  
  public static final String SERIALIZED_NAME_API_SUBNET_ALLOW_LIST = "apiSubnetAllowList";
  @SerializedName(SERIALIZED_NAME_API_SUBNET_ALLOW_LIST)
  private List<String> apiSubnetAllowList = null;


  public static final String SERIALIZED_NAME_K8S_VERSION = "k8sVersion";
  @SerializedName(SERIALIZED_NAME_K8S_VERSION)
  private String k8sVersion;


  public static final String SERIALIZED_NAME_MAINTENANCE_WINDOW = "maintenanceWindow";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_WINDOW)
  private KubernetesMaintenanceWindow maintenanceWindow;


  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_S3_BUCKETS = "s3Buckets";
  @SerializedName(SERIALIZED_NAME_S3_BUCKETS)
  private List<S3Bucket> s3Buckets = null;

  

  public KubernetesClusterPropertiesForPut apiSubnetAllowList(List<String> apiSubnetAllowList) {
    
    this.apiSubnetAllowList = apiSubnetAllowList;
    return this;
  }

  public KubernetesClusterPropertiesForPut addApiSubnetAllowListItem(String apiSubnetAllowListItem) {
    if (this.apiSubnetAllowList == null) {
      this.apiSubnetAllowList = new ArrayList<String>();
    }
    this.apiSubnetAllowList.add(apiSubnetAllowListItem);
    return this;
  }

   /**
   * Access to the K8s API server is restricted to these CIDRs. Intra-cluster traffic is not affected by this restriction. If no AllowList is specified, access is not limited. If an IP is specified without a subnet mask, the default value is 32 for IPv4 and 128 for IPv6.
   * @return apiSubnetAllowList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1.2.3.4/32, 2002::1234:abcd:ffff:c0a8:101/64, 1.2.3.4, 2002::1234:abcd:ffff:c0a8:101]", value = "Access to the K8s API server is restricted to these CIDRs. Intra-cluster traffic is not affected by this restriction. If no AllowList is specified, access is not limited. If an IP is specified without a subnet mask, the default value is 32 for IPv4 and 128 for IPv6.")

  public List<String> getApiSubnetAllowList() {
    return apiSubnetAllowList;
  }


  public void setApiSubnetAllowList(List<String> apiSubnetAllowList) {
    this.apiSubnetAllowList = apiSubnetAllowList;
  }



  public KubernetesClusterPropertiesForPut k8sVersion(String k8sVersion) {
    
    this.k8sVersion = k8sVersion;
    return this;
  }

   /**
   * The Kubernetes version that the cluster is running. This limits which Kubernetes versions can run in a cluster&#39;s node pools. Also, not all Kubernetes versions are suitable upgrade targets for all earlier versions.
   * @return k8sVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.15.4", value = "The Kubernetes version that the cluster is running. This limits which Kubernetes versions can run in a cluster's node pools. Also, not all Kubernetes versions are suitable upgrade targets for all earlier versions.")

  public String getK8sVersion() {
    return k8sVersion;
  }


  public void setK8sVersion(String k8sVersion) {
    this.k8sVersion = k8sVersion;
  }



  public KubernetesClusterPropertiesForPut maintenanceWindow(KubernetesMaintenanceWindow maintenanceWindow) {
    
    this.maintenanceWindow = maintenanceWindow;
    return this;
  }

   /**
   * Get maintenanceWindow
   * @return maintenanceWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KubernetesMaintenanceWindow getMaintenanceWindow() {
    return maintenanceWindow;
  }


  public void setMaintenanceWindow(KubernetesMaintenanceWindow maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
  }



  public KubernetesClusterPropertiesForPut name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A Kubernetes cluster name. Valid Kubernetes cluster name must be 63 characters or less and must be empty or begin and end with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * @return name
  **/
  @ApiModelProperty(example = "k8s", required = true, value = "A Kubernetes cluster name. Valid Kubernetes cluster name must be 63 characters or less and must be empty or begin and end with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  public KubernetesClusterPropertiesForPut s3Buckets(List<S3Bucket> s3Buckets) {
    
    this.s3Buckets = s3Buckets;
    return this;
  }

  public KubernetesClusterPropertiesForPut addS3BucketsItem(S3Bucket s3BucketsItem) {
    if (this.s3Buckets == null) {
      this.s3Buckets = new ArrayList<S3Bucket>();
    }
    this.s3Buckets.add(s3BucketsItem);
    return this;
  }

   /**
   * List of S3 buckets configured for K8s usage. At the moment, it contains only one S3 bucket that is used to store K8s API audit logs.
   * @return s3Buckets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of S3 buckets configured for K8s usage. At the moment, it contains only one S3 bucket that is used to store K8s API audit logs.")

  public List<S3Bucket> getS3Buckets() {
    return s3Buckets;
  }


  public void setS3Buckets(List<S3Bucket> s3Buckets) {
    this.s3Buckets = s3Buckets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubernetesClusterPropertiesForPut kubernetesClusterPropertiesForPut = (KubernetesClusterPropertiesForPut) o;
    return Objects.equals(this.apiSubnetAllowList, kubernetesClusterPropertiesForPut.apiSubnetAllowList) && Objects.equals(this.k8sVersion, kubernetesClusterPropertiesForPut.k8sVersion) && Objects.equals(this.maintenanceWindow, kubernetesClusterPropertiesForPut.maintenanceWindow) && Objects.equals(this.name, kubernetesClusterPropertiesForPut.name) && Objects.equals(this.s3Buckets, kubernetesClusterPropertiesForPut.s3Buckets);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesClusterPropertiesForPut {\n");
    
    sb.append("    apiSubnetAllowList: ").append(toIndentedString(apiSubnetAllowList)).append("\n");

    sb.append("    k8sVersion: ").append(toIndentedString(k8sVersion)).append("\n");

    sb.append("    maintenanceWindow: ").append(toIndentedString(maintenanceWindow)).append("\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    s3Buckets: ").append(toIndentedString(s3Buckets)).append("\n");
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



// KubernetesClusterPropertiesForPut instantiates a new KubernetesClusterPropertiesForPut object
// This constructor makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
public KubernetesClusterPropertiesForPut(String Name) {

	this.name = Name;
}

public KubernetesClusterPropertiesForPut() {
}

}
