package object;

public class Dog {
    String breed;
    String name;
    String color;
    static int food=20;
    /*
    create a method to initialize all instance variables except food
     */
    //1. method is to int food=10;(give a value)
    //2.create an object call the variable within the object and initialize it
    //3.constructor usage
    //4.method is pass the parameter and make it equal to that instance variable:
    public void initializeMethod(String breed1,String name1,String color1){
        breed=breed1; name=name1; color=color1;
    }
     /*create an 'eat' method that will print "**Name** is eating food"
     update food amount by decreasing 1lbs for every execution
     */
    public void eat() {
        --food;
        System.out.println(name + " is eating food. New amount of food is " +food);

    }
    public static void play(String place){
        // non-static variables cannot be called in the static method without object like in ex.:
        //System.out.println(name);
        Dog d= new Dog();
        d.name="Playing King";
        System.out.println("Dog is playing at "+place);
        System.out.println("Dog is playing and not eating, so food amount is still "+ food);
    }
    public String toString(){
        return "this is one Dog";
    }

}
