package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Strawberry", "LA");
        map.put("Watermelon", "Chicago");
        map.put("Apple", "Madison");
        map.put("Potato", "Idaho");
        map.put("banana", "miami");

        //bring key and values together
        // entrySet() method-->
        System.out.println(map);// {banana=miami, Potato=Idaho, Apple=Madison, Watermelon=Chicago, Strawberry=LA}

        // getting the values as object MAP
        System.out.println(map.entrySet());//[banana=miami, Potato=Idaho, Apple=Madison, Watermelon=Chicago,

        // Strawberry=LA] getting the values as List
       Set<Map.Entry<String, String>> keysAndValues=  map.entrySet();

       // print out pairs one by one

        for (Map.Entry<String,String> pair:keysAndValues){
            System.out.println(pair);// banana=miami
//            Potato=Idaho
//            Apple=Madison
//            Watermelon=Chicago
//            Strawberry=LA
        }
        System.out.println("=================");
        System.out.println(map.keySet());//[banana, Potato, Apple, Watermelon, Strawberry]
        System.out.println("=================");
        System.out.println(map.values());//[miami, Idaho, Madison, Chicago, LA]
    }
}
