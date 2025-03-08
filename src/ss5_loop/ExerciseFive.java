package ss5_loop;

import java.util.Scanner;

// Bài 5: In dãy số chẵn từ 2 đến 2n

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + "\t");

        }


    }
}
