package ss4_condision;


// Bài 7: Tính lương nhân viên theo thâm niên công tác

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Bài 7: Tính lương nhân viên theo thâm niên công tác
 * final: hàm số,
 * final : quy tắc đặt tên biến final viết hoa và gạch dưới vdu: BASIC_SALARY
 */

public class ExerciseSeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào thâm niên câm tác (TNCT) : ");
        double TNCT = sc.nextDouble();

        double coefficient = 0;


        final int BASIC_SALARY = 650000;


        if (TNCT < 12) {
            coefficient = 1.92;
        } else if (TNCT < 36) {
            coefficient = 2.34;
        } else if (TNCT < 60) {
            coefficient = 3;
        } else {
            coefficient = 4.5;
        }

        double salary = coefficient * BASIC_SALARY;

        // Định dạng số với dấu chấm làm phân cách nghìn và dấu phẩy sau phần thập phân
        DecimalFormat formatter = new DecimalFormat("#,##0.0");

        // In ra số theo định dạng yêu cầu và thêm ký hiệu $
        String formattedSalary = formatter.format(salary) + "$";

        System.out.println("Lương của nhân viên là : " + formattedSalary);


    }

}
