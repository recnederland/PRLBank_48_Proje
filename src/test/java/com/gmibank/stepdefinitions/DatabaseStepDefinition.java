package com.gmibank.stepdefinitions;

import com.gmibank.utilities.DatabaseUtility2;
import io.cucumber.java.en.Given;

import java.util.List;

public class DatabaseStepDefinition {

    @Given("user connect database and print all data")
    public void user_connect_database_and_print_all_data() {
        DatabaseUtility2.createConnection();
        String query ="SELECT * FROM public.tp_customer";
        List<Object> list = DatabaseUtility2.getColumnData(query,"email");

        for (Object w : list){
            System.out.println(w.toString());
        }
    }

}
