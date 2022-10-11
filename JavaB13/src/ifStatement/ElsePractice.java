package ifStatement;

public class ElsePractice {
    public static void main(String[] args) {
        String flower = "Violet";
        if(flower.startsWith("Vio")){
            System.out.println("This could be Violet");
        } else{
            System.out.println("This could be Rose");
        }
        System.out.println("===========");
        if (flower.contains("let")){
            System.out.println("Flower is VIOLET");
        }
        System.out.println("Flower could be ROSE"); // this is individual statement so it will print out even
        // if previous if statement is true or false
        System.out.println("============");
        if(flower.equals("Violet"))
            System.out.println("This is for Mustafa");
        else
            System.out.println("this is for YOU");
            System.out.println("Last Print");


    }
}
