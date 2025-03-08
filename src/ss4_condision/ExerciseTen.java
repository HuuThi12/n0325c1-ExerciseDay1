package ss4_condision;


// Bài 10: Kiểm tra số chính phương

import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập x: ");
        double x = sc.nextInt();

        double squareRoot = Math.sqrt(x);

        if (squareRoot % 1 == 0) {
            System.out.println("X là số chính phương. ");
        } else {
            System.out.println("X không phải là số chính phương. ");
        }


    }

}
