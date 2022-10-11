package object;

public class AnimalTest2 {
    public static void main(String[] args) {
        Animal bird = new Animal();
        System.out.println(bird.color);
        bird.name = "Tweeter";
        bird.sleep();
        Animal cat= new Animal();
        cat.name = "Tom";
        System.out.println(cat.name);
        cat.sleep();



        String catName=cat.name;
        cat.sleep();

        Animal eagle= new Animal();
        eagle.run();
       eagle.name="Speedy";
        System.out.println(eagle.name);
        eagle.run();

        bird.run();

        System.out.println(cat.energy);
        cat.run();
        System.out.println(cat.energy);
        cat.run();
        cat.run();
        cat.run();
        System.out.println("Cat's energy is "+ cat.energy);
        // what is the energy of eagle
        System.out.println("Eagle's energy is " + eagle.energy);
        eagle.sleep();
        System.out.println(eagle.energy);
        System.out.println("=============");
        eagle.printInfo();// will print eagle's info
        System.out.println("=============");
        cat.printInfo();
        System.out.println("=============");
        bird.printInfo();
        bird.sleep();// after sleeping will show energy 100
        bird.printInfo();
        // run bird till energy is 50%
        for (int i= bird.energy; i>=50; i=i-10){
            bird.run();
        }
        System.out.println(bird.energy);
        bird.sleep();
        System.out.println(bird.energy);
    }
}
