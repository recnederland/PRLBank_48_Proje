package com.gmibank.pojos;

import javax.annotation.Generated;
        import com.fasterxml.jackson.annotation.JsonInclude;
        import com.fasterxml.jackson.annotation.JsonProperty;
        import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "states"
})
@Generated("jsonschema2pojo")
public class Pojo_Country {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("states")
    private Object states;

    /**
     * No args constructor for use in serialization
     *
     */
    public Pojo_Country() {
    }

    /**
     *
     * @param name
     * @param id
     * @param states
     */
    public Pojo_Country(Integer id, String name, Object states) {
        super();
        this.id = id;
        this.name = name;
        this.states = states;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("states")
    public Object getStates() {
        return states;
    }

    @JsonProperty("states")
    public void setStates(Object states) {
        this.states = states;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Country.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("states");
        sb.append('=');
        sb.append(((this.states == null)?"<null>":this.states));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}