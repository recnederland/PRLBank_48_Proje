package com.gmibank.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.junit.CucumberOptions;
@JsonIgnoreProperties(ignoreUnknown = true)  //bulamazsa ignore et dedik
public class Customer2 {
    private  int id;
    private String firstName;
    private String lastName;
    private String middleInitial;
    private String email;
    public Customer2() {
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", email='" + email + '\'' +
                ", mobilePhoneNumber='" + mobilePhoneNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", ssn='" + ssn + '\'' +
                ", createDate='" + createDate + '\'' +
                ", zelleEnrolled=" + zelleEnrolled +
                ", country=" + country2 +
                ", state=" + state +
                ", user=" + user2 +
                ", accounts=" + accounts2 +
                '}';
    }
    public Customer2(int id, String firstName, String lastName, String middleInitial, String email, String mobilePhoneNumber, String phoneNumber, String zipCode, String address, String city, String ssn, String createDate, boolean zelleEnrolled, Country2 country2, States2 state, User2 user2, Accounts2 accounts2) {
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
        this.country2 = country2;
        this.state = state;
        this.user2 = user2;
        this.accounts2 = accounts2;
    }
    private String mobilePhoneNumber;
    private String phoneNumber;
    private String zipCode;
    private String address;
    private String city;
    private String ssn;
    private String createDate;
    private boolean zelleEnrolled;
    private Country2 country2;
    private States2 state;
    private User2 user2;
    private Accounts2 accounts2;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMiddleInitial() {
        return middleInitial;
    }
    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }
    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public String getCreateDate() {
        return createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    public boolean isZelleEnrolled() {
        return zelleEnrolled;
    }
    public void setZelleEnrolled(boolean zelleEnrolled) {
        this.zelleEnrolled = zelleEnrolled;
    }
    public Country2 getCountry() {
        return country2;
    }
    public void setCountry(Country2 country2) {
        this.country2 = country2;
    }
    public States2 getState() {
        return state;
    }
    public void setState(States2 state) {
        this.state = state;
    }
    public User2 getUser() {
        return user2;
    }
    public void setUser(User2 user2) {
        this.user2 = user2;
    }
    public Accounts2 getAccounts() {
        return accounts2;
    }
    public void setAccounts(Accounts2 accounts2) {
        this.accounts2 = accounts2;
    }
}
