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


package org.openapitools.client.model;

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
import org.openapitools.client.model.ResourceReference;

/**
 * ServerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-19T13:15:19.502219+02:00[Europe/Bucharest]")
public class ServerProperties {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CORES = "cores";
  @SerializedName(SERIALIZED_NAME_CORES)
  private Integer cores;

  public static final String SERIALIZED_NAME_RAM = "ram";
  @SerializedName(SERIALIZED_NAME_RAM)
  private Integer ram;

  /**
   * The availability zone in which the server should exist
   */
  @JsonAdapter(AvailabilityZoneEnum.Adapter.class)
  public enum AvailabilityZoneEnum {
    AUTO("AUTO"),
    
    ZONE_1("ZONE_1"),
    
    ZONE_2("ZONE_2");

    private String value;

    AvailabilityZoneEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AvailabilityZoneEnum fromValue(String value) {
      for (AvailabilityZoneEnum b : AvailabilityZoneEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AvailabilityZoneEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AvailabilityZoneEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AvailabilityZoneEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AvailabilityZoneEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AVAILABILITY_ZONE = "availabilityZone";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_ZONE)
  private AvailabilityZoneEnum availabilityZone;

  /**
   * Status of the virtual Machine
   */
  @JsonAdapter(VmStateEnum.Adapter.class)
  public enum VmStateEnum {
    NOSTATE("NOSTATE"),
    
    RUNNING("RUNNING"),
    
    BLOCKED("BLOCKED"),
    
    PAUSED("PAUSED"),
    
    SHUTDOWN("SHUTDOWN"),
    
    SHUTOFF("SHUTOFF"),
    
    CRASHED("CRASHED");

    private String value;

    VmStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VmStateEnum fromValue(String value) {
      for (VmStateEnum b : VmStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VmStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VmStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VmStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VmStateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VM_STATE = "vmState";
  @SerializedName(SERIALIZED_NAME_VM_STATE)
  private VmStateEnum vmState;

  public static final String SERIALIZED_NAME_BOOT_CDROM = "bootCdrom";
  @SerializedName(SERIALIZED_NAME_BOOT_CDROM)
  private ResourceReference bootCdrom;

  public static final String SERIALIZED_NAME_BOOT_VOLUME = "bootVolume";
  @SerializedName(SERIALIZED_NAME_BOOT_VOLUME)
  private ResourceReference bootVolume;

  public static final String SERIALIZED_NAME_CPU_FAMILY = "cpuFamily";
  @SerializedName(SERIALIZED_NAME_CPU_FAMILY)
  private String cpuFamily;


  public ServerProperties name(String name) {
    
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


  public ServerProperties cores(Integer cores) {
    
    this.cores = cores;
    return this;
  }

   /**
   * The total number of cores for the server
   * @return cores
  **/
  @ApiModelProperty(example = "4", required = true, value = "The total number of cores for the server")

  public Integer getCores() {
    return cores;
  }


  public void setCores(Integer cores) {
    this.cores = cores;
  }


  public ServerProperties ram(Integer ram) {
    
    this.ram = ram;
    return this;
  }

   /**
   * The amount of memory for the server in MB, e.g. 2048. Size must be specified in multiples of 256 MB with a minimum of 256 MB; however, if you set ramHotPlug to TRUE then you must use a minimum of 1024 MB. If you set the RAM size more than 240GB, then ramHotPlug will be set to FALSE and can not be set to TRUE unless RAM size not set to less than 240GB.
   * @return ram
  **/
  @ApiModelProperty(example = "4096", required = true, value = "The amount of memory for the server in MB, e.g. 2048. Size must be specified in multiples of 256 MB with a minimum of 256 MB; however, if you set ramHotPlug to TRUE then you must use a minimum of 1024 MB. If you set the RAM size more than 240GB, then ramHotPlug will be set to FALSE and can not be set to TRUE unless RAM size not set to less than 240GB.")

  public Integer getRam() {
    return ram;
  }


  public void setRam(Integer ram) {
    this.ram = ram;
  }


  public ServerProperties availabilityZone(AvailabilityZoneEnum availabilityZone) {
    
    this.availabilityZone = availabilityZone;
    return this;
  }

   /**
   * The availability zone in which the server should exist
   * @return availabilityZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUTO", value = "The availability zone in which the server should exist")

  public AvailabilityZoneEnum getAvailabilityZone() {
    return availabilityZone;
  }


  public void setAvailabilityZone(AvailabilityZoneEnum availabilityZone) {
    this.availabilityZone = availabilityZone;
  }


   /**
   * Status of the virtual Machine
   * @return vmState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RUNNING", value = "Status of the virtual Machine")

  public VmStateEnum getVmState() {
    return vmState;
  }




  public ServerProperties bootCdrom(ResourceReference bootCdrom) {
    
    this.bootCdrom = bootCdrom;
    return this;
  }

   /**
   * Get bootCdrom
   * @return bootCdrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceReference getBootCdrom() {
    return bootCdrom;
  }


  public void setBootCdrom(ResourceReference bootCdrom) {
    this.bootCdrom = bootCdrom;
  }


  public ServerProperties bootVolume(ResourceReference bootVolume) {
    
    this.bootVolume = bootVolume;
    return this;
  }

   /**
   * Get bootVolume
   * @return bootVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceReference getBootVolume() {
    return bootVolume;
  }


  public void setBootVolume(ResourceReference bootVolume) {
    this.bootVolume = bootVolume;
  }


  public ServerProperties cpuFamily(String cpuFamily) {
    
    this.cpuFamily = cpuFamily;
    return this;
  }

   /**
   * Cpu family of pserver
   * @return cpuFamily
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AMD_OPTERON", value = "Cpu family of pserver")

  public String getCpuFamily() {
    return cpuFamily;
  }


  public void setCpuFamily(String cpuFamily) {
    this.cpuFamily = cpuFamily;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerProperties serverProperties = (ServerProperties) o;
    return Objects.equals(this.name, serverProperties.name) &&
        Objects.equals(this.cores, serverProperties.cores) &&
        Objects.equals(this.ram, serverProperties.ram) &&
        Objects.equals(this.availabilityZone, serverProperties.availabilityZone) &&
        Objects.equals(this.vmState, serverProperties.vmState) &&
        Objects.equals(this.bootCdrom, serverProperties.bootCdrom) &&
        Objects.equals(this.bootVolume, serverProperties.bootVolume) &&
        Objects.equals(this.cpuFamily, serverProperties.cpuFamily);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, cores, ram, availabilityZone, vmState, bootCdrom, bootVolume, cpuFamily);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    vmState: ").append(toIndentedString(vmState)).append("\n");
    sb.append("    bootCdrom: ").append(toIndentedString(bootCdrom)).append("\n");
    sb.append("    bootVolume: ").append(toIndentedString(bootVolume)).append("\n");
    sb.append("    cpuFamily: ").append(toIndentedString(cpuFamily)).append("\n");
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

