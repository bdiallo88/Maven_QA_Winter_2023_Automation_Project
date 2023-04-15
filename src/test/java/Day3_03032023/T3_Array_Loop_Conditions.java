package Day3_03032023;

import java.util.ArrayList;

public class T3_Array_Loop_Conditions {
    public static void main(String[] args) {
        /*
        iterate through list of fruit using ArrayList
        but only print when fruit is grape or apple
         */

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Strawberry");
        fruits.add("Grape");

        for (int i = 0; i < fruits.size(); i++) {
            /*
            if (fruits.get(i) == "Apple" {
                System.out.println("Fruit: Apple");
            }else if (fruits.get(i) == "Grape") {
                System.out.println("Fruit : Grape");

            }//end of conditions
            */

            //using the OR operator
            if (fruits.get(i) == "Apple" || fruits.get(i) == "Grape") {
                System.out.println("Fruit:" + fruits.get(i));
            }//end of conditions

        }//end of loop
    }//end of main
}//end of class
