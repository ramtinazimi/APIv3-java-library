/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  |   | 406  | Error. Not Acceptable  | 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@sendinblue.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sibModel;

import org.apache.commons.lang3.ObjectUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetFolder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-12T11:46:32.800+05:30")
public class GetFolder {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("totalBlacklisted")
  private Long totalBlacklisted = null;

  @SerializedName("totalSubscribers")
  private Long totalSubscribers = null;

  @SerializedName("uniqueSubscribers")
  private Long uniqueSubscribers = null;

  public GetFolder id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the folder
   * @return id
  **/
  @ApiModelProperty(example = "2", required = true, value = "ID of the folder")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetFolder name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the folder
   * @return name
  **/
  @ApiModelProperty(example = "Magento Customers", required = true, value = "Name of the folder")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetFolder totalBlacklisted(Long totalBlacklisted) {
    this.totalBlacklisted = totalBlacklisted;
    return this;
  }

   /**
   * Number of blacklisted contacts in the folder
   * @return totalBlacklisted
  **/
  @ApiModelProperty(example = "32", required = true, value = "Number of blacklisted contacts in the folder")
  public Long getTotalBlacklisted() {
    return totalBlacklisted;
  }

  public void setTotalBlacklisted(Long totalBlacklisted) {
    this.totalBlacklisted = totalBlacklisted;
  }

  public GetFolder totalSubscribers(Long totalSubscribers) {
    this.totalSubscribers = totalSubscribers;
    return this;
  }

   /**
   * Number of contacts in the folder
   * @return totalSubscribers
  **/
  @ApiModelProperty(example = "19777", required = true, value = "Number of contacts in the folder")
  public Long getTotalSubscribers() {
    return totalSubscribers;
  }

  public void setTotalSubscribers(Long totalSubscribers) {
    this.totalSubscribers = totalSubscribers;
  }

  public GetFolder uniqueSubscribers(Long uniqueSubscribers) {
    this.uniqueSubscribers = uniqueSubscribers;
    return this;
  }

   /**
   * Number of unique contacts in the folder
   * @return uniqueSubscribers
  **/
  @ApiModelProperty(example = "16222", required = true, value = "Number of unique contacts in the folder")
  public Long getUniqueSubscribers() {
    return uniqueSubscribers;
  }

  public void setUniqueSubscribers(Long uniqueSubscribers) {
    this.uniqueSubscribers = uniqueSubscribers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetFolder getFolder = (GetFolder) o;
    return ObjectUtils.equals(this.id, getFolder.id) &&
    ObjectUtils.equals(this.name, getFolder.name) &&
    ObjectUtils.equals(this.totalBlacklisted, getFolder.totalBlacklisted) &&
    ObjectUtils.equals(this.totalSubscribers, getFolder.totalSubscribers) &&
    ObjectUtils.equals(this.uniqueSubscribers, getFolder.uniqueSubscribers);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(id, name, totalBlacklisted, totalSubscribers, uniqueSubscribers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFolder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    totalBlacklisted: ").append(toIndentedString(totalBlacklisted)).append("\n");
    sb.append("    totalSubscribers: ").append(toIndentedString(totalSubscribers)).append("\n");
    sb.append("    uniqueSubscribers: ").append(toIndentedString(uniqueSubscribers)).append("\n");
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

