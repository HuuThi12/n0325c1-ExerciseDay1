package ss3_java_overview;

import java.time.Year;
import java.util.Scanner;

/**
 *   Nhập vào năm sinh của một người, tính tuổi người đó
 */
public class ExerciseOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //        bài 1
        System.out.print("Nhập vào năm sinh của bạn: ");
        int year = sc.nextInt();

        int age = Year.now().getValue() - year;

        System.out.println("Tuổi của bạn là: " + age);

    }
}
