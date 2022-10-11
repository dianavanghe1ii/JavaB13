package object;

public class CatTest {
    public static void main(String[] args) {
        Cat cat= new Cat();
        cat.name= "Fluffy";
        cat.breed="Persian";
        cat.color="White";
        cat.age=2;
        cat.food=20;
        cat.info();
        cat.eat();
        cat.sound();
        cat.walk("down");
        cat.walk("south");
        cat.setColor("Violet");
        System.out.println(cat.color);
        cat.setColor("Orange");
        System.out.println(cat.color);
        cat.setName("Ginger");
        String catName=cat.getName();
        catName=catName.concat(" Black");
        System.out.println(catName);
    }
}
