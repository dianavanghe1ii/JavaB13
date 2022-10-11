package object;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1= new Dog();
        dog1.initializeMethod("Husky", "King", "Gray");
        dog1.eat();
        dog1.eat();
        Dog dog2= new Dog();
        dog2.initializeMethod("Bulldog", "Budy", "Black");
        dog2.eat();
        dog2.eat();
        dog2.eat();
        System.out.println(dog1.food);//15
        System.out.println(dog2.food);//15 because it is coming from the same
        System.out.println(dog2.name);//Buddy
        System.out.println(dog1.name);//Buddy the last one bceaus ethey share the same
        Dog dog3= new Dog();
        dog3.food=30;
        System.out.println(dog1.food);
        System.out.println(dog2.food);
        // calling static play() method with object

        dog1.play( "Basement");

        // calling static play() method by using class name
        Dog.play("Park");
        System.out.println("==========");
        System.out.println(dog3);
    }
}
