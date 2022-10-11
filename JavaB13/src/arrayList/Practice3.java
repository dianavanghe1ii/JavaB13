package arrayList;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {
        ArrayList<String> cities= new ArrayList<>();
        cities.add("Chicago");
        cities.add("Denver");
        cities.add("Dallas");
        cities.add("New York");
                                    //  0       1       2        3
        System.out.println(cities);//[Chicago, Denver, Dallas, New York]
        //System.out.println(cities.get(4));// IndexOutOfBoundsException(because there is no 4th index)

        // remove() method --> removes element from arrayList

        cities.remove("Denver");
        System.out.println(cities);
        String b=cities.remove(2);
        System.out.println(b);
        System.out.println(cities);
        //cities.remove(2);// IndexOutOfBoundsException
        System.out.println(cities);
        cities.remove("Denver");// nothing will happen

        //set() -->replaces element at a specific index(as parameter first one is index, second one is element that we are looking for)

        System.out.println(cities.size());
        cities.set(0, "LA");
        System.out.println(cities); // it will replace Chicago with LA
        System.out.println(cities.size());

        //isEmpty() method

        System.out.println(        cities.isEmpty());// false

        // clear() method --> clears the arrayList --> removes all elements from the arrayList
        cities.clear();
        System.out.println(cities.isEmpty());// true

        System.out.println(        cities.indexOf("Denver"));// -1 because the arrayList is clear

        cities.add("Chicago");
        cities.add("Denver");
        cities.add("Dallas");
        cities.add("New York");

        System.out.println(        cities.indexOf("Denver"));// 1

        //contains() method -->checks if the arrayList contains a specific element

        Boolean b2=         cities.contains("Dallas");
        System.out.println(b2);// true


        //addAll() method --> adds elements from another arraylist to the present arraylist(in here adds to cities)

        ArrayList<String> drinks= new ArrayList<>();
        drinks.add("Coffee");
        drinks.add("Water");
        drinks.add("Tea");

        cities.addAll(drinks);
        System.out.println(cities);// [Chicago, Denver, Dallas, New York, Coffee, Water, Tea]
        // (now cities contains all elements from both arrayLists)

        cities.addAll(1,drinks);
        System.out.println(cities);// [Chicago, Coffee, Water, Tea, Denver, Dallas, New York, Coffee, Water, Tea]
        // now drinks went to index 2 after Chicago and because addAll was used twice.
         cities.remove(drinks);
        System.out.println(cities);// nothing happens because there is no matching drinks(drinks are single elements now)
        cities.set(1, "ABC");
        System.out.println(cities );//[Chicago, ABC, Water, Tea, Denver, Dallas, New York, Coffee, Water, Tea]
        // replaced element at index 1 - Coffee with ABC
        cities.removeAll(drinks);
        System.out.println(cities);// [Chicago, ABC, Denver, Dallas, New York] ABC remained because we changed it



        //replace on the String??

        String str= "Java";
        str = str.replace('a', '$');
        System.out.println(str);//J$v$

    }
}
