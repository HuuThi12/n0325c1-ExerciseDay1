package ss5_loop2;

import java.util.Scanner;

/**
 * Bài 5: In các hình dấu sao *
 */

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh: ");
        int lengthEdge = sc.nextInt();

        for (int i = 1; i <= lengthEdge; i++) {
            for (int j = 1; j <= lengthEdge; j++) {
                if (i == 1 || i == lengthEdge || j == 1 || j == lengthEdge || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
