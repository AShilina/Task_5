import java.util.Scanner;

public class MultiplicationTable {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, для которого требуется таблица умножения:");
        int Number = in.nextInt();
        int x1 = Number;
        int x2 = Number * 2;
        int x3 = Number * 3;
        int x4 = Number * 4;
        int x5 = Number * 5;
        int x6 = Number * 6;
        int x7 = Number * 7;
        int x8 = Number * 8;
        int x9 = Number * 9;
        int x10 = Number * 10;

        System.out.printf("%d * 1 = %d \n", Number, x1);
        System.out.printf("%d * 2 = %d \n", Number, x2);
        System.out.printf("%d * 3 = %d \n", Number, x3);
        System.out.printf("%d * 4 = %d \n", Number, x4);
        System.out.printf("%d * 5 = %d \n", Number, x5);
        System.out.printf("%d * 6 = %d \n", Number, x6);
        System.out.printf("%d * 7 = %d \n", Number, x7);
        System.out.printf("%d * 8 = %d \n", Number, x8);
        System.out.printf("%d * 9 = %d \n", Number, x9);
        System.out.printf("%d * 10 = %d \n", Number, x10);
    }
}