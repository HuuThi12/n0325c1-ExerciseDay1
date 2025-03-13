package ss5_loop2;

import java.util.Scanner;

/**
 * Bài 10: Tìm các số thỏa mãn điều kiện
 */

public class Exercis11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào giá tiền của món đồ :");
        int priceItem = sc.nextInt();

        System.out.print("Nhập vào số tiền khách hàng trả :");
        int moneyCustomer = sc.nextInt();

        int moneyRefund = moneyCustomer - priceItem;
        int denomination; // mạnh giá tiền (1000,2000 ...)

        if (moneyCustomer < priceItem) {
            System.out.println("Số tiền bạn trả không đủ để mua hàng");
        }

        for (int i = 2; i >= 0; i--) {
            int coefficient = (int) Math.pow(10, i); // các mệnh giá 500.000, 50.000, 5.000

            denomination = 5000 * coefficient;
            if (moneyRefund >= denomination) {
                System.out.printf("%d tờ %d\n", moneyRefund / denomination, denomination);
                moneyRefund %= denomination; // cập nhật số tiền còn lại sau khi thối mệnh giá này
            }

            denomination = 2000 * coefficient;
            if (moneyRefund >= denomination) {
                System.out.printf("%d tờ %d\n", moneyRefund / denomination, denomination);
                moneyRefund %= denomination; // cập nhật số tiền còn lại sau khi thối mệnh giá này
            }

            denomination = 1000 * coefficient;
            if (moneyRefund >= denomination) {
                System.out.printf("%d tờ %d\n", moneyRefund / denomination, denomination);
                moneyRefund %= denomination; // cập nhật số tiền còn lại sau khi thối mệnh giá này
            }
        }
        System.out.println("Số tiền còn lại là :" + moneyRefund);
    }
}
