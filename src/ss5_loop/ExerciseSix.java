package ss5_loop;

import java.util.Scanner;

/**
 * Bài 6:  In dãy số 2, -4, 6, 8, -10, 12, 14, 16, -18, ….., n
 */


public class ExerciseSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        int count = 0;
        int distance = 1;

        for (int i = 2; i <= n; i += 2) {
            if (count == distance) {
                System.out.printf("-%-4d", i);
                count = 0;
                distance++;
            } else {
                System.out.printf("%-4d", i);
                count++;
            }
        }
    }
}
