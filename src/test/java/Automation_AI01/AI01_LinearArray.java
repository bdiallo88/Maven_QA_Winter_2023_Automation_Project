package Automation_AI01;

public class AI01_LinearArray {
    public static void main(String[] args) {

        //create a linear array of regions

        String[] region = new String[] {" Mid Atlantic ", " The South "," The Midwest "," The Pacific Coast "};

        //create a liner array of regionalCode

        int[] regionalCode = new int[] {10025, 18004,20311,70124};

        int  i =0;
        while (i < region.length){
            System.out.println(" My region is " +  region [i] + " and my regional code is " + regionalCode[i]);
            i =i + 1;

        }//end of loop
    }//end of java

}//end of class
