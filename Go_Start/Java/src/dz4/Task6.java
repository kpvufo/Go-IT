package dz4;

public class Task6 {
//Выведите на экран все двузначные члены последовательности 2an-1+200, где a1= –166

    public static void main(String[] args) {
        for (int a = -166; a < 100; a = 2 * a + 200) {
            if (a > -100 && (a < -9 || a > 9))
            System.out.print(a + ", ");
        }
    }
}
