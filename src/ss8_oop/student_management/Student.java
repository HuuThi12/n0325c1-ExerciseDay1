package ss8_oop.student_management;

import java.util.Scanner;

public class Student {
    String name;
    double mathScore;
    double literatureScore;

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tên: ");
        name = scanner.nextLine();

        System.out.print("Nhập vào điểm toán: ");
        mathScore = scanner.nextDouble();

        System.out.print("Nhập vào điểm văn: ");
        literatureScore = scanner.nextDouble();
    }

    public void output() {
        System.out.println("Thông tin học sinh: ");
        System.out.println("Tên: " + name);
        System.out.println("Điểm toán: " + mathScore);
        System.out.println("Điểm văn: " + literatureScore);
        System.out.println("Điểm trung bình: " + calculateAvaregeScore());
    }

    public double calculateAvaregeScore() {
        return (mathScore + literatureScore) / 2;
    }

}
