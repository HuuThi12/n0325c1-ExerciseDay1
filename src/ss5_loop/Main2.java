package ss5_loop;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // hinh b
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        // hinh c
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // tất cả những bài cần kiểm tra nhập đầu vào thì luôn dùng do while
        // do-while
        int month;
        boolean isValidMonth;
        do {
            System.out.println("Nhap thang (1-12)");
            month = sc.nextInt();
            isValidMonth = month < 0 || month > 12;
            if (isValidMonth) {
                System.out.println("Gia tri ban vua nhap khong hop le! xin vui long nhap gia tri [1:12]");
            }
        }while (isValidMonth);
    }
}