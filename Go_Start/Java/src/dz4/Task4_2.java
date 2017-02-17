package dz4;

public class Task4_2 {
// Эксперементальный вариант :)

    public static void main(String[] args) {
        int n = 1;
        int p = 1050000;
        oddElements(p, n);
    }

    public static void oddElements(int p, int n) {
        for (int i = 2; i < p; i = i * 2) {
            System.out.println((n++) + ") " + i);
        }
    }
}
