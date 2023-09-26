package de.telran.homework19_09;

import java.util.Random;

public class Array1 {
    public static void main(String[] args) {

        int[] arrayRandom = new int[8];

        arrayRandom[0] = (int) (Math.random()*50 +1);
        arrayRandom[1] = (int) (Math.random()*50 +1);
        arrayRandom[2] = (int) (Math.random()*50 +1);
        arrayRandom[3] = (int) (Math.random()*50 +1);
        arrayRandom[4] = (int) (Math.random()*50 +1);
        arrayRandom[5] = (int) (Math.random()*50 +1);
        arrayRandom[6] = (int) (Math.random()*50 +1);
        arrayRandom[7] = (int) (Math.random()*50 +1);

        System.out.println(arrayRandom[0] + "," + arrayRandom[1] + "," + arrayRandom[2] + "," + arrayRandom[3] + "," + arrayRandom[4] + "," + arrayRandom[5] + "," + arrayRandom[6] + "," + arrayRandom[7]);

        for(int i = 0; i < arrayRandom.length; i ++){
            arrayRandom[i] = (int) (Math.random()*50 +1);
            System.out.print(arrayRandom[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayRandom.length; i++){
            arrayRandom[i] = (int) (Math.random()*50 +1);
            if (i % 2 == 0){
                arrayRandom[i] = 0;
            }
            System.out.print(arrayRandom[i] + " ");
        }



    }
}
