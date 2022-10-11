package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Practice4 {
    public static void main(String[] args) {
        HashMap <String, String> hashMap= new HashMap<>();
        LinkedHashMap<String, String> linkedHashMap= new LinkedHashMap<>();
        TreeMap<String, String> treeMap= new TreeMap<>();

        hashMap.put("3", "White");       linkedHashMap.put("3", "White");       treeMap.put("3","White");
        hashMap.put("1", "Red");         linkedHashMap.put("1", "Red");         treeMap.put("1","Red");
        hashMap.put("5", "Blue");        linkedHashMap.put("5", "Blue");        treeMap.put("5","Blue");
        hashMap.put("7", "Yellow");      linkedHashMap.put("7", "Yellow");      treeMap.put("7","Yellow");
        hashMap.put(null, "Black");      linkedHashMap.put(null,"Black");     //treeMap.put(null, "Black");
        hashMap.put("99", null);         linkedHashMap.put("99", null);         treeMap.put("99", null);

        hashMap.put("88", null);         linkedHashMap.put("88", null);         treeMap.put("88", null);
        hashMap.put("2", null);         linkedHashMap.put("2", null);         treeMap.put("2", null);

        System.out.println(hashMap);     System.out.println(linkedHashMap);     System.out.println(treeMap);
    }
}
