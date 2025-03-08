package ss4_condision;


// Bài 11: Kiểm tra và tìm ngày kế tiếp, ngày trước đó

import java.util.Scanner;

public class ExerciseEleven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int day = sc.nextInt();

        System.out.print("Nhập tháng: ");
        int month = sc.nextInt();

        System.out.print("Nhập năm: ");
        int year = sc.nextInt();


        int maxDaysInMonth = 31;

        if ((day < 1 || day > 31) || (month < 1 || month > 12) || (year < 1)) {
            System.out.println("Ngày tháng năm bạn vừa nhập không hợp lệ, vui lòng nhập lại! ");
        } else {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                maxDaysInMonth = 30;
            } else if (month == 2) {
                if (year % 4 == 0 && year != 100 || year % 400 == 0) {
                    maxDaysInMonth = 29;
                } else {
                    maxDaysInMonth = 28;
                }
            } else {
                maxDaysInMonth = 31;
            }


            // Tính ngày tiếp theo
            int nextDay = day + 1;
            int nextMonth = month;
            int nextYear = year;
            if (nextDay > maxDaysInMonth) {
                nextDay = 1;
                nextMonth++;
                if (nextMonth > 12) {
                    nextMonth = 1;
                    nextYear++;
                }
            }
            System.out.println("Ngày tháng năm tiếp theo: " + nextDay + "-" + nextMonth + "-" + nextYear);

            // Tính ngày trước đó
            int prevDay = day - 1;
            int prevMonth = month;
            int prevYear = year;
            if (prevDay < 1) {
                prevMonth--;
                if (prevMonth < 1) {
                    prevMonth = 12;
                    prevYear--;
                }
            }
            System.out.println("Ngày tháng năm trước đó: " + prevDay + "-" + prevMonth + "-" + prevYear);
        }


    }

}
