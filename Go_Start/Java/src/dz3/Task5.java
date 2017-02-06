package dz3;

public class Task5 {
//В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа. Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей

    public static void main(String[] args) {
        int a = 8;
        int b = -7;
        int c = 3;
        System.out.println("Numbers in variables a, b and c: " + a + ", " + b + ", " + c);
        sort(a, b, c);
    }

    public static void sort(int a, int b, int c) {
        if (a < b & a < c) {
            if (b < c)
                System.out.println("The increasing sequence of: " + a + ", " + b + ", " + c);
            else
                System.out.println("The increasing sequence of: " + a + ", " + c + ", " + b);
        }
        if (b < a & b < c) {
            if (a < c)
                System.out.println("The increasing sequence of: " + b + ", " + a + ", " + c);
            else
                System.out.println("The increasing sequence of: " + b + ", " + c + ", " + a);
        }
        if (c < a & c < b) {
            if (a < b)
                System.out.println("The increasing sequence of" + c + ' ' + a + ' ' + b);
            else
                System.out.println("The increasing sequence of" + c + ' ' + b + ' ' + a);
        }
    }
}
