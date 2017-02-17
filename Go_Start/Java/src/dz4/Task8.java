package dz4;

import java.util.Scanner;

public class Task8 {
//Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please, enter some integer: ");
        int n = scn.nextInt();
        naturalNumberDivisors(n);
    }

    public static int naturalNumberDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Positive divisor of number is: " + i);
            }
        }
        return n;
    }
}
