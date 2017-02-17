package dz4;

public class Task2 {
//Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….

    public static void main(String[] args) {
        int n = 55;
        oddElements(n);
    }

    public static void oddElements(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ") " + (i * 2 + 1));
        }
    }
}
