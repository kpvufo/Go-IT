package dz4;

import java.util.Scanner;

public class Task12 {
//Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе)

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter some integer: ");
        int number = in.nextInt();
        System.out.println("The sum of all digits of entered number is: " + sum(number));
    }

    public static int sum(int number) {
        int sum = 0;
        do {
            sum += number % 10;
            number /= 10;
        } while (number != 0);
        return sum;
    }
}