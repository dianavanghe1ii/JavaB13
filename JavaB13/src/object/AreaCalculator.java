package object;

public class AreaCalculator {
    public void areaCalculator( int length){
       int squareArea= length*length;
        System.out.println("Square area is "+squareArea);
    }
    //overloading areaCalculator method to calculate area of rectangle
    public void areaCalculator(int length, int width){
        int rectangleArea= length*width;
        System.out.println("Rectangle area is "+rectangleArea);
    }
}
