package object;

public class CupTest {
    public static void main(String[] args) {
        Cup cup=new Cup(false, 12, "paper");
        System.out.println(cup.materialType);// paper
        cup.materialType="plastic";
        System.out.println(cup.materialType);//plastic
        Cup cup1= new Cup(true, 16, "ceramic");
        System.out.println(cup.materialType);//ceramic(because static makes it whatever is the last)
        System.out.println(cup.isClean);//false
        System.out.println(cup1.isClean);//true
        System.out.println("===========");
        Cup cup2= new Cup();
        System.out.println("===========");
        System.out.println(cup2.isClean);//(will be picked up from instance boolean isClean and
        // will show default of boolean which is false)
        Cup cup3= new Cup();
    }
}
