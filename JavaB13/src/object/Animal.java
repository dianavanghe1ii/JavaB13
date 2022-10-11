package object;

public class Animal {
    // instance variables , that are out of the block/scope, in the class they belong to obect
    int age;
    String breed;
    char gender;
    String color= "Orange";
    String name;
    int energy=100;


    public void sleep(){
        System.out.println(name + " is sleeping");
        energy=100;

    }
    //create "run" method in Animal class;
    // run method prints "Animal is running"
    // use that method by creating an "eagle" object in the AnimalTest2 class
    public void run(){
        energy=energy-10;
        System.out.println(name+" is running");

        }
    /*
    create a method which prints out information of the animal
    =name the method as 'printInfo'
     */
    public void printInfo(){
        System.out.println("Name is " + name +"\nAge is " + age+ "\nGender is " +
                gender+"\nBreed is "+ breed+ "\nColor is "+ color+"\nEnergy is " +
                energy);
    }


}
