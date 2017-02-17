package dz4;

public class Task4 {
//Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128
// Красивый по выводу на экран вариант :)

    public static void main(String[] args) {
        for (int i = 1, num = 2; i <= 20; num = num * 2, i++) {
            System.out.println(i + ") " + num);
        }
    }
}
