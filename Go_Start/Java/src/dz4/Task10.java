package dz4;

public class Task10 {
//Создайте программу, выводящую на экран 12 первых элементов последовательности 2an-2–2, где a1=3 и a2=2

    public static void main(String[] args) {
        for (int i = 1, a1 = 3, a2 = 2; i <= 12; a1 = 2 * a1 - 2, a2 = 2 * a2 - 2, i++) {
            System.out.println(i + ") " + a1 + ", " + a2);
        }
    }
}
