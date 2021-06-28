package com.gmibank.pojos;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "login",
        "firstName",
        "lastName",
        "email",
        "activated",
        "langKey",
        "imageUrl",
        "resetDate"
})


@JsonIgnoreProperties(ignoreUnknown = true)
public class User {


    //private int id;
    //private String login;
    //private String firstName;
    //private String lastName;
    //private String email;
    //private boolean activated;
    //private String langKey;
    //private String imageUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @JsonProperty("id")
    private Integer id;
    @JsonProperty("login")
    private String login;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("activated")
    private Boolean activated;
    @JsonProperty("langKey")
    private String langKey;
    @JsonProperty("imageUrl")
    private Object imageUrl;
    @JsonProperty("resetDate")
    private Object resetDate;

    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();


    /**
     * No args constructor for use in serialization
     *
     */
    public User() {
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param langKey
     * @param resetDate
     * @param imageUrl
     * @param id
     * @param login
     * @param email
     * @param activated
     */
    public User(Integer id, String login, String firstName, String lastName, String email, Boolean activated, String langKey, Object imageUrl, Object resetDate) {

        this.id = id;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.activated = activated;
        this.langKey = langKey;
        this.imageUrl = (String) imageUrl;
        this.resetDate = resetDate;
    }

//    @JsonProperty("id")
//    public Integer getId() {
//        return id;
//    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("login")

    public String getLogin() {
        return login;
    }


    @JsonProperty("login")

    public void setLogin(String login) {
        this.login = login;
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


    @JsonProperty("email")
    public String getEmail() {
        return email;
    }


    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    @JsonProperty("activated")
    public Boolean getActivated() {
        return activated;
    }

    @JsonProperty("activated")
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    @JsonProperty("langKey")
    public String getLangKey() {
        return langKey;
    }


    @JsonProperty("langKey")
    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public String getImageUrl() {
        return (String) imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getResetDate() {
        return (String) resetDate;
    }

    public void setResetDate(String resetDate) {
        this.resetDate = resetDate;
    }





    @JsonProperty("imageUrl")
    public void setImageUrl(Object imageUrl) {
        this.imageUrl = (String) imageUrl;
    }



    @JsonProperty("resetDate")
    public void setResetDate(Object resetDate) {
        this.resetDate = resetDate;
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
        return new ToStringBuilder(this).append("id", id).append("login", login).append("firstName", firstName).append("lastName", lastName).append("email", email).append("activated", activated).append("langKey", langKey).append("imageUrl", imageUrl).append("resetDate", resetDate).toString();
    }


}



