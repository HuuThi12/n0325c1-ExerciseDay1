package ss5_loop2;

import java.util.Scanner;

/**
 * Bài 6: Chuyển đổi một số nguyên thành hệ nhị phân
 */

public class ExercisSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên dương : ");
        int n = sc.nextInt();

        String binary = "";
        while (n > 0) {
            // Lấy phần dư khi chia cho 2 và thêm vào chuỗi nhị phân
            binary = n % 2 + binary;
            n = n / 2;
        }
        System.out.println("Số nhị phân là: " + binary);
    }
}
