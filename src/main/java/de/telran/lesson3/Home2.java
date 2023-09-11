package de.telran.lesson3;

import java.util.Scanner;

public class Home2 {



    public static void main(String[] args) {


    String nothing = new String("I study Basic Java");

    nothing = nothing + "!!!";
    int Length= nothing.length();
        System.out.println(Length);
        System.out.println(nothing.charAt(Length-2));
        System.out.println(nothing.substring(2,7));


        System.out.println(nothing);
        System.out.println(nothing.length());
        System.out.println(nothing.charAt(5));

        Scanner nothing1 = new Scanner(System.in);
        String s = "Omega";
        String t = "  ";
        String k = "is";
        String d = "  ";
        String p = "Alfa";
        String concatenation = "s + t + k + d + p";
        System.out.println(concatenation);
        System.out.println(concatenation.length());
        System.out.println(s + t + k + d + p);
        System.out.println(s.length() + t.length() + k.length() + d.length() + p.length());
        System.out.println(s + t + k + d + p);

    }

}
