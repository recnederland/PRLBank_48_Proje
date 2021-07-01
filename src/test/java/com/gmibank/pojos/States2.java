package com.gmibank.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class States2 {
    private int id;
    private String name;
    private Country2 tpcountry;

    public States2() {
    }

    @Override
    public String toString() {
        return "States{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tpcountry=" + tpcountry +
                ", state='" + state + '\'' +
                '}';
    }

    public States2(int id, String name, Country2 tpcountry, String state) {
        this.id = id;
        this.name = name;
        this.tpcountry = tpcountry;
        this.state = state;
    }

    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country2 getTpcountry() {
        return tpcountry;
    }

    public void setTpcountry(Country2 tpcountry) {
        this.tpcountry = tpcountry;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

