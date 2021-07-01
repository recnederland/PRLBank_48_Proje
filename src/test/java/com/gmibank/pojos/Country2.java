package com.gmibank.pojos;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country2 {
    private int id;
    private String name;
    private String states;

    public Country2(String name, String states) {
        this.name = name;
        this.states = states;
    }


    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", states='" + states + '\'' +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Country2() {
    }

    public String getName() {
        return name;
    }

    public Country2(int id, String name, String states) {
        this.id = id;
        this.name = name;
        this.states = states;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }
}