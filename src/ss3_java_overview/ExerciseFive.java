package ss3_java_overview;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập bán kính của hình tròn : ");
        double r = sc.nextDouble();

        double C = 2 * Math.PI * r;

        double A = Math.PI * r * r;


        System.out.printf("Chu vi hình tròn : %.2f\n", C);
        System.out.printf("Diện tích hình tròn : %.2f\n", A);
    }
}
