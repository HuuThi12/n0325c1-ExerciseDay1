package ss5_loop2;

import java.util.Scanner;

/**
 * Bài 9: Đếm và tính tổng các số đối xưng, chính phương, nguyên tố trong đoạn a,b
 */

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        do {
            System.out.print("Nhập số nguyên dương a : ");
            a = sc.nextInt();
            if (a <= 0) {
                System.out.println(" Nhập sai vui lòng nhập lại ");
            }
        } while (a <= 0);

        do {
            System.out.print("Nhập số nguyên dương b : ");
            b = sc.nextInt();
            if (b <= a) {
                System.out.println("Nhập sai vui lòng nhập lại ");
            }
        } while (b <= a);

        // số đối xứng
        int palindromeCount = 0;
        int palindromeSum = 0;

        // số chính phương
        int perfectSquareCount = 0;
        int perfectSquareSum = 0;

        // số nguyên tố
        int primeCount = 0;
        int primeSum = 0;

        // Bước 2: Duyệt qua các số trong đoạn [a, b]
        for (int i = a; i <= b; i++) {
            // Kiểm tra số đối xứng
            int original = i;
            int reversed = 0; // đảo ngược
            int number = i;
            while (number > 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }
            if (original == reversed) {
                palindromeCount++;
                palindromeSum += i;
            }

            // Kiểm tra số chính phương
            int sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i) {
                perfectSquareCount++;
                perfectSquareSum += i;
            }

            // Kiểm tra số nguyên tố
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                primeCount++;
                primeSum += i;
            }
        }
        // Bước 3: In kết quả
        System.out.println("Số đối xứng: " + palindromeCount + " | Tổng: " + palindromeSum);
        System.out.println("Số chính phương: " + perfectSquareCount + " | Tổng: " + perfectSquareSum);
        System.out.println("Số nguyên tố: " + primeCount + " | Tổng: " + primeSum);
    }
}
