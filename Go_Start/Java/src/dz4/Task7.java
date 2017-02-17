package dz4;

import java.util.Scanner;

public class Task7 {
//Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();
        System.out.println(n + "! = " + factorialNaturalNumber(n));
    }

    public static int factorialNaturalNumber(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *=i;
        }
        return f;
    }
}
