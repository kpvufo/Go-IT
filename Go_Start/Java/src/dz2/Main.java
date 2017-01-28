package dz2;

public class Main {

    public static void main(String[] args) {
        division(21, 8);
        System.out.println("The sum of digits of the number 85: " + sum(85));
        System.out.println("The number is rounded to the nearest whole 9.8: " + rounding(9.8));
        System.out.println("The sum2 of digits of the number 285: " + sum2(285));
    }

    // В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления q на w с остатком. Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8):21 / 8 = 2 и 5 в остатке
    public static void division (int q, int w){
        System.out.println("the result is " + (int) (q/w) + "and " + q%w);
    }

    // В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n
    public static int sum(int n) {
        return (int) (n/10) + n%10;
    }

    //В переменной n хранится вещественное число с ненулевой дробной частью. Создайте программу, которая округляет число n до ближайшего целого и выводящую результат на экран
    public static int rounding(double n) {
        return (int) (n + 0.5);
    }

    //В переменной n хранится натуральное трёхзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
    public static int sum2(int n) {
        return (int) (n/100) + ((int) (n / 10)%10) + n %10;
    }
}