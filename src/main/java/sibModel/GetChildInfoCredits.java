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
 * Credits available for your child
 */
@ApiModel(description = "Credits available for your child")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-12T11:46:32.800+05:30")
public class GetChildInfoCredits {
  @SerializedName("emailCredits")
  private Long emailCredits = null;

  @SerializedName("smsCredits")
  private Long smsCredits = null;

  public GetChildInfoCredits emailCredits(Long emailCredits) {
    this.emailCredits = emailCredits;
    return this;
  }

   /**
   * Email credits available for your child
   * @return emailCredits
  **/
  @ApiModelProperty(example = "98555", value = "Email credits available for your child")
  public Long getEmailCredits() {
    return emailCredits;
  }

  public void setEmailCredits(Long emailCredits) {
    this.emailCredits = emailCredits;
  }

  public GetChildInfoCredits smsCredits(Long smsCredits) {
    this.smsCredits = smsCredits;
    return this;
  }

   /**
   * SMS credits available for your child
   * @return smsCredits
  **/
  @ApiModelProperty(example = "87556", value = "SMS credits available for your child")
  public Long getSmsCredits() {
    return smsCredits;
  }

  public void setSmsCredits(Long smsCredits) {
    this.smsCredits = smsCredits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetChildInfoCredits getChildInfoCredits = (GetChildInfoCredits) o;
    return ObjectUtils.equals(this.emailCredits, getChildInfoCredits.emailCredits) &&
    ObjectUtils.equals(this.smsCredits, getChildInfoCredits.smsCredits);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(emailCredits, smsCredits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChildInfoCredits {\n");
    
    sb.append("    emailCredits: ").append(toIndentedString(emailCredits)).append("\n");
    sb.append("    smsCredits: ").append(toIndentedString(smsCredits)).append("\n");
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

