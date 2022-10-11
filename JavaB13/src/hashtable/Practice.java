package hashtable;

import java.util.Hashtable;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable= new Hashtable();
        hashtable.put("Rose", 2);
        hashtable.put("Sunflower", 1);
        hashtable.put("Lily", 5);
        hashtable.put("Daisy", 8);

        System.out.println(hashtable.size());//4
        System.out.println(hashtable.get("Daisy"));//8
        System.out.println(hashtable.keySet());//[Sunflower, Daisy, Lily, Rose]
        System.out.println(hashtable.entrySet());//[Sunflower=1, Daisy=8, Lily=5, Rose=2]

        //no null key or value

        //hashtable.put(null,5);//NullPointerException
        System.out.println(hashtable.size());
        //System.out.println(hashtable);
        //hashtable.put("Tulip", null);//NullPointerException

        //use entrySet to get all pairs from hashtable and check if they key starts with letter's'/'S'
        //send message like following "flower name could be Sunflower"


        //hashtable.entrySet();
        hashtable.put("scilla",10);


        for (Map.Entry<String, Integer> pair:hashtable.entrySet()){
            if (pair.getKey().startsWith("s")|| pair.getKey().startsWith("S")){
                System.out.println("flower name could be Sunflower >> "+pair.getKey());
            }
        }

    }
}
