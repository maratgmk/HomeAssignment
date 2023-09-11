package de.telran.lesson0709;

import java.util.Scanner;

public class HomeWork0509_1 {
    public static void main(String[] args) {
        String s = new String("I study Basic Java!");
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt((s.length() - 1)));
        System.out.println(s.substring(4,9));
        System.out.println(s.contains("Java"));
        System.out.println(s.replace('a','o'));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(0,14));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст1: ");
        String text1 = scanner.nextLine();
        System.out.print("Введите текст2: ");
        String text2 = scanner.nextLine();
        System.out.println(text1.length());
        System.out.println(text2.length());
        System.out.println(text1.length()/2);
        System.out.println(text2.length()/2);
        System.out.println(text1.substring(0,text1.length()/2) + text2.substring(0,text2.length()/2));









    }
}
