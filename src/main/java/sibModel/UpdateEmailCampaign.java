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
import org.threeten.bp.OffsetDateTime;
import sibModel.UpdateEmailCampaignRecipients;
import sibModel.UpdateEmailCampaignSender;

/**
 * UpdateEmailCampaign
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-12T11:46:32.800+05:30")
public class UpdateEmailCampaign {
  @SerializedName("tag")
  private String tag = null;

  @SerializedName("sender")
  private UpdateEmailCampaignSender sender = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("htmlContent")
  private String htmlContent = null;

  @SerializedName("htmlUrl")
  private String htmlUrl = null;

  @SerializedName("scheduledAt")
  private String scheduledAt = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("replyTo")
  private String replyTo = null;

  @SerializedName("toField")
  private String toField = null;

  @SerializedName("recipients")
  private UpdateEmailCampaignRecipients recipients = null;

  @SerializedName("attachmentUrl")
  private String attachmentUrl = null;

  @SerializedName("inlineImageActivation")
  private Boolean inlineImageActivation = false;

  @SerializedName("mirrorActive")
  private Boolean mirrorActive = null;

  @SerializedName("recurring")
  private Boolean recurring = false;

  @SerializedName("footer")
  private String footer = null;

  @SerializedName("header")
  private String header = null;

  @SerializedName("utmCampaign")
  private String utmCampaign = null;

  @SerializedName("params")
  private Object params = null;

  @SerializedName("sendAtBestTime")
  private Boolean sendAtBestTime = null;

  @SerializedName("abTesting")
  private Boolean abTesting = false;

  @SerializedName("subjectA")
  private String subjectA = null;

  @SerializedName("subjectB")
  private String subjectB = null;

  @SerializedName("splitRule")
  private Long splitRule = null;

  /**
   * Choose the metrics that will determinate the winning version. Considered if &#39;splitRule&#39; &gt;&#x3D; 1 and &lt; 50. If splitRule &#x3D; 50, &#39;winnerCriteria&#39; is ignored if passed or alreday exist in record
   */
  @JsonAdapter(WinnerCriteriaEnum.Adapter.class)
  public enum WinnerCriteriaEnum {
    OPEN("open"),
    
    CLICK("click");

    private String value;

    WinnerCriteriaEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WinnerCriteriaEnum fromValue(String text) {
      for (WinnerCriteriaEnum b : WinnerCriteriaEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WinnerCriteriaEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WinnerCriteriaEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WinnerCriteriaEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WinnerCriteriaEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("winnerCriteria")
  private WinnerCriteriaEnum winnerCriteria = null;

  @SerializedName("winnerDelay")
  private Long winnerDelay = null;

  @SerializedName("ipWarmupEnable")
  private Boolean ipWarmupEnable = false;

  @SerializedName("initialQuota")
  private Long initialQuota = null;

  @SerializedName("increaseRate")
  private Long increaseRate = null;

  public UpdateEmailCampaign tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Tag of the campaign
   * @return tag
  **/
  @ApiModelProperty(example = "Newsletter", value = "Tag of the campaign")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public UpdateEmailCampaign sender(UpdateEmailCampaignSender sender) {
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(value = "")
  public UpdateEmailCampaignSender getSender() {
    return sender;
  }

  public void setSender(UpdateEmailCampaignSender sender) {
    this.sender = sender;
  }

  public UpdateEmailCampaign name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the campaign
   * @return name
  **/
  @ApiModelProperty(example = "Newsletter - May 2017", value = "Name of the campaign")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateEmailCampaign htmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
    return this;
  }

   /**
   * Body of the message (HTML version). REQUIRED if htmlUrl is empty
   * @return htmlContent
  **/
  @ApiModelProperty(example = "Spring is here, discover my new collection", value = "Body of the message (HTML version). REQUIRED if htmlUrl is empty")
  public String getHtmlContent() {
    return htmlContent;
  }

  public void setHtmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
  }

  public UpdateEmailCampaign htmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
    return this;
  }

   /**
   * Url which contents the body of the email message. REQUIRED if htmlContent is empty
   * @return htmlUrl
  **/
  @ApiModelProperty(example = "https://html.domain.com", value = "Url which contents the body of the email message. REQUIRED if htmlContent is empty")
  public String getHtmlUrl() {
    return htmlUrl;
  }

  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }

  public UpdateEmailCampaign scheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * UTC date-time on which the campaign has to run (YYYY-MM-DDTHH:mm:ss.SSSZ). Prefer to pass your timezone in date-time format for accurate result. If sendAtBestTime is set to true, your campaign will be sent according to the date passed (ignoring the time part).
   * @return scheduledAt
  **/
  @ApiModelProperty(example = "2017-06-01T12:30:00+02:00", value = "UTC date-time on which the campaign has to run (YYYY-MM-DDTHH:mm:ss.SSSZ). Prefer to pass your timezone in date-time format for accurate result. If sendAtBestTime is set to true, your campaign will be sent according to the date passed (ignoring the time part).")
  public String getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  public UpdateEmailCampaign subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject of the campaign
   * @return subject
  **/
  @ApiModelProperty(example = "Discover the New Collection !", value = "Subject of the campaign")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public UpdateEmailCampaign replyTo(String replyTo) {
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Email on which campaign recipients will be able to reply to
   * @return replyTo
  **/
  @ApiModelProperty(example = "support@myshop.com", value = "Email on which campaign recipients will be able to reply to")
  public String getReplyTo() {
    return replyTo;
  }

  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }

  public UpdateEmailCampaign toField(String toField) {
    this.toField = toField;
    return this;
  }

   /**
   * To personalize the «To» Field. If you want to include the first name and last name of your recipient, add {FNAME} {LNAME}. These contact attributes must already exist in your SendinBlue account. If input parameter &#39;params&#39; used please use {{contact.FNAME}} {{contact.LNAME}} for personalization
   * @return toField
  **/
  @ApiModelProperty(example = "{FNAME} {LNAME}", value = "To personalize the «To» Field. If you want to include the first name and last name of your recipient, add {FNAME} {LNAME}. These contact attributes must already exist in your SendinBlue account. If input parameter 'params' used please use {{contact.FNAME}} {{contact.LNAME}} for personalization")
  public String getToField() {
    return toField;
  }

  public void setToField(String toField) {
    this.toField = toField;
  }

  public UpdateEmailCampaign recipients(UpdateEmailCampaignRecipients recipients) {
    this.recipients = recipients;
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @ApiModelProperty(value = "")
  public UpdateEmailCampaignRecipients getRecipients() {
    return recipients;
  }

  public void setRecipients(UpdateEmailCampaignRecipients recipients) {
    this.recipients = recipients;
  }

  public UpdateEmailCampaign attachmentUrl(String attachmentUrl) {
    this.attachmentUrl = attachmentUrl;
    return this;
  }

   /**
   * Absolute url of the attachment (no local file). Extension allowed: xlsx, xls, ods, docx, docm, doc, csv, pdf, txt, gif, jpg, jpeg, png, tif, tiff, rtf, bmp, cgm, css, shtml, html, htm, zip, xml, ppt, pptx, tar, ez, ics, mobi, msg, pub and eps
   * @return attachmentUrl
  **/
  @ApiModelProperty(example = "https://attachment.domain.com", value = "Absolute url of the attachment (no local file). Extension allowed: xlsx, xls, ods, docx, docm, doc, csv, pdf, txt, gif, jpg, jpeg, png, tif, tiff, rtf, bmp, cgm, css, shtml, html, htm, zip, xml, ppt, pptx, tar, ez, ics, mobi, msg, pub and eps")
  public String getAttachmentUrl() {
    return attachmentUrl;
  }

  public void setAttachmentUrl(String attachmentUrl) {
    this.attachmentUrl = attachmentUrl;
  }

  public UpdateEmailCampaign inlineImageActivation(Boolean inlineImageActivation) {
    this.inlineImageActivation = inlineImageActivation;
    return this;
  }

   /**
   * Status of inline image. inlineImageActivation &#x3D; false means image can’t be embedded, &amp; inlineImageActivation &#x3D; true means image can be embedded, in the email. You cannot send a campaign of more than 4MB with images embedded in the email. Campaigns with the images embedded in the email must be sent to less than 5000 contacts.
   * @return inlineImageActivation
  **/
  @ApiModelProperty(example = "true", value = "Status of inline image. inlineImageActivation = false means image can’t be embedded, & inlineImageActivation = true means image can be embedded, in the email. You cannot send a campaign of more than 4MB with images embedded in the email. Campaigns with the images embedded in the email must be sent to less than 5000 contacts.")
  public Boolean isInlineImageActivation() {
    return inlineImageActivation;
  }

  public void setInlineImageActivation(Boolean inlineImageActivation) {
    this.inlineImageActivation = inlineImageActivation;
  }

  public UpdateEmailCampaign mirrorActive(Boolean mirrorActive) {
    this.mirrorActive = mirrorActive;
    return this;
  }

   /**
   * Status of mirror links in campaign. mirrorActive &#x3D; false means mirror links are deactivated, &amp; mirrorActive &#x3D; true means mirror links are activated, in the campaign
   * @return mirrorActive
  **/
  @ApiModelProperty(example = "true", value = "Status of mirror links in campaign. mirrorActive = false means mirror links are deactivated, & mirrorActive = true means mirror links are activated, in the campaign")
  public Boolean isMirrorActive() {
    return mirrorActive;
  }

  public void setMirrorActive(Boolean mirrorActive) {
    this.mirrorActive = mirrorActive;
  }

  public UpdateEmailCampaign recurring(Boolean recurring) {
    this.recurring = recurring;
    return this;
  }

   /**
   * FOR TRIGGER ONLY ! Type of trigger campaign.recurring &#x3D; false means contact can receive the same Trigger campaign only once, &amp; recurring &#x3D; true means contact can receive the same Trigger campaign several times
   * @return recurring
  **/
  @ApiModelProperty(example = "false", value = "FOR TRIGGER ONLY ! Type of trigger campaign.recurring = false means contact can receive the same Trigger campaign only once, & recurring = true means contact can receive the same Trigger campaign several times")
  public Boolean isRecurring() {
    return recurring;
  }

  public void setRecurring(Boolean recurring) {
    this.recurring = recurring;
  }

  public UpdateEmailCampaign footer(String footer) {
    this.footer = footer;
    return this;
  }

   /**
   * Footer of the email campaign
   * @return footer
  **/
  @ApiModelProperty(example = "[DEFAULT_FOOTER]", value = "Footer of the email campaign")
  public String getFooter() {
    return footer;
  }

  public void setFooter(String footer) {
    this.footer = footer;
  }

  public UpdateEmailCampaign header(String header) {
    this.header = header;
    return this;
  }

   /**
   * Header of the email campaign
   * @return header
  **/
  @ApiModelProperty(example = "[DEFAULT_HEADER]", value = "Header of the email campaign")
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public UpdateEmailCampaign utmCampaign(String utmCampaign) {
    this.utmCampaign = utmCampaign;
    return this;
  }

   /**
   * Customize the utm_campaign value. If this field is empty, the campaign name will be used. Only alphanumeric characters and spaces are allowed
   * @return utmCampaign
  **/
  @ApiModelProperty(example = "NL_05_2017", value = "Customize the utm_campaign value. If this field is empty, the campaign name will be used. Only alphanumeric characters and spaces are allowed")
  public String getUtmCampaign() {
    return utmCampaign;
  }

  public void setUtmCampaign(String utmCampaign) {
    this.utmCampaign = utmCampaign;
  }

  public UpdateEmailCampaign params(Object params) {
    this.params = params;
    return this;
  }

   /**
   * Pass the set of attributes to customize the type &#39;classic&#39; campaign. For example, {&quot;FNAME&quot;:&quot;Joe&quot;, &quot;LNAME&quot;:&quot;Doe&quot;}. The &#39;params&#39; field will get updated, only if the campaign is in New Template Language, else ignored. The New Template Language is dependent on the values of &#39;subject&#39;, &#39;htmlContent/htmlUrl&#39;, &#39;sender.name&#39; &amp; &#39;toField&#39;
   * @return params
  **/
  @ApiModelProperty(example = "{\"FNAME\":\"Joe\",\"LNAME\":\"Doe\"}", value = "Pass the set of attributes to customize the type 'classic' campaign. For example, {\"FNAME\":\"Joe\", \"LNAME\":\"Doe\"}. The 'params' field will get updated, only if the campaign is in New Template Language, else ignored. The New Template Language is dependent on the values of 'subject', 'htmlContent/htmlUrl', 'sender.name' & 'toField'")
  public Object getParams() {
    return params;
  }

  public void setParams(Object params) {
    this.params = params;
  }

  public UpdateEmailCampaign sendAtBestTime(Boolean sendAtBestTime) {
    this.sendAtBestTime = sendAtBestTime;
    return this;
  }

   /**
   * Set this to true if you want to send your campaign at best time. Note:- if true, warmup ip will be disabled.
   * @return sendAtBestTime
  **/
  @ApiModelProperty(example = "true", value = "Set this to true if you want to send your campaign at best time. Note:- if true, warmup ip will be disabled.")
  public Boolean isSendAtBestTime() {
    return sendAtBestTime;
  }

  public void setSendAtBestTime(Boolean sendAtBestTime) {
    this.sendAtBestTime = sendAtBestTime;
  }

  public UpdateEmailCampaign abTesting(Boolean abTesting) {
    this.abTesting = abTesting;
    return this;
  }

   /**
   * Status of A/B Test. abTesting &#x3D; false means it is disabled, &amp; abTesting &#x3D; true means it is enabled. &#39;subjectA&#39;, &#39;subjectB&#39;, &#39;splitRule&#39;, &#39;winnerCriteria&#39; &amp; &#39;winnerDelay&#39; will be considered if abTesting is set to true. &#39;subject&#39; if passed is ignored.  Can be set to true only if &#39;sendAtBestTime&#39; is &#39;false&#39;. You will be able to set up two subject lines for your campaign and send them to a random sample of your total recipients. Half of the test group will receive version A, and the other half will receive version B
   * @return abTesting
  **/
  @ApiModelProperty(example = "true", value = "Status of A/B Test. abTesting = false means it is disabled, & abTesting = true means it is enabled. 'subjectA', 'subjectB', 'splitRule', 'winnerCriteria' & 'winnerDelay' will be considered if abTesting is set to true. 'subject' if passed is ignored.  Can be set to true only if 'sendAtBestTime' is 'false'. You will be able to set up two subject lines for your campaign and send them to a random sample of your total recipients. Half of the test group will receive version A, and the other half will receive version B")
  public Boolean isAbTesting() {
    return abTesting;
  }

  public void setAbTesting(Boolean abTesting) {
    this.abTesting = abTesting;
  }

  public UpdateEmailCampaign subjectA(String subjectA) {
    this.subjectA = subjectA;
    return this;
  }

   /**
   * Subject A of the campaign. Considered if abTesting &#x3D; true. subjectA &amp; subjectB should have unique value
   * @return subjectA
  **/
  @ApiModelProperty(example = "Discover the New Collection!", value = "Subject A of the campaign. Considered if abTesting = true. subjectA & subjectB should have unique value")
  public String getSubjectA() {
    return subjectA;
  }

  public void setSubjectA(String subjectA) {
    this.subjectA = subjectA;
  }

  public UpdateEmailCampaign subjectB(String subjectB) {
    this.subjectB = subjectB;
    return this;
  }

   /**
   * Subject B of the campaign. Considered if abTesting &#x3D; true. subjectA &amp; subjectB should have unique value
   * @return subjectB
  **/
  @ApiModelProperty(example = "Want to discover the New Collection?", value = "Subject B of the campaign. Considered if abTesting = true. subjectA & subjectB should have unique value")
  public String getSubjectB() {
    return subjectB;
  }

  public void setSubjectB(String subjectB) {
    this.subjectB = subjectB;
  }

  public UpdateEmailCampaign splitRule(Long splitRule) {
    this.splitRule = splitRule;
    return this;
  }

   /**
   * Add the size of your test groups. Considered if abTesting &#x3D; true. We&#39;ll send version A and B to a random sample of recipients, and then the winning version to everyone else
   * minimum: 1
   * maximum: 50
   * @return splitRule
  **/
  @ApiModelProperty(example = "50", value = "Add the size of your test groups. Considered if abTesting = true. We'll send version A and B to a random sample of recipients, and then the winning version to everyone else")
  public Long getSplitRule() {
    return splitRule;
  }

  public void setSplitRule(Long splitRule) {
    this.splitRule = splitRule;
  }

  public UpdateEmailCampaign winnerCriteria(WinnerCriteriaEnum winnerCriteria) {
    this.winnerCriteria = winnerCriteria;
    return this;
  }

   /**
   * Choose the metrics that will determinate the winning version. Considered if &#39;splitRule&#39; &gt;&#x3D; 1 and &lt; 50. If splitRule &#x3D; 50, &#39;winnerCriteria&#39; is ignored if passed or alreday exist in record
   * @return winnerCriteria
  **/
  @ApiModelProperty(example = "open", value = "Choose the metrics that will determinate the winning version. Considered if 'splitRule' >= 1 and < 50. If splitRule = 50, 'winnerCriteria' is ignored if passed or alreday exist in record")
  public WinnerCriteriaEnum getWinnerCriteria() {
    return winnerCriteria;
  }

  public void setWinnerCriteria(WinnerCriteriaEnum winnerCriteria) {
    this.winnerCriteria = winnerCriteria;
  }

  public UpdateEmailCampaign winnerDelay(Long winnerDelay) {
    this.winnerDelay = winnerDelay;
    return this;
  }

   /**
   * Choose the duration of the test in hours. Maximum is 7 days, pass 24*7 &#x3D; 168 hours. The winning version will be sent at the end of the test. Considered if &#39;splitRule&#39; &gt;&#x3D; 1 and &lt; 50. If splitRule &#x3D; 50, &#39;winnerDelay&#39; is ignored if passed or alreday exist in record
   * minimum: 1
   * maximum: 168
   * @return winnerDelay
  **/
  @ApiModelProperty(example = "50", value = "Choose the duration of the test in hours. Maximum is 7 days, pass 24*7 = 168 hours. The winning version will be sent at the end of the test. Considered if 'splitRule' >= 1 and < 50. If splitRule = 50, 'winnerDelay' is ignored if passed or alreday exist in record")
  public Long getWinnerDelay() {
    return winnerDelay;
  }

  public void setWinnerDelay(Long winnerDelay) {
    this.winnerDelay = winnerDelay;
  }

  public UpdateEmailCampaign ipWarmupEnable(Boolean ipWarmupEnable) {
    this.ipWarmupEnable = ipWarmupEnable;
    return this;
  }

   /**
   * Available for dedicated ip clients. Set this to true if you wish to warm up your ip.
   * @return ipWarmupEnable
  **/
  @ApiModelProperty(example = "true", value = "Available for dedicated ip clients. Set this to true if you wish to warm up your ip.")
  public Boolean isIpWarmupEnable() {
    return ipWarmupEnable;
  }

  public void setIpWarmupEnable(Boolean ipWarmupEnable) {
    this.ipWarmupEnable = ipWarmupEnable;
  }

  public UpdateEmailCampaign initialQuota(Long initialQuota) {
    this.initialQuota = initialQuota;
    return this;
  }

   /**
   * Set an initial quota greater than 1 for warming up your ip. We recommend you set a value of 3000.
   * @return initialQuota
  **/
  @ApiModelProperty(example = "3000", value = "Set an initial quota greater than 1 for warming up your ip. We recommend you set a value of 3000.")
  public Long getInitialQuota() {
    return initialQuota;
  }

  public void setInitialQuota(Long initialQuota) {
    this.initialQuota = initialQuota;
  }

  public UpdateEmailCampaign increaseRate(Long increaseRate) {
    this.increaseRate = increaseRate;
    return this;
  }

   /**
   * Set a percentage increase rate for warming up your ip. We recommend you set the increase rate to 30% per day. If you want to send the same number of emails every day, set the daily increase value to 0%.
   * minimum: 0
   * maximum: 100
   * @return increaseRate
  **/
  @ApiModelProperty(example = "70", value = "Set a percentage increase rate for warming up your ip. We recommend you set the increase rate to 30% per day. If you want to send the same number of emails every day, set the daily increase value to 0%.")
  public Long getIncreaseRate() {
    return increaseRate;
  }

  public void setIncreaseRate(Long increaseRate) {
    this.increaseRate = increaseRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    UpdateEmailCampaign updateEmailCampaign = (UpdateEmailCampaign) o;
    return ObjectUtils.equals(this.tag, updateEmailCampaign.tag) &&
    ObjectUtils.equals(this.sender, updateEmailCampaign.sender) &&
    ObjectUtils.equals(this.name, updateEmailCampaign.name) &&
    ObjectUtils.equals(this.htmlContent, updateEmailCampaign.htmlContent) &&
    ObjectUtils.equals(this.htmlUrl, updateEmailCampaign.htmlUrl) &&
    ObjectUtils.equals(this.scheduledAt, updateEmailCampaign.scheduledAt) &&
    ObjectUtils.equals(this.subject, updateEmailCampaign.subject) &&
    ObjectUtils.equals(this.replyTo, updateEmailCampaign.replyTo) &&
    ObjectUtils.equals(this.toField, updateEmailCampaign.toField) &&
    ObjectUtils.equals(this.recipients, updateEmailCampaign.recipients) &&
    ObjectUtils.equals(this.attachmentUrl, updateEmailCampaign.attachmentUrl) &&
    ObjectUtils.equals(this.inlineImageActivation, updateEmailCampaign.inlineImageActivation) &&
    ObjectUtils.equals(this.mirrorActive, updateEmailCampaign.mirrorActive) &&
    ObjectUtils.equals(this.recurring, updateEmailCampaign.recurring) &&
    ObjectUtils.equals(this.footer, updateEmailCampaign.footer) &&
    ObjectUtils.equals(this.header, updateEmailCampaign.header) &&
    ObjectUtils.equals(this.utmCampaign, updateEmailCampaign.utmCampaign) &&
    ObjectUtils.equals(this.params, updateEmailCampaign.params) &&
    ObjectUtils.equals(this.sendAtBestTime, updateEmailCampaign.sendAtBestTime) &&
    ObjectUtils.equals(this.abTesting, updateEmailCampaign.abTesting) &&
    ObjectUtils.equals(this.subjectA, updateEmailCampaign.subjectA) &&
    ObjectUtils.equals(this.subjectB, updateEmailCampaign.subjectB) &&
    ObjectUtils.equals(this.splitRule, updateEmailCampaign.splitRule) &&
    ObjectUtils.equals(this.winnerCriteria, updateEmailCampaign.winnerCriteria) &&
    ObjectUtils.equals(this.winnerDelay, updateEmailCampaign.winnerDelay) &&
    ObjectUtils.equals(this.ipWarmupEnable, updateEmailCampaign.ipWarmupEnable) &&
    ObjectUtils.equals(this.initialQuota, updateEmailCampaign.initialQuota) &&
    ObjectUtils.equals(this.increaseRate, updateEmailCampaign.increaseRate);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(tag, sender, name, htmlContent, htmlUrl, scheduledAt, subject, replyTo, toField, recipients, attachmentUrl, inlineImageActivation, mirrorActive, recurring, footer, header, utmCampaign, params, sendAtBestTime, abTesting, subjectA, subjectB, splitRule, winnerCriteria, winnerDelay, ipWarmupEnable, initialQuota, increaseRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEmailCampaign {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    htmlContent: ").append(toIndentedString(htmlContent)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    toField: ").append(toIndentedString(toField)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    attachmentUrl: ").append(toIndentedString(attachmentUrl)).append("\n");
    sb.append("    inlineImageActivation: ").append(toIndentedString(inlineImageActivation)).append("\n");
    sb.append("    mirrorActive: ").append(toIndentedString(mirrorActive)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    utmCampaign: ").append(toIndentedString(utmCampaign)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    sendAtBestTime: ").append(toIndentedString(sendAtBestTime)).append("\n");
    sb.append("    abTesting: ").append(toIndentedString(abTesting)).append("\n");
    sb.append("    subjectA: ").append(toIndentedString(subjectA)).append("\n");
    sb.append("    subjectB: ").append(toIndentedString(subjectB)).append("\n");
    sb.append("    splitRule: ").append(toIndentedString(splitRule)).append("\n");
    sb.append("    winnerCriteria: ").append(toIndentedString(winnerCriteria)).append("\n");
    sb.append("    winnerDelay: ").append(toIndentedString(winnerDelay)).append("\n");
    sb.append("    ipWarmupEnable: ").append(toIndentedString(ipWarmupEnable)).append("\n");
    sb.append("    initialQuota: ").append(toIndentedString(initialQuota)).append("\n");
    sb.append("    increaseRate: ").append(toIndentedString(increaseRate)).append("\n");
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

