package ss4_condision;


// Bài 6: Giải phương trình bậc 2

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá trị của a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập giá trị của b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập giá trị của c: ");
        double c = sc.nextDouble();


        if (a == 0) {
            // bx + c = 0
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm ");
                } else {
                    System.out.println("Phương trình vô nghiệm ");
                }
            } else {
                System.out.println("Nghiệm của phương trình là :" + -c / b);

            }
        } else {
            // ax2 + bx + c = 0
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm duy nhất : " + x);
            } else {
                double sqrtDelta = Math.sqrt(delta);
                double x1 = (-b - sqrtDelta) / (2 * a);
                double x2 = (-b + sqrtDelta) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm : x1 = " + x1 + "\t x2 = " + x2);
            }
        }


    }

}
