package ss5_loop;

import java.util.Scanner;

// Bài 1: In dãy số 1, 2, 3, 4, 5,..., n

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
        }
    }
}
