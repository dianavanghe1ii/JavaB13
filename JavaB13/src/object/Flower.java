package object;
/*
Create a flower class with following instance variables
  color, size, price, type
  create a constructor to initialize type and price
  create a constructor to initialize all instance variables
*create test class
    create 4 flower objects
    -store these flower objects into an array
-create a method to show flowers, from the array you can pass, which has price more than 10 dollars
    - call this method and make sure it is showing expected flower/s
 */
public class Flower {
    String color;
    String size;
    double price;
    String type;
    public Flower(String type, double price){
        this.type=type;
        this.price=price;
    }
    public Flower(String type, String size, String color,double price){
        this.type=type;
        this.size=size;
        this.color=color;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
    public double  priceChecker(Flower[] flowers){
        for (Flower flower:flowers){
            if (flower.price>10){
                System.out.println(flower.type+" is $"+flower.price );
            }else{
                System.out.println("You are choosing a flower less than $10");
            }
        }
        return price;
    }
}
