package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        /*
         *create and store 6 color
         *print out each color of the arraylist one by one
         */

        ArrayList<String> colors = new ArrayList<>();
        //add()--> adding element to the arraylist
        colors.add("white");
        colors.add("black");
        colors.add("orange");
        colors.add("blue");
        colors.add("white");
        System.out.println(colors);//[white, black, orange, blue, green, red] not the goal
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        System.out.println("============");
        for (String color : colors) {
            System.out.println(color);
        }
            System.out.println("============");

            System.out.println(colors);

            Collections.sort(colors);// sorting arraylist in ascending order

            System.out.println(colors);

            Iterator iterator= colors.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());//
//            black
//            blue
//            orange
//            white
//            white
        }
        }

    }

