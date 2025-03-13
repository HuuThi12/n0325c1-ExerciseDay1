package ss6_method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số n: ");
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.printf("%d là số nguyên tố\n", n);

        } else {
            System.out.printf("%d không phải là số nguyên tố\n", n);
        }
        System.out.println("Sum : " + total(n));
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int total(int n) {
        int sum = 0;
        while (n != 0) {
            if (isPrime(n % 10)) {
                sum += n % 10;
            }
            n /= 10;
        }
        return sum;
    }
}


