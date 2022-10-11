package arrayList;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        // syntax of Arraylist
        ArrayList list= new ArrayList();
        ArrayList< String> shoppingList= new ArrayList<>();
        //add()--> adding element to the arraylist
        shoppingList.add("Shoe");
        shoppingList.add("Hat");
        shoppingList.add("Cup");
        shoppingList.add("Glasses");

        boolean b= true;
        shoppingList.add(Boolean.toString(b));


        System.out.println(shoppingList);//[Shoe, Hat, Cup, Glasses] in the order entered

        shoppingList.add(2, "Milk");
        System.out.println(shoppingList);// [Shoe, Hat, Milk, Cup, Glasses]

        //get()--> returning element from given index
        System.out.println(        shoppingList.get(0));// at index zero--> Shoe
        String item1= shoppingList.get(1);
        System.out.println(item1);//Hat

        //size()--> returning number/count of elements from arraylist(checking the length of the arraylist)
        System.out.println(shoppingList.size());//4
        Integer count= shoppingList.size();
        int count1=shoppingList.size();

        //print out very last element from the shopping list
        System.out.println(shoppingList.get(shoppingList.size()-1));


    }
}
