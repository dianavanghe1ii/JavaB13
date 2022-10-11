package object;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Random;

/*
Employee class
    id --> get the id as random
    name
    department
    city
    age
    -create constructor to initialize all instance variables
    -create a method to check department of the Employee and;
      if the department is IT:
        print: are you SDET?
  Test class
    create 3 Employee
    store them in Employee array
    call department checker method
      observe behavior of tour script
 */
public class Employee {
    String id;
    String name;
    String department;
    String city;
    int age;

    public Employee( String department, String city, int age) {
        Random random= new Random();
        random.nextInt(1000);
        this.id = id= ""+random.nextInt(1000);
        LocalDateTime.now();
        this.name = name;
        this.department = department;
        this.city = city;
        this.age = age;
    }
    public void departmentChecker(){
        if (department.equalsIgnoreCase("IT")){
            System.out.println("Are you SDET?");
        }
    }
    //overloading departmentChecker method to use it with multiple employee
    public  static void departmentChecker(Employee[] data){
        for (Employee employee:data){
            if (employee.department.equalsIgnoreCase("IT")){
                System.out.println("Are you SDET?");
            }
        }
    }
}
