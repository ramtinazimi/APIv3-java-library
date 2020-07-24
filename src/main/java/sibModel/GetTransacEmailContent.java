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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import sibModel.GetTransacEmailContentEvents;

/**
 * GetTransacEmailContent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-16T12:59:25.669+05:30")
public class GetTransacEmailContent {
  @SerializedName("email")
  private String email = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("templateId")
  private Long templateId = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("events")
  private List<GetTransacEmailContentEvents> events = new ArrayList<GetTransacEmailContentEvents>();

  @SerializedName("body")
  private String body = null;

  @SerializedName("attachmentCount")
  private Long attachmentCount = null;

  public GetTransacEmailContent email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address to which transactional email has been sent
   * @return email
  **/
  @ApiModelProperty(example = "abc@example.com", required = true, value = "Email address to which transactional email has been sent")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public GetTransacEmailContent subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject of the sent email
   * @return subject
  **/
  @ApiModelProperty(example = "Summer Camp", required = true, value = "Subject of the sent email")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public GetTransacEmailContent templateId(Long templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Id of the template
   * @return templateId
  **/
  @ApiModelProperty(example = "2", value = "Id of the template")
  public Long getTemplateId() {
    return templateId;
  }

  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }

  public GetTransacEmailContent date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Date on which transactional email was sent
   * @return date
  **/
  @ApiModelProperty(example = "2017-03-12T12:30:00Z", required = true, value = "Date on which transactional email was sent")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public GetTransacEmailContent events(List<GetTransacEmailContentEvents> events) {
    this.events = events;
    return this;
  }

  public GetTransacEmailContent addEventsItem(GetTransacEmailContentEvents eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Series of events which occurred on the transactional email
   * @return events
  **/
  @ApiModelProperty(required = true, value = "Series of events which occurred on the transactional email")
  public List<GetTransacEmailContentEvents> getEvents() {
    return events;
  }

  public void setEvents(List<GetTransacEmailContentEvents> events) {
    this.events = events;
  }

  public GetTransacEmailContent body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Actual content of the transactional email that has been sent
   * @return body
  **/
  @ApiModelProperty(example = "<!DOCTYPE html> <html> <body> <h1>Greetings from the team</h1> <p>This is the actual html content sent</p> </body> </html>", required = true, value = "Actual content of the transactional email that has been sent")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public GetTransacEmailContent attachmentCount(Long attachmentCount) {
    this.attachmentCount = attachmentCount;
    return this;
  }

   /**
   * Count of the attachments that were sent in the email
   * @return attachmentCount
  **/
  @ApiModelProperty(example = "2", required = true, value = "Count of the attachments that were sent in the email")
  public Long getAttachmentCount() {
    return attachmentCount;
  }

  public void setAttachmentCount(Long attachmentCount) {
    this.attachmentCount = attachmentCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetTransacEmailContent getTransacEmailContent = (GetTransacEmailContent) o;
    return ObjectUtils.equals(this.email, getTransacEmailContent.email) &&
    ObjectUtils.equals(this.subject, getTransacEmailContent.subject) &&
    ObjectUtils.equals(this.templateId, getTransacEmailContent.templateId) &&
    ObjectUtils.equals(this.date, getTransacEmailContent.date) &&
    ObjectUtils.equals(this.events, getTransacEmailContent.events) &&
    ObjectUtils.equals(this.body, getTransacEmailContent.body) &&
    ObjectUtils.equals(this.attachmentCount, getTransacEmailContent.attachmentCount);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(email, subject, templateId, date, events, body, attachmentCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransacEmailContent {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    attachmentCount: ").append(toIndentedString(attachmentCount)).append("\n");
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
