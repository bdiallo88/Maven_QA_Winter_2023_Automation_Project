package Day2_022623;

public class T4_WhileLoop_LinearArray {
    public static void main(String[] args) {
        //create a liner array of countries
        String[] countries = new String[]{"USA", "Canada", "Bangladesh", "Argentina"};
        //create a linear array of areaCode
        int[] areacode = new int[]{111, 222, 333, 444};

        int i = 0;
        while (i < countries.length) {
            System.out.println(" Country is " + countries[i] + "  and area code is " + areacode[i]);
            i = i + 1;
        }//end of loop


    }//end of java


}//end of class







