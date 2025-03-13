package ss6_method;

import java.util.Scanner;

/**
 * a. Viết phương thức đổi ký tự hoa xong ký tự thường
 * a. Viết phương thức giải phương trình bậc nhất
 * a. Viết phương thức giải phương trình bậc hai
 * a. Viết phương thức trả về giá trị nhỏ nhất của 4 số nguyên
 */


public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();

        System.out.print("Nhập b: ");
        int b = sc.nextInt();

        System.out.print("Nhập c: ");
        int c = sc.nextInt();

        System.out.print("Nhập d: ");
        int d = sc.nextInt();
//        lovelOne(a, b);
//        levelTwo(a, b, c);
        System.out.println("Min là: " + min(a, b, c, d));
    }

    // cau b
    public static void levelOne(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("Nghiệm của phương trình là :" + -b / a);
        }
    }

    // cau c
    public static void levelTwo(double a, double b, double c) {
        if (a == 0) {
            levelOne(b, c);
        } else {
            double delta = b * b - (4 * a * c);
            if (delta < 0) {
                System.out.println("phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.println("Phương trình có 1 nghiệm là x1 = x2 =" + -c / a);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.print("Nghiệm x1 : " + x1);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.print("Nghiệm x1 : " + x2);
            }
        }
    }

    // cau d
    public static int min(int a, int b, int c, int d) {
        int min = Math.min(a, b);
        min = Math.min(min, c);
        min = Math.min(min, d);
        return min;
    }
}
