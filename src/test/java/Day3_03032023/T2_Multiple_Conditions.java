package Day3_03032023;

public class T2_Multiple_Conditions {
    public static void main(String[] args) {
        //using multiple conditional statements verify when a+b > c, a+b < c & a+b ==c
        int a = 2;
        int b = 3;
        int c = 4;

        if (a+b > c){
            System.out.println("a & b is greater than c");
        } else if (a+b < c) {
            System.out.println("a & b is less than c");
        }else if (a+b == c) {
            //when you compare two values it will always be
            System.out.println("a & b is equal to c");
        }//end of multiple conditions

        //conditions is about true or false and verifying statements!!
        //int will determine under which the results will be.Under if,else if or else if
        //This code falls under if.




    }//end of main
}//end of class
