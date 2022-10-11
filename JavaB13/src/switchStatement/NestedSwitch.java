package switchStatement;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        /*
        1 case IT >> Alex, Zack, Diana
        2 case HR >> Tima, Ana
        3 case Admin >> Tima, David
        Default case General >> John
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose from following departments: \n 1 - IT \n 2 - HR \n 3 -Admin");
        int department = scanner.nextInt();
        switch (department) {
            case 1:
                System.out.println("Who do you want to speak to from IT department \nAlex, \nZack, \nDiana");
                String name1 = scanner.next().toUpperCase();
                switch (name1) {
                    case "ALEX":
                        System.out.println("You are connected to Alex");
                        break;
                    case "ZACK":
                        System.out.println("You are connected to Zack");
                        break;
                    case "DIANA":
                        System.out.println("You are connected to Diana");
                        break;
                    default:
                        System.out.println("there is no " + name1 + " in the IT department");
                }
                break;
            case 2:
                System.out.println("Who do you want to speak to from HR department \nTima, \nAna");
                String name2 = scanner.next().toUpperCase();
                switch (name2) {
                    case "TIMA":
                        System.out.println("You are connected to Tima");
                        break;
                    case "ANA":
                        System.out.println("You are connected to Ana");
                        // she si available after 1 pm
                        break;
                    default:
                        System.out.println("there is no " + name2 + " in the HR department");
                }
                break;
            case 3:
                System.out.println("Who do you want to speak to from Admin department \nTima, \nDavid");
                String name3 = scanner.next().toUpperCase();
                switch (name3) {
                    case "TIMA":
                        System.out.println("You are connected to Tima");
                        break;
                    case "DAVID":
                        System.out.println("You are connected to David");
                        break;
                    default:
                        System.out.println("there is no " + name3 + " in the Admin department");
                        break;
                }
                break;
            default:
                System.out.println("No matching department for your entry, you are connecting to John");
                break;


        }

    }
}
