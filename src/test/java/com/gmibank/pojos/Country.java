package com.gmibank.pojos;

import com.fasterxml.jackson.annotation.*;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {

    private int id;
    private String name;
    private String state;
    private Object states;
    private Map<String, Object> additionalProperties;

    public Country(Object id, String newCountryName, Object o) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return null;
    }












@JsonPropertyOrder({
        "id",
        "name",
        "states"
})
//@JsonIgnoreProperties(ignoreUnknown = true)
//public class Country {

//    @JsonProperty("id")
//    private Integer id;
//    @JsonProperty("name")
//    private String name;
//    @JsonProperty("states")
//    private Object states;
//
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
//    private String state;


    /**
     * No args constructor for use in serialization
     *
     */
    public Country() {
    }


    public Country(Integer id, String name, Object states) {

        this.id = id;
        this.name = name;
        this.states = states;
    }


    public Country(Integer id, String name) {
        this.id = id;
        this.name = name;

    }

    public Country(String name) {
       this.name = name;

    }



//    @JsonProperty("id")
//    public Integer getId() {
//        return id;
//    }
//
//    @JsonProperty("id")
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    @JsonProperty("name")
//
//    public String getName() {
//        return name;
//    }
//
//
//    @JsonProperty("name")
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }







    @JsonProperty("states")
    public Object getStates() {
        Object states = new Object();
        return states;
    }

    @JsonProperty("states")
    public void setStates(Object states) {
        this.states = states;
    }


    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }






}



