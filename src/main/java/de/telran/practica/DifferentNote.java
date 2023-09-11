package de.telran.practica;

import java.util.Random;

public class DifferentNote {

    public static void main(String[] args) {
double random1 = Math.random();
double random2 = Math.random();
double result = random2 * random1;

        System.out.println(random1);
        System.out.println((int) (random1*100));
        System.out.println((int) (random1*100 + 1));
        System.out.println(result);
//=============================================================
        Random t = new Random();
        System.out.println(t);
        int r = t.nextInt();
        System.out.println(r);
        int s = t.nextInt(28800);
        System.out.println(s);







        }
    }

