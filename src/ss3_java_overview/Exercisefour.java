package ss3_java_overview;

import java.util.Scanner;

public class Exercisefour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập điểm môn toán: ");
        double math = sc.nextDouble();

        System.out.print("Nhập điểm môn lý: ");
        double physics = sc.nextDouble();

        System.out.print("Nhập điểm môn hóa: ");
        double chemistry = sc.nextDouble();

        System.out.print("Nhập hệ số môn toán: ");
        int coefficientMath = sc.nextInt();

        System.out.print("Nhập hệ số môn lý: ");
        int coefficientPhysics = sc.nextInt();

        System.out.print("Nhập hệ số môn hóa: ");
        int coefficientChemistry = sc.nextInt();

        int sumCoefficient = coefficientMath + coefficientPhysics + coefficientChemistry;

        double averageScore = ((math * coefficientMath) + (physics * coefficientPhysics) + (chemistry * coefficientChemistry)) / sumCoefficient;

        System.out.println("---------------------------");
        System.out.println("Điểm trung bình là :" + averageScore);


    }
}
