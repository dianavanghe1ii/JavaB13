package map;

import java.util.*;

public class Practice5 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Cookies", 10);
        map.put("Tea", 50);
        map.put("Chocolate", 20);
        map.put("Cups", 14);
        map.put("Plates", 20);

        // extract all keys from this map and store them in a new List

        // extracting all keys by using keySet method and storing them in a SET collection
        Set<String> set = map.keySet();
        System.out.println(set);//[Tea, Cups, Cookies, Chocolate, Plates]

        //creating an arrayList
        ArrayList<String> list = new ArrayList<>();

        //using the for loop to get items from set and then store them into arrayList one by one
        for (String item : set) {
            list.add(item);
        }
        System.out.println(list);//

        //converting keySet to arrayList by passing it as a parameter in the ArrayList Constructor
        ArrayList<String> list2 = new ArrayList<>(map.keySet());
        System.out.println(list2);

        // extract all values from this map and store them in a new array
        Collection<Integer> values = map.values();
        System.out.println(values);//[50, 14, 10, 20, 20]
        Integer[] numbers = new Integer[values.size()];
        // creating integer to use it as an index number for array
        int index = 0;
        // using for loop to take one element from value collection and then storing it to array
        for (Integer value : values) {
            numbers[index] = value;
            index++;
        }
        // printing out the array
        System.out.println(Arrays.toString(numbers));
        System.out.println("==========================");
        // idea2
        Collection values1 = new ArrayList<>(map.values());
        Object[] strValue = values1.toArray();
        System.out.println(Arrays.toString(strValue));
        System.out.println("==============");
        Map m1= new HashMap<>();

printValues(map);
printKeys(map);
        // create a method that will take map<String, Integer> as parameter
        // and this method will print out  VALUES from given map one at a time


    }
    public static void printValues(HashMap<String, Integer> map1){
        Collection values= map1.values();
        for (Object value:values){
            System.out.println("FROM METHOD >> " +value);
        }
    }
    // create a method that will take map<String, Integer> as parameter
    // and this method will print out  KEYS from given map one at a time
    public static void printKeys(HashMap<String, Integer> map1){
        map1.keySet();
        for (String key: map1.keySet()){
            System.out.println(key+" <<");
        }
    }

}
