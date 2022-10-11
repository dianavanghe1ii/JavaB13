package map;

public class Employee {
    String name, city;
    int age, id;

    public Employee(String name, String city, int age, int id) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "{"+
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';

    }
}
