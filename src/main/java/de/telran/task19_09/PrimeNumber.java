package de.telran.task19_09;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        int  i;
        boolean isPrime;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for checking:    ");
        int num = scanner.nextInt();
        for (i = num; i > 1; i--) {
            if (num % i == 0) {
                System.out.println(i);
            }


            }
        }


    }

