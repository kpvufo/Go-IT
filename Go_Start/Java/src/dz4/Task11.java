package dz4;

public class Task11 {
//Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 0;
        System.out.print(a + ", " + b + ", ");
        System.out.print(fibonacciSequence(a, b, c));
        }

    public static int fibonacciSequence(int a,int b, int c) {
        int i = 3;
        while (i <= 11) {
            c = a + b;
            a = b = c;
            System.out.print(c + ", ");
            i++;
        }
        return i;
    }
}
// Не разобрался почему в послендяя цифра 12-ть вылазит, подощреваю что это i - но почему так происходит?