package ss5_loop;

import java.util.Scanner;

/**
 * Bài 11: Tính tổng và tích các chữ số của một số nguyên
 */

public class ExerciseTwelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập m: ");
        int m = sc.nextInt();

        int s = 0;
        int p = 1;

        while (m > 0) {
            double digit = m % 10;
            s += digit;
            p *= digit;
            m /= 10;
        }
        System.out.println("Tổng là: " + s);
        System.out.println("Tích là: " + p);
    }
}
