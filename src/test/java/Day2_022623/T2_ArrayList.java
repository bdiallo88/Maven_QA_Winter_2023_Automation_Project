package Day2_022623;

import java.util.ArrayList;

public class T2_ArrayList {

    public static void main(String[] args) {

        //create an ArrayList of countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("India");
        countries.add("Bangladesh");
        countries.add("Pakistan");
        countries.add("Russia");

        //get the count of the list
        System.out.println("Countries list: " + countries.size());
        //Print only USA India and Bangladesh.
        System.out.println("Countries are " + countries.get(0) + "," + countries.get(1) + "," + countries.get(2));

        //countries.add("Russia");
        //get the count of the list
        //System.out.println("Countries list:" + countries.size());
        //System.out.println(countries.get(4));
        //to get the last value count dynamically do the following
        //System.out.println(countries.size()-1));


        //Examples I made up. Added Guinea as the 6th country. The (-1) makes the list less one country on the entire list line 33 is the input of the country list print.
        countries.add("Guinea");
        System.out.println("Countries list:" + countries.size());
        System.out.println(countries.get(5));
        System.out.println(countries.size() - 1);


    }//end of java
}//end of class
