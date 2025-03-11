package ss5_loop;

import java.util.Scanner;

/**
 * Bài 11: Tìm USCLN và BSCNN của 2 số nguyên dương
 */

public class ExerciseThirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = sc.nextInt();

        System.out.print("Nhập b: ");
        int b = sc.nextInt();

        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("USCLN là: " + i);
                break;
            }
        }

        for (int i = a; true; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println("BSCNN là: " + i);
                break;
            }
        }
    }
}
