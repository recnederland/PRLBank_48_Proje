package com.gmibank.utilities;//package gmibank.utilities;

import com.gmibank.pojos.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class WriteToTxt {

    public static void saveDataInFile(String fileName, Customer[] customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i=0;i<customers.length;i++)

                writer.append(customers[i].getSsn()+",\n");

            writer.close();
        } catch(Exception e){

        }
    }
    public static void saveDataInFileWithSSN(String fileName, Customer customer)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            writer.append(customer.getSsn());

            writer.close();
        } catch(Exception e){

        }
    }


    public static void saveDataInFileWithUserInfo(String fileName, Customer customer)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            writer.append(customer.getUser().getFirstName());

            writer.close();
        } catch(Exception e){

        }
    }

    public static void saveDataInFileWithAllCustomerInfo(String fileName, Customer[] customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));


            for (int i =0; i<customers.length;i++){

                writer.append(customers[i].getFirstName()+" , "+customers[i].getLastName()+"\n");
                if(customers[i].getUser() != null)
                    writer.append(customers[i].getUser().getFirstName());
                if(customers[i].getCountry() != null)
                    writer.append(customers[i].getCountry().getName());

            }

            writer.close();
        } catch(Exception e){

        }
    }

    public static void saveAllStates(String fileName, State[] states)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i=0; i<states.length; i++)
                writer.append(states[i].getName()+" , "+states[i].getId()+"\n");

            writer.close();
        } catch(Exception e){

        }
    }



    public static void saveAllStates2(String fileName, State[] states)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i=0; i<states.length; i++)
                writer.append(states[i].getName()+" , "+states[i].getId()+"\n");

            writer.close();
        } catch(Exception e){

        }
    }

    public static void saveAllCustomerData(String fileName, CustomerObject[] customer)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i=0; i< customer.length; i++)
                writer.append(customer[i].getFirstname()
                        +" , "+customer[i].getLastname()+"\n"
                        +" , "+customer[i].getSsn()+"\n"
                        +" , "+customer[i].getEmail()+"\n");

            writer.close();
        } catch(Exception e){

        }
    }

    public static void saveDataInFileWithCountryid(String fileName, CountryObject[] country) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < country.length; i++)
                writer.append(country[i].getId() + "\n");
            writer.close();
        } catch (Exception e) {
        }
    }

    public static List<String> returnCountryIdList(String filePath){
        List<String>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            int i = 0;
//            while (line != null) {
//                Country country = new Country();
//                country.setId(line.split(", ")[0]);
//                sb.append(System.lineSeparator());
//                line = br.readLine();
//                i++;
//                all.add(country.getId());
//            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }


}
