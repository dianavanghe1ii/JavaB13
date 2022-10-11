package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {
        HashMap< Integer,String > studentMap = new HashMap<>();
        studentMap.put(111, "David");
        studentMap.put(222, "Mustafa");
        studentMap.put(333, "Anna");
        studentMap.put(777,"James");
        studentMap.put(555, "Bond");
        studentMap.put(1, "Dima");
        System.out.println(studentMap);//{1=Dima, 777=James, 555=Bond, 333=Anna, 222=Mustafa, 111=David}
        studentMap.put(111, "Sam");
        System.out.println(studentMap);//{1=Dima, 777=James, 555=Bond, 333=Anna, 222=Mustafa, 111=Sam}
        studentMap.put(666, "Sam");
        System.out.println(studentMap);// {1=Dima, 777=James, 666=Sam, 555=Bond, 333=Anna, 222=Mustafa, 111=Sam}
        // because keys are unique but values can be repeating
        studentMap.get(666);
        System.out.println(studentMap.get(666));//this will return VALUE of the key-->Sam
        // find James
        System.out.println(studentMap.get(777));// James

        String name1= studentMap.get(333);
        System.out.println(name1);// Anna

        System.out.println(name1.concat(", hello"));// Anna, hello

        //null key or null value
        studentMap.put(null, "Tima");
        System.out.println(studentMap);//{null=Tima, 1=Dima, 777=James, 666=Sam, 555=Bond, 333=Anna, 222=Mustafa, 111=Sam}
        studentMap.put(null, "John");
        System.out.println(studentMap);// {null=John, 1=Dima, 777=James, 666=Sam, 555=Bond, 333=Anna, 222=Mustafa, 111=Sam}
        // it will update the value for null from Tima to John(just like reassigning)

        studentMap.put(888, null);
        studentMap.put(444, null);
        studentMap.put(999, null);
        System.out.println(studentMap);//{null=John, 1=Dima, 999=null, 888=null, 777=James,
        // 666=Sam, 555=Bond, 444=null, 333=Anna, 222=Mustafa, 111=Sam}
        System.out.println("=============================");
        //get() method--> returns VALUE for given KEY
        //create an e-mail address for each student if student value is not null
        //print out those e-mail addresses
        studentMap.get(111);
        //need to get all keys:--> use keySet() to get all keys from map
        //return type of keySet() method is Set
        Set<Integer> keys= studentMap.keySet();//[null, 1, 999, 888, 777, 666, 555, 444, 333, 222, 111]
        System.out.println(keys);//[null, 1, 999, 888, 777, 666, 555, 444, 333, 222, 111]
        System.out.println("++++++++++++++++++++++");
        for (Integer key:keys){
            //System.out.println(studentMap.get(key));// will bring the values(names)
            if (studentMap.get(key)!=(null)){
                System.out.println(studentMap.get(key).concat("@gmail.com"));
            }
        }
        // how to reach out all values
        Collection<String> values= studentMap.values();// return all values with the Collection return type.
        // Explanation the return data type is Collection with the specific type of object <String>.
        System.out.println("===========================");
        System.out.println(values);

        //say Hi to each person
        for ( String value: values){
            if (value!=null) {
                System.out.println("Hi, " + value);
            }else {
                System.out.println("Bye" + value);
            }
        }

    }
}
