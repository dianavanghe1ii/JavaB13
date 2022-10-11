package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] countries= {"USA", "Mexico", "Canada"};
        List<String> countriesList=Arrays.asList(countries);
        System.out.println(countriesList);// [USA, Mexico, Canada]
//        countriesList.add("newCountry");// UnsupportedOperationException
//        // (because the arraylist is fixed since it was converted from Array)
//        countriesList.remove("Canada");//UnsupportedOperationException
//        // (because the arraylist is fixed since it was converted from Array) arraylist cannot change its size
        countriesList.set(0, "usa");
        System.out.println(countriesList);//[usa, Mexico, Canada] but this has nothing to do with size

        List items= Arrays.asList(1,2,3,4,5,6);
        System.out.println(items);//[1, 2, 3, 4, 5, 6] creating a List by passing the elements right the way

        List items2= Arrays.asList("bee", "butterfly", "spider", "fly", "mosquito");
        System.out.println(items2);
//        items2.add("ant");//UnsupportedOperationException because the List is not dynamic
//        System.out.println(items2); we cannot add items
        ArrayList l2= new ArrayList<>();
        l2.addAll(items2);
        l2.add("xyz");
        System.out.println(l2);//[bee, butterfly, spider, fly, mosquito, xyz]


    }
}
