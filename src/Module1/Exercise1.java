package Module1;

import java.util.Scanner;

/**
 * In hình * sau
 */

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh: ");
        int lenghtEdge = sc.nextInt();

        for (int i = 1; i <= lenghtEdge; i++) {
            for (int j = 1; j <= lenghtEdge - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
