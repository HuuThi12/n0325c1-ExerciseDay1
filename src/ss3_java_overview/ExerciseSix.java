package ss3_java_overview;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số xe của bạn (tối đa 5 chữ số): ");
        int carNumber = sc.nextInt();

        int sum = 0;

        if (carNumber <= 0 || carNumber >= 99999) {
            System.out.println("Số xe bạn vừa nhập không hợp lệ! vui lòng nhập số từ 0 đến 99999");
        } else {
            int temp = carNumber;
            while (temp > 0) {
                sum += temp % 10;
                temp = temp / 10; // bỏ chữ số cuối
            }
        }

        int nut = sum % 10;
        System.out.println("Số nút của xe là: " + nut);


    }
}
