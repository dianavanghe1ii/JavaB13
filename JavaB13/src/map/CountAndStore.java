package map;

import java.util.HashMap;

public class CountAndStore {
    public static void main(String[] args) {
        String[] alphabet= {"a", "b", "c", "a", "a", "d", "c", "e", "d", "b"};
        // a - 3, ...
        HashMap<String, Integer> map = new HashMap<>();
        for (String letter:alphabet){

            if (!map.containsKey(letter)){
                map.put(letter,1);
            }
            else {
                int value= map.get(letter)+1;
                map.put(letter,value+1);
            }
        }
        System.out.println(map);

    }
}
