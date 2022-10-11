package map;

import java.util.HashMap;

public class CountStore {
    public static void main(String[] args) {
        String name= "Diana Vanghelii";
        /*
         *D-1
         *i-3
         *a-3
         * ...
         */
        HashMap<Character, Integer> letterCount= new HashMap<>();
        for (int i=0; i<name.length(); i++){
            if (!letterCount.containsKey(name.charAt(i))){
                letterCount.put(name.charAt(i),1);
            }else {
                letterCount.put(name.charAt(i), letterCount.get(name.charAt(i)) +1);
            }
        }
        System.out.println(letterCount);
        System.out.println(letterCounter("xxxyxxx"));
    }

    public static HashMap<Character, Integer> letterCounter(String name){
        HashMap<Character, Integer> letterCount= new HashMap<>();
        for (int i=0; i<name.length(); i++){
            if (!letterCount.containsKey(name.charAt(i))){
                letterCount.put(name.charAt(i),1);
            }else {
                letterCount.put(name.charAt(i), letterCount.get(name.charAt(i)) +1);
            }
        }
        return letterCount;
    }

}
