package ss5_loop2;

import java.util.Scanner;

/**
 * Bài 7: Tính tổng giai thừa của 3 số nguyên dương
 */

public class ExercisSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        int factorialA = 1, factorialB = 1, factorialC = 1;

        do {
            System.out.print("Nhập vào số nguyên dương a: ");
            a = sc.nextInt();

            if (a <= 0) {
                System.out.println("Bạn cần nhập số nguyên dương! Vui lòng nhập lại");
            }
        } while (a <= 0);

        do {
            System.out.print("Nhập vào số nguyên dương b: ");
            b = sc.nextInt();

            if (b <= 0) {
                System.out.println("Bạn cần nhập số nguyên dương! Vui lòng nhập lại");
            }
        } while (b <= 0);

        do {
            System.out.print("Nhập vào số nguyên dương c: ");
            c = sc.nextInt();

            if (c <= 0) {
                System.out.println("Bạn cần nhập số nguyên dương! Vui lòng nhập lại");
            }
        } while (c <= 0);


        for (int i = 1; i <= a; i++) {
            factorialA *= i;
        }

        for (int i = 1; i <= b; i++) {
            factorialB *= i;
        }

        for (int i = 1; i <= c; i++) {
            factorialC *= i;
        }

        int s = factorialA + factorialB + factorialC;

        System.out.printf("Tổng giai thừa của %d! + %d! + %d! = %d ", a, b, c, s);
    }
}
