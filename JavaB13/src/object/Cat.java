package object;

public class Cat {
    String name;
    String breed;
    String color;
    int age;
    int food;
    public void sound(){
        System.out.println(name+" is meowing");
    }
    public void info(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(color);
        System.out.println(age);
        System.out.println(food);
    }
    public void eat(){
        food=food-1;
        System.out.println("after cat eats, food is "+food);
    }
    public void walk(String destination){
        System.out.println(name+" is walking "+ destination);
    }
    //create a method to initialize the color of cat
    public void setColor( String color1){
        color=color1;
        System.out.println();
    }
    //create a method to get the color of cat
    public String returnCatColor(){
        return color;

    }
    /*set name
    get name
    ** in the test calss
    store the name
    concat with your last name
    print it out
     */
    public void setName(String name1) {
        name=name1;
    }
    public String getName(){
        return name;
    }

}
