package com.gmibank.pojos;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "tpcountry"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class State {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("tpcountry")
    private Object tpcountry;

    /**
     * No args constructor for use in serialization
     *
     */
    public State() {
    }
    public State(Integer id) {
        this.id=id;
    }

    public State(String name) {
        this.name = name;
    }

    public State( String name, Object tpcountry) {

        this.name = name;
        this.tpcountry = tpcountry;
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

    @JsonProperty("tpcountry")
    public Object getTpcountry() {
        return tpcountry;
    }

    @JsonProperty("tpcountry")
    public void setTpcountry(Object tpcountry) {
        this.tpcountry = tpcountry;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("tpcountry", tpcountry).toString();
    }

}