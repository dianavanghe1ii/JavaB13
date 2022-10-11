package map;

import java.util.HashMap;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Strawberry", "LA");
        map.put("Watermelon", "Chicago");
        map.put("Apple", "Madison");
        map.put("Potato", "Idaho");
        map.put("banana", "miami");

        //if the name of the fruit/veggie is starting with 'A'/'a' show the city of it
        /*
        step1 - get all keys
        step2 - if statement to check if fruit starts with 'A'/ 'a'
        step3 - get the value of that item
         */
        Set<String> items = map.keySet();
        for (String item : items) {
            if (item.startsWith("A") || item.startsWith("a")) {
                System.out.println(map.get(item));//Madison - the value of the object that we asked for
            }
        }
        //contains() method
        Boolean b= map.values().contains("Strawberry");//this is contains method from the values
        System.out.println(b);//false
        System.out.println("==============");
        //containsValue() method --> checks if provided element is one of the MAP on the map
        Boolean b1= map.containsValue("Strawberry");// this is contains value method , this checks Object values
        System.out.println(b1);//false (return is the same)
        System.out.println("===============");
        //containsKey() method --> checks if provided element is one of the kEY on the map
        Boolean b2= map.containsKey("Strawberry");
        System.out.println(b2);//true
        System.out.println("==================");

        //remove() method
        System.out.println(map);//{banana=miami, Potato=Idaho, Apple=Madison, Watermelon=Chicago, strawberry=LA}
        map.remove("Apple");
        System.out.println(map);//{banana=miami, Potato=Idaho, Watermelon=Chicago, strawberry=LA}
        map.remove("Strawberry", "LA");
        System.out.println(map);//{banana=miami, Potato=Idaho, Watermelon=Chicago} if the entries do not match, nothing will happen
        System.out.println("==================");

        //replace() method
        map.replace("Potato", "DENVER");
        System.out.println(map);//{banana=miami, Potato=DENVER, Watermelon=Chicago} replaced Idaho with DENVER
        map.replace("Potato", "DENVER", "Chicago");
        System.out.println(map);//{banana=miami, Potato=Chicago, Watermelon=Chicago}
        map.put("Potatoe", "12345");
        System.out.println(map);//{banana=miami, Potato=Chicago, Potatoe=12345, Watermelon=Chicago}
        System.out.println("=================");

        // size
        System.out.println(map.size());
        System.out.println("==========");

        // isEmpty
        System.out.println(map.isEmpty());//false
        System.out.println("===========");

        // clear
        map.clear();
        System.out.println("Cleared the map");
        System.out.println(map.isEmpty());//true


    }
}
