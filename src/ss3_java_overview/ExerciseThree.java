package ss3_java_overview;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        String nameProduct = sc.nextLine();

        System.out.print("Nhập số lượng: ");
        int quantity = sc.nextInt();

        System.out.print("Nhập đơn giá: ");
        double unitPrice = sc.nextDouble();

        int sumMoneyProduct = quantity * (int) unitPrice;

        int taxMoney = (int)(sumMoneyProduct * 0.1);

        System.out.println("Tên sản phẩm : " + nameProduct);
        System.out.println("Tổng tiền: " + sumMoneyProduct );
        System.out.println("Thuế VAT: " + taxMoney );

    }
}
