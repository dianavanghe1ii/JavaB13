package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        1.ask user how many names they want to store in an array
        please enter 1.name, 2.name, ...
        take name from user and store it in 'names' array
        print all the names by using .toString();
        print all the names by using loop

         */
//        Scanner sc= new Scanner(System.in);
//        System.out.println("How many times you want to store an array, please enter an integer number");
//
//        int numberOfNames = sc.nextInt();
//        sc.nextLine();
//        String[] names =new String[numberOfNames];
//        for ( int i = 0 ;i<numberOfNames ;i++ ){
//            System.out.println("Please enter "+ (i+1) + ". name");
//            names[i] = sc.nextLine();
//        }
//        System.out.println(Arrays.toString(names));
//        for (int i = 0; i<names.length;i++){ // or numberOfNames instead of names.length
//            System.out.println(names[i]);
//        }

//        2. if name that user enters has 5 or more letters, store that name in to longNames array
//        if name that user enters has less than 5 letters, store that name in to shortNames array
//        print out shortNames and longNames array to show

        Scanner sc= new Scanner(System.in);
        System.out.println("How many times you want to store an array, please enter an integer number");

        int numberOfNames = sc.nextInt();
        sc.nextLine();
        String[] names =new String[numberOfNames];
        String[] longNames = new String[numberOfNames];
        String[] shortName= new String[numberOfNames];
        for ( int i = 0 ;i<numberOfNames ;i++ ){
            System.out.println("Please enter "+ (i+1) + ". name");
//            names[i] = sc.nextLine();// we are taking the name
            String name= sc.nextLine();
            names[i]=name;
            if(name.length()>=5){
                longNames[i] = name;
            }else{
                shortName[i] = name;
            }
        }
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortName));
        System.out.println(Arrays.toString(names));
//        for (int i = 0; i<names.length;i++){ // or numberOfNames instead of names.length
//            System.out.println(names[i]);
//        }
    }
}
