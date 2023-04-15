package Automation_AI01;


import java.util.ArrayList;

public class AI01_Arraylist {


public static void main (String[] args) {

      //create an Arraylist of Countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add ("France");
        countries.add("Germany");
        countries.add("United Kingdom");
        countries.add("Italy");

        //create an Arraylist of Integer countryCode
        ArrayList<Integer> countryCode =new ArrayList<>();
        countryCode.add (12221);
        countryCode.add (211112);
        countryCode.add (311113);
        countryCode.add (411114);

        //iterate through the entire list of countries using for loop.
        for (int i = 0; i < countries.size(); i++) {
                System.out.println(" My country is " + countries.get(i) + " and my country code is " + countryCode.get(i));
         i= i + 1;

        }//end of loop



        }//end of java
}//end of class
