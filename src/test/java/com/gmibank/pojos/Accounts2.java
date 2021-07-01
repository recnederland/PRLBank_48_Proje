package com.gmibank.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.junit.CucumberOptions;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Accounts2 {
    private String accounts;
    public String getAccounts() {
        return accounts;
    }
    public void setAccounts(String accounts) {
        this.accounts = accounts;
    }
}
