package ss5_loop2;

import java.util.Scanner;

/**
 * Bài 10: Tìm các số thỏa mãn điều kiện
 */

public class Exercis10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int number = 10; number <= 99; number++) {
            int tensDigit = number / 10; // chữ số hàng chục
            int onesDigit = number % 10; // chữ số hàng đơn vị


            // Bước 3: Tính tổng và tích của hai chữ số
            int sum = tensDigit + onesDigit;
            int product = tensDigit * onesDigit;

            // Bước 4: Kiểm tra điều kiện nếu tích bằng 2 lần tổng in ra số đó
            if (product == 2 * sum) {
                System.out.println(number);
            }
        }
    }
}
