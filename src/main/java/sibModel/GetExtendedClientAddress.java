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
 * Address informations
 */
@ApiModel(description = "Address informations")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-30T14:43:00.395+05:30")
public class GetExtendedClientAddress {
  @SerializedName("street")
  private String street = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("zipCode")
  private String zipCode = null;

  @SerializedName("country")
  private String country = null;

  public GetExtendedClientAddress street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Street information
   * @return street
  **/
  @ApiModelProperty(example = "47 Harbour Street", required = true, value = "Street information")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public GetExtendedClientAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City information
   * @return city
  **/
  @ApiModelProperty(example = "New-York", required = true, value = "City information")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public GetExtendedClientAddress zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Zip Code information
   * @return zipCode
  **/
  @ApiModelProperty(example = "9867", required = true, value = "Zip Code information")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public GetExtendedClientAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country information
   * @return country
  **/
  @ApiModelProperty(example = "United States of America", required = true, value = "Country information")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetExtendedClientAddress getExtendedClientAddress = (GetExtendedClientAddress) o;
    return ObjectUtils.equals(this.street, getExtendedClientAddress.street) &&
    ObjectUtils.equals(this.city, getExtendedClientAddress.city) &&
    ObjectUtils.equals(this.zipCode, getExtendedClientAddress.zipCode) &&
    ObjectUtils.equals(this.country, getExtendedClientAddress.country);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(street, city, zipCode, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExtendedClientAddress {\n");
    
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

