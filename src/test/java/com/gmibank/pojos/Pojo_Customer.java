package com.gmibank.pojos;

import javax.annotation.Generated;
        import com.fasterxml.jackson.annotation.JsonInclude;
        import com.fasterxml.jackson.annotation.JsonProperty;
        import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "firstName",
        "lastName",
        "middleInitial",
        "email",
        "mobilePhoneNumber",
        "phoneNumber",
        "zipCode",
        "address",
        "city",
        "ssn",
        "createDate",
        "zelleEnrolled",
        "country",
        "state",
        "user",
        "accounts"
})
@Generated("jsonschema2pojo")
public class Pojo_Customer {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("middleInitial")
    private String middleInitial;
    @JsonProperty("email")
    private String email;
    @JsonProperty("mobilePhoneNumber")
    private String mobilePhoneNumber;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("zipCode")
    private String zipCode;
    @JsonProperty("address")
    private String address;
    @JsonProperty("city")
    private String city;
    @JsonProperty("ssn")
    private String ssn;
    @JsonProperty("createDate")
    private String createDate;
    @JsonProperty("zelleEnrolled")
    private Boolean zelleEnrolled;
    @JsonProperty("country")
    private Country country;
    @JsonProperty("state")
    private String state;
    @JsonProperty("user")
    private User user;
    @JsonProperty("accounts")
    private Object accounts;

    /**
     * No args constructor for use in serialization
     *
     */
    public Pojo_Customer() {
    }

    /**
     *
     * @param lastName
     * @param mobilePhoneNumber
     * @param zipCode
     * @param country
     * @param address
     * @param city
     * @param zelleEnrolled
     * @param ssn
     * @param firstName
     * @param middleInitial
     * @param phoneNumber
     * @param id
     * @param state
     * @param accounts
     * @param user
     * @param email
     * @param createDate
     */
    public Pojo_Customer(Integer id, String firstName, String lastName, String middleInitial, String email, String mobilePhoneNumber, String phoneNumber, String zipCode, String address, String city, String ssn, String createDate, Boolean zelleEnrolled, Country country, String state, User user, Object accounts) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = middleInitial;
        this.email = email;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.address = address;
        this.city = city;
        this.ssn = ssn;
        this.createDate = createDate;
        this.zelleEnrolled = zelleEnrolled;
        this.country = country;
        this.state = state;
        this.user = user;
        this.accounts = accounts;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
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

    @JsonProperty("middleInitial")
    public String getMiddleInitial() {
        return middleInitial;
    }

    @JsonProperty("middleInitial")
    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("mobilePhoneNumber")
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    @JsonProperty("mobilePhoneNumber")
    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("zipCode")
    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty("zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("ssn")
    public String getSsn() {
        return ssn;
    }

    @JsonProperty("ssn")
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @JsonProperty("createDate")
    public String getCreateDate() {
        return createDate;
    }

    @JsonProperty("createDate")
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @JsonProperty("zelleEnrolled")
    public Boolean getZelleEnrolled() {
        return zelleEnrolled;
    }

    @JsonProperty("zelleEnrolled")
    public void setZelleEnrolled(Boolean zelleEnrolled) {
        this.zelleEnrolled = zelleEnrolled;
    }

    @JsonProperty("country")
    public Country getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(Country country) {
        this.country = country;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("accounts")
    public Object getAccounts() {
        return accounts;
    }

    @JsonProperty("accounts")
    public void setAccounts(Object accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pojo_Customer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("middleInitial");
        sb.append('=');
        sb.append(((this.middleInitial == null)?"<null>":this.middleInitial));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("mobilePhoneNumber");
        sb.append('=');
        sb.append(((this.mobilePhoneNumber == null)?"<null>":this.mobilePhoneNumber));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("zipCode");
        sb.append('=');
        sb.append(((this.zipCode == null)?"<null>":this.zipCode));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("ssn");
        sb.append('=');
        sb.append(((this.ssn == null)?"<null>":this.ssn));
        sb.append(',');
        sb.append("createDate");
        sb.append('=');
        sb.append(((this.createDate == null)?"<null>":this.createDate));
        sb.append(',');
        sb.append("zelleEnrolled");
        sb.append('=');
        sb.append(((this.zelleEnrolled == null)?"<null>":this.zelleEnrolled));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("accounts");
        sb.append('=');
        sb.append(((this.accounts == null)?"<null>":this.accounts));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}