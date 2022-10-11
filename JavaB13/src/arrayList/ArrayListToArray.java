package arrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> countries= new ArrayList<>();
        countries.add("USA");
        countries.add("Mexico");
        countries.add("Philippines");
        countries.add("Canada");
        System.out.println(countries);//[USA, Mexico, Philippines, Canada]

        Object[] countriesArray= countries.toArray();
        System.out.println(Arrays.toString(countriesArray));// [USA, Mexico, Philippines, Canada]

        countriesArray[0]="usa";
        System.out.println(Arrays.toString(countriesArray));// [usa, Mexico, Philippines, Canada]

        countriesArray[4]= "newCountry";//ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(countriesArray));
    }
}
