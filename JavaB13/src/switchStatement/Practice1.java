package switchStatement;

public class Practice1 {
    public static void main(String[] args) {
        int number = 9;
        switch (number){
            default:
                System.out.println("no matching entry");
                break;
            case 2 :
                System.out.println("this is IT department");
                break;
            case 1 :
                System.out.println("this is  HR department");
                break;
            case 3 :
                System.out.println("this is Admin");
                break;
            case 5 :
                System.out.println("this is Help desk");
                break;

        }
    }
}
