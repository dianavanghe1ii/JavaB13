package map;

import java.util.Collection;
import java.util.HashMap;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1= new Employee("David", "Chicago", 21, 1);
        Employee e2= new Employee("Anna", "Chicago", 25, 2);
        Employee e3= new Employee("Diana", "Richmond", 26, 3);
        Employee e4= new Employee("Dan", "London", 16, 4);

        HashMap<Integer, Employee> employeeMap= new HashMap<>();
        employeeMap.put(e1.id, e1);
        employeeMap.put(e2.id, e2);
        employeeMap.put(e3.id, e3);
        employeeMap.put(e4.id, e4);
        System.out.println(employeeMap);
        System.out.println(employeeMap.get(e1.id));// e1--> Employee object

        printNames(employeeMap);
        EmployeeTest et= new EmployeeTest();
        et.youngPopulation(employeeMap);
    }
    public  static void printNames(HashMap<Integer, Employee> employeeHashMap){
        employeeHashMap.values();
        for (Employee employee:employeeHashMap.values()){
            System.out.println(employee.name);
        }
    }
    //create a method that will print out city of employee who has age 21 or less
    //"Employees who is 21 and younger are living in "+city
    public void youngPopulation(HashMap<Integer, Employee> employeeMap){
        Collection<Employee> employees= employeeMap.values();
        for (Employee employee:employees){
            if (employee.age<=21){
                System.out.println("Employee who's age is 21 and younger are living in "+employee.city);
            }
        }
    }
}
