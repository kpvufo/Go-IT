package dz4;

public class Task11_1 {

    public static void main(String[] args) {
        int a = 1, b = 1, c = 0;
            System.out.print(a + ", " + b + ", ");
        for (int i = 3; i <= 11; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(i + ") " + c);
        }
    }
}
//В одном методе красивее получилось :)