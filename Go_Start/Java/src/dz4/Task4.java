package dz4;

public class Task4 {
//Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128
// Красивый по выводу на экран вариант :)

    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 20; i++) {
            num = num * 2;
            System.out.println(i + ") " + num);
        }
    }
}
