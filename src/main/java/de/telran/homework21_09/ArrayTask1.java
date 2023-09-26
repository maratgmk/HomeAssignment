package de.telran.homework21_09;

import java.util.Arrays;

/*
Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
Не используйте дополнительный массив для хранения результатов.

 */
public class ArrayTask1 {
    public static void main(String[] args) {


        String[] text = {"0","1","2","3","4"};
//      System.out.println(Arrays.toString(text));
        System.out.println(text);
        for (int i = 0; i < text.length; i++){
           System.out.print(text[i] + " ");
        }
        System.out.println();
        for (int i =0; i < text.length/2; i++){
            String temp = text[i];

            text[i] = text[text.length -1 -i];
            text[text.length -1 -i] = temp;

        }
        System.out.println(text);
        for (int i = 0; i < text.length; i++){
            System.out.print(text[i] + " ");
        }




    }
}
