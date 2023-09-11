package de.telran.lesson0709;

import java.util.Scanner;

public class HomeWork0509_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        System.out.print("   Input initial system of calculus: ");
        int inNumbers = scanner.nextInt();

        System.out.print("Input number:   ");
        String inStr = scanner.next();
        long inStrNumber = Long.parseLong(inStr,inNumbers);

        System.out.print("What kind of system to need:  ");
        int outNumbers = scanner.nextInt();

        System.out.print("Transformed number:  " + Long.toString(inStrNumber, outNumbers));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("     333 from hex to dec  = 819 == 3*16^2 + 3*16 + 3");
        System.out.println("      101101 from binary to dec =45 == 2^5 + 2^3 + 2^2 + 1");
    }
}
