package de.telran.practica;

import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        String[] strings = {"aaa", "zzz", "yyy", "www"};
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));


    }
}
