package dz4;

import java.util.Scanner;

public class Task9 {
//Проверьте, входит ли введённое пользователем с клавиатуры натуральное число в диапазон [-10; 10].

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number in the range from -10 to 10: ");
        int n = in.nextInt();
        if (range(n)) {
            System.out.println(n + ", Not in the range");
        }
            else {
        System.out.println(n + ", The number range");
            }
    }

    public static boolean range(int n) {
        return (n >= -10 && n >= 10);
    }
}
