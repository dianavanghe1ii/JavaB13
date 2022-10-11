package arrays;

import java.util.Arrays;

public class MultiDimentional5 {
    public static void main(String[] args) {
        char[][] symbols= { {'L', '%', '7'}, {}, {},{'w', '4'} };
        System.out.println(symbols.length); //4
        System.out.println(symbols[0].length);// 3
        System.out.println(Arrays.toString(symbols[0]));// [L, %, 7]
        boolean[] b1= {true, false, false, false, false};
        boolean[][] b2= { {}, {true, false}, {}, {}, b1 };
        System.out.println(Arrays.toString(b2[b2.length-1]));// [true, false, false, false, false]
        String[][][] example= { {{"e", "2.5"}, { "Hi"}},     { {"Bye"}, {"Hello", "There"}},     { {"Last", "Array"}} };
        System.out.println(Arrays.deepToString(example));
        String name= "three dimension example";
        //print out "Hi Three dimension example"
        System.out.println(example[0][1][0] + " " +name);
        System.out.println("===========OR Dynamic=================");
        for ( String[][] firstArray: example){
            for (String[] secondArray: firstArray){
                for (String element : secondArray){
                    if (element.equalsIgnoreCase("hi")){
                        System.out.println(element+ " " + name);
                    }
                }
            }

        }
    }
}
