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
 * UserProfile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T14:29:11.153+08:00[Asia/Shanghai]")public class UserProfile {

  @SerializedName("email")
  private String email = null;

  @SerializedName("realname")
  private String realname = null;

  @SerializedName("comment")
  private String comment = null;
  public UserProfile email(String email) {
    this.email = email;
    return this;
  }

  

  /**
  * The new email.
  * @return email
  **/
  @Schema(description = "The new email.")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public UserProfile realname(String realname) {
    this.realname = realname;
    return this;
  }

  

  /**
  * The new realname.
  * @return realname
  **/
  @Schema(description = "The new realname.")
  public String getRealname() {
    return realname;
  }
  public void setRealname(String realname) {
    this.realname = realname;
  }
  public UserProfile comment(String comment) {
    this.comment = comment;
    return this;
  }

  

  /**
  * The new comment.
  * @return comment
  **/
  @Schema(description = "The new comment.")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfile userProfile = (UserProfile) o;
    return Objects.equals(this.email, userProfile.email) &&
        Objects.equals(this.realname, userProfile.realname) &&
        Objects.equals(this.comment, userProfile.comment);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(email, realname, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfile {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    realname: ").append(toIndentedString(realname)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
