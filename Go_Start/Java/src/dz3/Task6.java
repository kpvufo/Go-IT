package dz3;

import java.util.Random;

public class Task6 {
//На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд, оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов), когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился). Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах. Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том, сколько полных часов осталось до конца рабочего дня. Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
//В переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800], далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна выводиться фраза о количестве полных часов, содержащихся в n секундах.

    public static void main(String[] args) {
        Random rendom = new Random();
        int s = rendom.nextInt(28800);
        System.out.println("Exclusively for Petrov: " + s + " seconds remaining");
        totalHours(s);
    }

    public static void totalHours(int s) {
        int h = (s / 60) / 60;
        switch (h) {
            case 0:
                System.out.println("Until the end of less than an hour");
                break;
            case 1:
                System.out.println("By the end of stay " + h + " hour");
                break;
            default:
                System.out.println("By the end of stay " + h + " hours");
        }
    }
}
