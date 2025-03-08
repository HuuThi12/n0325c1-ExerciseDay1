package ss5_loop;

import java.util.Scanner;

// Bài 10: Tính tổng S = 1 + 1/2 + 1/3 + ... + 1/n

public class ExerciseTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        double s = 0.0;

        for (int i = 1; i <= n; i++) {
            s += 1.0 / i;
        }
        System.out.print(s + "\t");

    }
}
