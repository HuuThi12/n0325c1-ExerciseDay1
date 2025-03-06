package ss3_java_overview;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a = ");
        int a = sc.nextInt();

        System.out.print("Nhập b = ");
        int b = sc.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double)a / b;
        System.out.println("tổng là : " + sum);
        System.out.println("hiệu là : " + difference);
        System.out.println("tích là : " + product);
        System.out.println("thương là : " + quotient);
    }
}
