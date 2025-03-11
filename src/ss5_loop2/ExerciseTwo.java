package ss5_loop2;

import java.util.Scanner;

/**
 * Bài 2: In các hình hộp bằng dấu sao *
 */

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh: ");
        int lengthEdge = sc.nextInt();

        System.out.println("hình a");
        for (int i = 1; i <= lengthEdge; i++) {
            for (int j = 1; j <= lengthEdge; j++) {
                if (i == 1 || i == lengthEdge || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Hình b");
        for (int i = 1; i <= lengthEdge; i++) {
            for (int j = 1; j <= lengthEdge; j++) {
                if (i == 1 || i == lengthEdge || j == lengthEdge) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Hình c");
        for (int i = 1; i <= lengthEdge; i++) {
            for (int j = 1; j <= lengthEdge; j++) {
                if (i == lengthEdge || j == 1 || j == lengthEdge) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
