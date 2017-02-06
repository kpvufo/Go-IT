package dz3;

import java.util.Random;

public class Task4 {
//Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.

    public static void main(String[] args) {
        Random rendom = new Random();
        int n = rendom.nextInt(899) + 100;
        System.out.println("Among " + n + " highest figure " + number(n));
    }

    public static int number(int n) {
        int a = n % 10;
        int b = (n / 10) % 10;
        int c = (n / 100) % 10;
        if (a >= b & a > c || a > b & a >= c)
            return a;
        else {
            if (b > c & b >= c)
                return b;
            else
                return c;
        }
    }
}
