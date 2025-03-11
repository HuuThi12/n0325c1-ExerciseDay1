package ss5_loop;

import java.util.Scanner;

/**
 * Bài 11: Tính tổng S = 1 + 1/3! + 1/5! + ... + 1/(2n-1)
 */

public class ExerciseEleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        double sum = 0.0;

        double fact = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                fact *= j;
            }
            sum += 1.0 / fact;
        }
        System.out.println("Tổng là: " + sum);
    }
}
