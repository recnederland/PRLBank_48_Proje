package com.gmibank.pojos;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "ssn",
        "firstName",
        "lastName",
        "address",
        "mobilePhoneNumber",
        "userId",
        "userName",
        "email",
        "createDate"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Applicant {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("ssn")
    private String ssn;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("address")
    private String address;
    @JsonProperty("mobilePhoneNumber")
    private String mobilePhoneNumber;
    @JsonProperty("userId")
    private Integer userId;
    @JsonProperty("userName")
    private String userName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("createDate")
    private String createDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Applicant() {
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param mobilePhoneNumber
     * @param address
     * @param id
     * @param userName
     * @param userId
     * @param email
     * @param ssn
     * @param createDate
     */
    public Applicant(Integer id, String ssn, String firstName, String lastName, String address, String mobilePhoneNumber, Integer userId, String userName, String email, String createDate) {

        this.id = id;
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.createDate = createDate;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("ssn")
    public String getSsn() {
        return ssn;
    }

    @JsonProperty("ssn")
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("mobilePhoneNumber")
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    @JsonProperty("mobilePhoneNumber")
    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    @JsonProperty("userId")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("createDate")
    public String getCreateDate() {
        return createDate;
    }

    @JsonProperty("createDate")
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("ssn", ssn).append("firstName", firstName).append("lastName", lastName).append("address", address).append("mobilePhoneNumber", mobilePhoneNumber).append("userId", userId).append("userName", userName).append("email", email).append("createDate", createDate).append("additionalProperties", additionalProperties).toString();
    }

}
