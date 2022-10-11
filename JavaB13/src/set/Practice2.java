package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice2 {

    /*
    HashSet--> can store null value, no order
    LinkedHashSet--> can store null value, insertion order
    TreeSet--> no null value, ascending order
     */
    public static void main(String[] args) {
        HashSet<String> set1= new HashSet<>();
        LinkedHashSet<String> set2= new LinkedHashSet<>();
        TreeSet<String> set3= new TreeSet<>();

        set1.add("Tuesday");    set2.add("Tuesday");    set3.add("Tuesday");
        set1.add("Monday");     set2.add("Monday");     set3.add("Monday");
        set1.add("Friday");     set2.add("Friday");     set3.add("Friday");
        set1.add("Wednesday");  set2.add("Wednesday");  set3.add("Wednesday");
        set1.add("Thursday");   set2.add("Thursday");   set3.add("Thursday");
        set1.add(null);         set1.add(null);       //set3.add(null);//NullPointerException
        set1.add("Tuesday");    set2.add("Tuesday");    set3.add("Tuesday");// it just remains the same

        System.out.println(set1);// [Monday, Thursday, Friday, Wednesday, Tuesday]
        System.out.println(set2);//[Tuesday, Monday, Friday, Wednesday, Thursday]
        System.out.println(set3);//[Friday, Monday, Thursday, Tuesday, Wednesday]

        //pollFirst() method will remove first element
        set3.pollFirst();
        System.out.println(set3);//[Monday, Thursday, Tuesday, Wednesday]
        //or remove() method to remove specific element
        set3.remove("Tuesday");
        System.out.println(set3);// [Monday, Thursday, Wednesday]
        //pollLast()method will remove last element
        set3.pollLast();
        System.out.println(set3);//[Monday, Thursday]
        //descendingSet method changing the elements from larges to smallest
        System.out.println(set3.descendingSet());
    }
    }
