package de.telran.homework19_09;
/*
Создайте массив из 5 случайных целых чисел из интервала [10;99]

Выведите его на консоль в строку.

Определите и выведите на экран сообщение о том, является ли
массив строго возрастающей последовательностью.

 */
public class Array2 {
    public static void main(String[] args) {
        int[] arrRand = new int[5];
        for (int i = 0; i < arrRand.length; i++) {
            arrRand[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
            System.out.print(arrRand[i] + " ");
           // if (arrRand[i] < arrRand[i++]) {
             //   System.out.println("This sequence is strictly increasing ");
            //} else {
              //  System.out.println("This sequence is random ");
            }

        }
    }
