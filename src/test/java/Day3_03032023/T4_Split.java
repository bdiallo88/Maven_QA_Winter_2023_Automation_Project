package Day3_03032023;

public class T4_Split {
    public static void main(String[] args) {

        //declare s single string variable
        String message = "My name is John ";
        //print out only john from above string
        String[] arrayMessage = message.split(" ");
        System.out.println("Result: " + arrayMessage[3]);

    }//end of main

}//end of class
