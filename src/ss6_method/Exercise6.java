package ss6_method;

import java.util.Scanner;

/**
 * Nhập và in thông tin của một nhân viên
 */


public class Exercise6 {

    static String name;
    static int age;
    static String gender;
    static double salary;
    static double averageScore;

    public static void main(String[] args) {
        enterInformation();
        exportInformation();
    }

    public static void enterInformation() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào tên: ");
        name = sc.nextLine();

        System.out.print("Nhập vào tuổi: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập vào giới tính: ");
        gender = sc.nextLine();

        System.out.print("Nhập vào mức lương: ");
        salary = sc.nextDouble();

        System.out.print("Nhập vào điểm trung bình: ");
        averageScore = sc.nextDouble();
    }

    public static void exportInformation() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Mức lương: " + salary);
        System.out.println("Điểm trung bình: " + averageScore);
    }
}
