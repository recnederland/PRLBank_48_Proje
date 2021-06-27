package com.gmibank.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountObject {

    private int id;
    private String description;
    private String accountType;
    private int balance;
}
