package ss5_loop2;

import java.util.Scanner;

/**
 * Bài 3: In các hình tam giác bằng dấu sao *
 */

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh: ");
        int lengthEdge = sc.nextInt();

        System.out.println("hình a");
        for (int i = 1; i <= lengthEdge; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("hình b");
        for (int i = 1; i <= lengthEdge; i++) {
            for (int j = 1; j <= lengthEdge - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("hình c");
        for (int i = 1; i <= lengthEdge; i++) {
            for (int j = 1; j <= lengthEdge - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("hình d");
        for (int i = 1; i <= lengthEdge; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= lengthEdge - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("hình e");
        for (int i = 1; i <= lengthEdge; i++) {
            for (int j = 1; j <= lengthEdge - i + 1; j++) {
                if (i == 1 || j == 1 || j == lengthEdge - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("hình f");
        for (int i = 1; i <= lengthEdge; i++) {
            for (int j = 1; j <= lengthEdge - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("hình g");
        for (int i = 1; i <= lengthEdge; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (lengthEdge - i) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
