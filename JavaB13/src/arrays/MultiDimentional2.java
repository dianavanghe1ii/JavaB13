package arrays;

import java.util.Arrays;

public class MultiDimentional2 {
    public static void main(String[] args) {
        String [][] citiesOfStates = new String[3][2]; //IL, FL, CA
        citiesOfStates[0][0]= "Chicago";
        citiesOfStates[0][1]= "Springfield";
        citiesOfStates[1][0]= "Miami";
        citiesOfStates[1][1]= "Tampa";
        citiesOfStates[2][0]= "LA";
        citiesOfStates[2][1]= "San Diego";

        System.out.println(Arrays.deepToString(citiesOfStates)); //[[Chicago, Springfield],     [Miami, Tampa],     [LA, San Diego]]
        // print out these cities one by one
        for (String[] cities: citiesOfStates){
            for (String city:cities){
                System.out.println(city);

            }
        }
        // store FL's cities in a new Florida array
        String[] florida = citiesOfStates[1];
        System.out.println(Arrays.toString(florida));
        citiesOfStates[3][0]= "Houston"; // Exception
        citiesOfStates[2][2]= "San Francisco"; //Exception
        System.out.println(Arrays.deepToString(citiesOfStates));

    }
}
