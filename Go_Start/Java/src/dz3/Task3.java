package dz3;

public class Task3 {
//Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155] целое число в интервал (25;100) и сообщать результат на экран.

    public static void main(String[] args) {
        int n = (int) (Math.random() * 150 + 1) + 5;
        System.out.print("The number: " + n + " is not in the interval 25-100: " + numberOfChecks(n));
    }

    public static boolean numberOfChecks(int n) {
        return (n <= 25 || n >= 100);
    }
}
