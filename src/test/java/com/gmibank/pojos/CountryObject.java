package com.gmibank.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// bu satiri eksik ya da olmayan veriyi es gecmeyi saglamak icin kullaniyoruz
@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryObject {

    private int id;
    private String name;
    private StringObject stetes;


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

    public StringObject getStetes() {
        return stetes;
    }

    public void setStetes(StringObject stetes) {
        this.stetes = stetes;
    }

    ;

}
