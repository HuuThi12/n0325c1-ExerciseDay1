package ss5_loop2;

import java.util.Scanner;

/**
 * Bài 1: In hình hộp bằng dấu sao *
 */

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh: ");
        int lengthEdge = sc.nextInt();

        for (int i = 1; i <= lengthEdge; i++) {
            for (int j = 1; j <= lengthEdge; j++) {
                if (i == 1 || i == lengthEdge || j == 1 || j == lengthEdge) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
