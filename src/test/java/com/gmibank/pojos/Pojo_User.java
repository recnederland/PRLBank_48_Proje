package com.gmibank.pojos;

import javax.annotation.Generated;
        import com.fasterxml.jackson.annotation.JsonInclude;
        import com.fasterxml.jackson.annotation.JsonProperty;
        import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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
@Generated("jsonschema2pojo")
public class Pojo_User {

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

    /**
     * No args constructor for use in serialization
     *
     */
    public Pojo_User() {
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
    public Pojo_User(Integer id, String login, String firstName, String lastName, String email, Boolean activated, String langKey, Object imageUrl, Object resetDate) {
        super();
        this.id = id;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.activated = activated;
        this.langKey = langKey;
        this.imageUrl = imageUrl;
        this.resetDate = resetDate;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

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

    @JsonProperty("imageUrl")
    public Object getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("imageUrl")
    public void setImageUrl(Object imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("resetDate")
    public Object getResetDate() {
        return resetDate;
    }

    @JsonProperty("resetDate")
    public void setResetDate(Object resetDate) {
        this.resetDate = resetDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pojo_User.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("login");
        sb.append('=');
        sb.append(((this.login == null)?"<null>":this.login));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("activated");
        sb.append('=');
        sb.append(((this.activated == null)?"<null>":this.activated));
        sb.append(',');
        sb.append("langKey");
        sb.append('=');
        sb.append(((this.langKey == null)?"<null>":this.langKey));
        sb.append(',');
        sb.append("imageUrl");
        sb.append('=');
        sb.append(((this.imageUrl == null)?"<null>":this.imageUrl));
        sb.append(',');
        sb.append("resetDate");
        sb.append('=');
        sb.append(((this.resetDate == null)?"<null>":this.resetDate));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}