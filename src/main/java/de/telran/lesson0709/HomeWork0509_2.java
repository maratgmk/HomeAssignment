package de.telran.lesson0709;

import java.util.Scanner;

public class HomeWork0509_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input x:  " );
        double y = scanner.nextDouble();
        System.out.print("Input y:  ");
        double x = scanner.nextDouble();
        double sum = x+y;
        double sub = x-y;
        double mul = x*y;
        double div = x/y;

        System.out.println("Result of sum:  "  + sum);
        System.out.println("Result of sub:  " + sub);
        System.out.println("Result of mul  " + mul);
        System.out.println("Result of div:  " + div);
//===========================================================

        System.out.print("Rate of currency:  ");
        double r = scanner.nextDouble();
        System.out.print("Quantity in Euro:  ");
        double e = scanner.nextDouble();
        double result = r*e;
        System.out.print("Quantity in USD:  " + result  );


//================================================================


        System.out.print("   Input initial system of calculus: ");
        int inNumbers = scanner.nextInt();

        System.out.print("Input number:   ");
        String inStr = scanner.next();
        long inStrNumber = Long.parseLong(inStr,inNumbers);

        System.out.print("What kind of system to need:  ");
        int outNumbers = scanner.nextInt();

        System.out.print("Transformed number:  " + Long.toString(inStrNumber, outNumbers));
//===========================================================================

        System.out.println("     333 from hex to dec  = 819");








    }
}

