package arrayList;

import object.Cookie;
import object.Flower;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
        List items= new ArrayList();
        Flower fl= new Flower("Rose", 11);
        items.add("String");
        items.add(22);
        items.add(new Flower("Rose", 11));

        items.add(fl);// line 10+14 is the same as line 13 but together

        System.out.println(items);

        ArrayList list1= new ArrayList<>();
        list1.add(33);
        list1.add(true);
        list1.add("Phone");

        // add Cookie Object to this list
        list1.add(new Cookie());
        list1.add(new Scanner(System.in));
        System.out.println(list1);
        //sort?
        //Collections.sort(list1); will nt compile due to object tye we have in list1
        // (will not work because of the object
        System.out.println(list1.size());
        System.out.println(list1.get(list1.size()-1));
        System.out.println(list1.get(5));//IndexOutOfBoundsException



    }
}
