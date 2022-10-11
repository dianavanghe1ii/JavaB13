package object;

import java.util.Arrays;
import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        Animal cat= new Animal();
        System.out.println(cat.color);// Orange
        cat.color= "White";
        System.out.println(cat.color);// White
        System.out.println(cat.age); //0
        cat.age= 3;
        System.out.println(cat.age);//3
        System.out.println(cat.breed); //null
        System.out.println(cat.gender);//
        cat.gender= 'F';
        cat.breed="scottish";
        System.out.println(cat.gender);// F
        System.out.println(cat.breed);// scottish
        // create a dog object and assign/ print all instance variables dog
        String str1= new String();
        Scanner sc1= new Scanner(System.in);
        Animal dog= new Animal();
        System.out.println(dog.color);
        dog.breed="Husky";
        dog.age= 4;
        dog.color="Gray";
        dog.gender='M';
        System.out.println(dog.breed);
        System.out.println(dog.age);
        System.out.println(dog.color);
        System.out.println(dog.gender);
        System.out.println(dog.color);
        System.out.println(dog.color.concat(dog.breed).equalsIgnoreCase("GrayHusky"));// boolean result>> true
        // example for array with object
        Animal[] animals={cat, dog};
        //show the color of the cat and animal by using this animal array

        System.out.println(animals[0].color);
        System.out.println(animals[1].color);
        System.out.println("===============");
        for (Animal pet: animals){
            System.out.println(pet.color);
            System.out.println(pet.age);
            System.out.println(pet.gender);
            System.out.println(pet.breed);
            System.out.println(">>>>>>>next pet<<<<<<<<<<");
        }



    }
}
