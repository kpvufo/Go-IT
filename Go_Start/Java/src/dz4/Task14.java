package dz4;

public class Task14 {
//В городе N есть большой склад на котором существует 50000 различных полок. Для удобства работников руководство склада решило заказать для каждой полки табличку с номером от 00001 до 50000 в местной типографии, но когда таблички напечатали, оказалось что печатный станок из-за неисправности не печатал цифру 2, поэтому все таблички, в номерах которых содержалась одна или более двойка (например, 00002 или 20202) — надо перепечатывать. Напишите программу, которая подсчитает сколько всего таких ошибочных табличек оказалось в бракованной партии.

    public static void main(String[] args) {
        int n = 0;
        System.out.println("The number of defective tablets - " + defectiveTablets(n));
    }

    public static int defectiveTablets(int n) {
        for (int i = 2; i <= 50000; i++) {
            String s = String.valueOf(i);
            if (s.indexOf('2') != -1) {
                n++;
            }
        }
        return n;
    }
}
