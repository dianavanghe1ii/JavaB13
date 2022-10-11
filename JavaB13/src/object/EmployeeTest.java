package object;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1= new Employee("IT", "Chicago", 21);
        Employee e2= new Employee("HR", "Chicago", 21);
        Employee e3= new Employee("IT", "Chicago", 21);

        Flower flower1= new Flower("Violet", "Medium", "violet", 11);
        Flower flower2= new Flower("Rose", "Medium", "red", 14);

        Employee[] employees={e1, e2, e3};

        Object[] employee1={e1, e2, e3, flower1, flower2};
        e1.departmentChecker();
        e2.departmentChecker();
        System.out.println("=================");
        Employee.departmentChecker(employees);
        System.out.println("=================");

    }
}
