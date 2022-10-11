package loops;

public class NestedForLoopMonths {
    public static void main(String[] args) {
        for (int year=2020; year<=2023; year++){
            System.out.print(year);
            for (int month =1; month<13;month++){

                System.out.print(" - "+month);
                switch (month){
                    case 1:
                        System.out.print("-> January");
                        break;
                    case 2:
                        System.out.print("-> February");
                        break;
                    case 3:
                        System.out.print("-> March");
                        break;
                }

            }
            System.out.println();

        }
    }
}
