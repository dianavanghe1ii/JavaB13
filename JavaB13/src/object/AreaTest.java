package object;

public class AreaTest {
    public static void main(String[] args) {
        AreaCalculator object= new AreaCalculator();
        // calling areaCalculator for square
        object.areaCalculator(5);
        // calling areaCalculator for rectangle
        object.areaCalculator(6,7);

    }
}
