package ss5_loop2;

import java.util.Scanner;

/**
 * Bài 4: In các hình dấu sao *
 */

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh: ");
        int lengthEdge = sc.nextInt();

        System.out.println();
        System.out.println("Hình a");
        for (int i = 1; i <= lengthEdge; i++) {
            for (int j = 1; j <= lengthEdge; j++) {
                if (i == 1 || i == lengthEdge || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Hình b");
        for (int i = 1; i <= lengthEdge; i++) {
            for (int j = 1; j <= lengthEdge; j++) {
                // j == lengthEdge - i + 1 in ra cac dong 2,3,4 dau *
                if (i == 1 || i == lengthEdge || j == lengthEdge - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
