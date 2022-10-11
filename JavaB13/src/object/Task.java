package object;

public class Task {

    public boolean correctFlower(Flower flower) {
        if (flower.size.equalsIgnoreCase("large") && flower.price > 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Flower anyFlower= new Flower("Rose", "large", "Red", 15);
        Flower anyFlower2= new Flower("Rose", "large", "Red", 9);

        Task task= new Task();
        Boolean thisIsTheFlowerYouAreLookingFor= task.correctFlower(anyFlower);
        System.out.println(thisIsTheFlowerYouAreLookingFor);// true
        boolean r2= task.correctFlower(anyFlower);
        System.out.println(r2);
    }

}
