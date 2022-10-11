package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {
        HashSet set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        Set set3= new HashSet<>();
        Set<String> set4= new HashSet<>();
        System.out.println(set2);
        set2.add(11);
        set2.add(22);
        set2.add(44);
        set2.add(66);
        System.out.println(set2);//[66, 22, 11, 44] because Set has no order
        set2.add(33);
        System.out.println("before adding duplicate"+ set2);//[33, 66, 22, 11, 44]
        set2.add(33);
        System.out.println("after adding duplicate"+set2);//[33, 66, 22, 11, 44] will not add 33 which is a duplicate
        set2.add(null);
        System.out.println(set2);//[null, 33, 66, 22, 11, 44] null--> reserved space with no value

        // set2.get(); no get method because there is no specific index due to no order

        for (Integer i: set2){
            System.out.println(i);//

        }
//        for (int i=0; i<set2.size(); i++){
//            System.out.println(set2.get);// there is no get because I cannot use the index number
//        }
        System.out.println("=================");


        //Iterator calls elements one at a time
        Iterator iterator = set2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());//
//            null
//            33
//            66
//            22
//            11
//            44
        }

    }

}
