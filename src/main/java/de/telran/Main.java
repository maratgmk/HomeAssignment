package de.telran;

public class Main {
    public static void main(String[] args) {
       Calculator summa = new Calculator();
       int x=2; int y=3;
      int result = summa.sum(x,y);
        System.out.println("телега = " + result +"," + x + "," + y);
        int result1 = summa.sum(x+2,y+1);
        System.out.println("телега = " + result1 +"," + x + "," + y);
    }
}

