package dz3;

import java.util.Scanner;

public class Task1 {
// Дано целое число. Если число чётное, то к нему прибавить 2, а если нечётное, то 1.  Не использовать условие "если" (if).

    public static void main(String[] args) {
        System.out.println("Please enter number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(number(n));
    }

    public static int number(int n) {
        int x = n % 2;
        switch (x) {
            case 0:
                return n + 2;
            default:
                return n + 1;
        }
    }
}
