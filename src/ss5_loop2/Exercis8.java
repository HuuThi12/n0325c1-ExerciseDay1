package ss5_loop2;

import java.util.Scanner;

/**
 * Bài 8: kiểm tra số nguyên dương
 */

public class Exercis8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Câu a kiểm tra số đối xứng");
        System.out.print("Nhập vào số nguyên dương : ");
        int a = sc.nextInt();

        // câu a
        String str = String.valueOf(a);
        boolean isPalindrome = true;
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.printf("%d là số đối xứng", a);
        } else {
            System.out.printf("%d không phải là số đối xứng", a);
        }
        System.out.println();
        System.out.println("-----------------------------");


        // Câu b
        System.out.println("Câu b kiếm tra số nguyên tố");
        System.out.print("Nhập vào số nguyên dương b : ");
        int b = sc.nextInt();

        boolean isPrime = true;
        if (b < 2) {
            isPrime = false;
        }
        for (int i = 2; i <= b - 1; i++) {
            if (b % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.printf("%d là số nguyên tố", b);
        } else {
            System.out.printf("%d không phải là số nguyên tố", b);
        }

        System.out.println();
        System.out.println("-----------------------------");


        // Câu c
        System.out.println("Câu c kiểm tra các chữ số tăng dần");
        System.out.print("Nhập vào số nguyên dương c : ");
        int c = sc.nextInt();

        String str1 = String.valueOf(c);

        boolean isIncreasing = true;
        if (b < 2) {
            isPrime = false;
        }
        for (int i = 0; i < str1.length() - 1; i++) {
            if (str1.charAt(i) >= str1.charAt(i + 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPrime) {
            System.out.printf("%d chứa các số tăng dần", c);
        } else {
            System.out.printf("%d không chứa các số tăng dần", c);
        }
    }
}
