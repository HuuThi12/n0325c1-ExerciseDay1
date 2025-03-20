package Module1;

import java.util.Scanner;

/**
 * Câu 2: Nhập từ bàn phím mảng số nguyên gồm n phần tử (n<=20). Hiển thị ra màn hình
 * hiệu của Tổng các số chẵn và Tổng các số lẻ có trong mảng.
 */

public class Exercise2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử n (<= 20): ");
        int n = scanner.nextInt();

        if (n > 20) {
            System.out.println("Số lượng phần tử không được > 20. Xin vui lòng kiếm tra lại");
            return;
        }

        int[] arr = new int[n];
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào phần tử của mảng arr[%d]: ", i);
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sum1 += arr[i];
            } else {
                sum2 += arr[i];
            }
        }

        int result = sum1 - sum2;
        System.out.println("Hiệu của tổng là: " + result);
    }
}
