package object;

import java.util.Random;

public class Student {
    // instance variable define object(determine the features of the object)
    String name;
    int age;
    String gender;
    double score;

    public int study() {
        System.out.println(name + " is studying " + randomHour() + " hours");
        return 5;
    }

    public void sleep() {
        printInfo();
        System.out.println(name + " is sleeping " + randomHour() + " hours");
    }

    public void something() {
        sleep();
        System.out.println(name + " is relaxing " + randomHour() + " hours");
    }

    public int randomHour() {
        Random random = new Random();
        int hour = random.nextInt(10);
        return hour;
    }

    public void printInfo() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\nScore: " + score);
    }

//  toString()
    public String toString(){
        return "Name: "+name+"\nAge: "+age+"\nGender: "+gender+"\nScore: "+score;
    }
//  System.out.println("Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\nScore: " + score);

    public static void main(String[] args) {
        Student st1= new Student();
//        st1.something();
//        st1.printInfo();
        st1.name="Sam";
        System.out.println(st1);
        System.out.println("============");
        Student st2= new Student();
        st2.name="Diana";
        System.out.println(st2);
    }
    // create a method to print student info


    }


