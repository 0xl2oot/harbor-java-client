/*
 * Harbor API
 * These APIs provide services for manipulating Harbor project.
 *
 * OpenAPI spec version: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.imwyh.harbor.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * PutTarget
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T14:29:11.153+08:00[Asia/Shanghai]")public class PutTarget {

  @SerializedName("name")
  private String name = null;

  @SerializedName("endpoint")
  private String endpoint = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("insecure")
  private Boolean insecure = null;
  public PutTarget name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * The target name.
  * @return name
  **/
  @Schema(description = "The target name.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public PutTarget endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  

  /**
  * The target address URL string.
  * @return endpoint
  **/
  @Schema(description = "The target address URL string.")
  public String getEndpoint() {
    return endpoint;
  }
  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }
  public PutTarget username(String username) {
    this.username = username;
    return this;
  }

  

  /**
  * The target server username.
  * @return username
  **/
  @Schema(description = "The target server username.")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public PutTarget password(String password) {
    this.password = password;
    return this;
  }

  

  /**
  * The target server password.
  * @return password
  **/
  @Schema(description = "The target server password.")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public PutTarget insecure(Boolean insecure) {
    this.insecure = insecure;
    return this;
  }

  

  /**
  * Whether or not the certificate will be verified when Harbor tries to access the server.
  * @return insecure
  **/
  @Schema(description = "Whether or not the certificate will be verified when Harbor tries to access the server.")
  public Boolean isInsecure() {
    return insecure;
  }
  public void setInsecure(Boolean insecure) {
    this.insecure = insecure;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutTarget putTarget = (PutTarget) o;
    return Objects.equals(this.name, putTarget.name) &&
        Objects.equals(this.endpoint, putTarget.endpoint) &&
        Objects.equals(this.username, putTarget.username) &&
        Objects.equals(this.password, putTarget.password) &&
        Objects.equals(this.insecure, putTarget.insecure);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, endpoint, username, password, insecure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutTarget {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
