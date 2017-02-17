package dz4;

import java.util.Scanner;

public class Task2_1 {
// С консолью ввода - Вовын Вариант, он мне помог...

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();
        oddElements(n);
    }

    public static void oddElements(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ") " + (i * 2 + 1));
        }
    }
}