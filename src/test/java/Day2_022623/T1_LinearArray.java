package Day2_022623;

public class T1_LinearArray {
    public static void main(String[] args) {

        //create a list of cities in linear array
        // array count start from 0 index
        String[] cities = new String[]{"Brooklyn","Queens","Manhattan","Bronx","Staten Island"};
        //get the count of the list of cities
        System.out.println("Cities count" + cities.length);
        //print out Brooklyn & Bronx from the list
        System.out.println(" My cities are " + cities[0] + ", " + cities [3]);
        //My own example underneath..
        //System.out.println(" My cities are " + cities [1] + "," + cities [4]);

        //create a list of zipcode
        int[]  zipcode = new int[]{11218,22222,33333,55555};
        //get the count of the list of zipcode
        System.out.println("Zip code count" + zipcode.length);
        //print out 111218 & 33333 from the list
        System.out.println("My zipcodes are " + zipcode[0]+ "," + zipcode[2]);
        //My own example underneath..
        //System.out.println(" My zipcode are " + zipcode[1]+ "," + zipcode[3]);

    }//end of java
}//end of class
