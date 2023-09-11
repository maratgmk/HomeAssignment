package de.telran.lesson0709;

import java.util.Random;

public class HomeWork0709 {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = false;
        boolean isWalk = !isRain && isWeekend;
        System.out.println(isWalk);

        //=============================================

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBuy = isEdekaOpen || isReweOpen;
        System.out.println("Я могу купить еду, это: " + canBuy);
        //==========================================================

        double Temperature1 = 99.56;
        double Temperature2 = 99.72;
        boolean Check = Temperature1>100 && Temperature2<100;
        if ( Check) {
            System.out.println("Device works correct");
        }  else{
            System.out.println("Device has some problems");
        }
        //===================================================
        double R1 = 24;
        double R2 = 28;
        double C = 40;
        double result = Math.PI * C * (R2*R2 -R1*R1);
        System.out.println("Превышение допустимой нормы калорий: " + result);
        //======================================================================

        Random t = new Random();
        int s = t.nextInt(28800);
        int p = s / 3600;

        System.out.println("Clock time table in seconds:  " + s);
        System.out.println("Clock time table in hours:  " + p);

    }
}
