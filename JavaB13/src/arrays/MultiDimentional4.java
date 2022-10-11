package arrays;

import java.util.Arrays;

public class MultiDimentional4 {
    public static void main(String[] args) {
        /*
        computers
            "DELL", "Acer", "HP", "MacPro", "MacAir"
        TV's
            "Samsung", "LG", "Sony", "Hisense"
            Speakers
                "Alexa", "Google", "JBL", "Sonnos", "Beats"

               =========
        Prices:
               computers:
                    1400, 1100, 899.99, 2400, 1200
                TV:
                    1500, 800, 765.99, 385.99
               speakers:
                    99.99, 69.00, 150, 200, 15.99
               //"The price for ... MacAir... is ... 1200.."

         */
        String[][] devices = { {"DELL", "Acer", "HP", "MacPro", "MacAir"}, {"Samsung", "LG", "Sony", "Hisense"},
                {"Alexa", "Google", "JBL", "Sonnos", "Beats"}};
        double[][] prices = {{1400, 1100, 899.99, 2400, 1200}, {1500, 800, 765.99, 385.99}, {99.99, 69.00, 150, 200, 15.99} };
        for(int a=0; a<devices.length; a++){
            for (int b=0; b<devices.length; b++){
                System.out.println("The price for " + devices[a][b] + " is $" + prices[a][b]);
            }
        }
        System.out.println("==========");
        //I want to see devices that are less than $500
        for(int a=0; a<devices.length; a++){
            for (int b=0; b<devices.length; b++){
                System.out.println("The price for " + devices[a][b] + " is $" + prices[a][b]);
                if (prices[a][b]<500){
                    System.out.println("These are the devices for less than $500 : " + devices[a][b]);
                }
            }
        }
        System.out.println("================");

        //I want to see only apple products and their prices
        for(int a=0; a<devices.length; a++) {
            for (int b = 0; b < devices[a].length; b++) {
                if (devices[a][b].contains("Mac")){

                    System.out.println("These are apple products and prices " + devices[a][b] + " : " + prices[a][b]);
                }

            }

        }
    }
}
