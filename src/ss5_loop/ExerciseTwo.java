package ss5_loop;

import java.util.Scanner;

// Bài 1: In dãy số lẻ từ 1 đến n

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "\t");
            }
        }

//        System.out.println("---------------------------");
//
//        // cach 2
//        for (int i = 1; i<=n; i+=2){
//            System.out.print(i+ "   ");
//        }
    }
}
