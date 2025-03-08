package ss4_condision;


// Bài 8: Xác định số ngày trong một tháng

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào tháng: ");
        double month = sc.nextDouble();

        System.out.print("Nhập vào năm: ");
        double year = sc.nextDouble();

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Số ngày trong tháng là 30 ngày");
        } else if (month == 2) {
            if (year % 4 == 0 && year != 100 || year % 400 == 0) {
                System.out.println("Số ngày trong tháng là 29 ngày");
            } else {
                System.out.println("Số ngày trong tháng là 28 ngày");
            }
        } else {
            System.out.println("Số ngày trong tháng là 31 ngày");
        }


    }

}
