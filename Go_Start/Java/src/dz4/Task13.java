package dz4;

public class Task13 {
//В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает, как много сувениров потребуется. С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?

    public static void main(String[] args) {
        int n = 0;
        System.out.println("Number of lucky tickets - " + numberOfLuckyTickets(n));
    }

    public static int numberOfLuckyTickets(int n) {
        for (int i = 100; i <= 999999; i++) {
            int i1 = i / 100000 % 10;
            int i2 = i / 10000 % 10;
            int i3 = i / 1000 % 10;
            int i4 = i / 100 % 10;
            int i5 = i / 10 % 10;
            int i6 = i / 1 % 10;
            if ((i1 + i2 + i3) == (i4 + i5 + i6)) {
                n++;
            }
        }
        return n;
    }
}
