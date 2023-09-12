package de.telran.lesson0709;

import java.util.Random;
import java.util.Scanner;

public class HomeWork0709 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input estimate of isWeekend:  "     );
        boolean isWeekend = scanner.nextBoolean();
        System.out.print("Input estimate of isRain:     ");
        boolean isRain = scanner.nextBoolean();
        boolean isWalk = !isRain && isWeekend;
        System.out.println("I can walk today:  " + isWalk);
        System.out.println("                  ");


        //=============================================
        System.out.print("Edeka is open:   ");
        boolean isEdekaOpen = scanner.nextBoolean();
        System.out.print("Rewe is open:    ");
        boolean isReweOpen = scanner.nextBoolean();
        boolean canBuy = isEdekaOpen || isReweOpen;
        System.out.println("Я могу купить еду, это: " + canBuy);
        System.out.println("   ");

        //==========================================================

        System.out.print("Temperature of the first bulb:    ");
        double Temperature1 = scanner.nextDouble();
        System.out.print("Temperature of the second bulb:   ");
        double Temperature2 = scanner.nextDouble();
        boolean Check = Temperature1>100 && Temperature2<100;
        if ( Check) {
            System.out.println("Device works correct");
        }  else{
            System.out.println("Device has some problems");
        }
        System.out.println("       ");

        System.out.println("Diameter of the first pizza:  "  +  24 + "  cm");
        double R1 = 24;
        System.out.println("Diameter of the second pizza:   "  + 28 + "  cm");
        double R2 = 28;
        System.out.println("One squared cm of a pizza has:   "  + 40  + "  calories ");
        double C = 40;
        double result = Math.PI * C * (R2*R2 -R1*R1);
        System.out.println("Nutrition norm is more on: " + result + "  calories");
        System.out.println("     ");
        //======================================================================

        double t = Math.random();
        System.out.println("Random number: " + t );

        double s = t*(28800 +1);
        int S = (int)s;
        System.out.println(S);
        int h = S / 3600;

        System.out.println("Clock time table in seconds:  " + S  );
        System.out.println("Clock time table in hours:  " + h);

    }
}
