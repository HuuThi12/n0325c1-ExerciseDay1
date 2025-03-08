package ss4_condision;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Nhập vào số tự nhiên n từ 1 đến 10: ");
//        double n = sc.nextDouble();
//
//        if (n == 1) {
//            System.out.println("One");
//        } else if (n == 2) {
//            System.out.println("Two");
//        } else if (n == 3) {
//            System.out.println("Three");
//        } else if (n == 4) {
//            System.out.println("Four");
//        } else if (n == 5) {
//            System.out.println("Five");
//        } else if (n == 6) {
//            System.out.println("Six");
//        } else if (n == 7) {
//            System.out.println("Seven");
//        } else if (n == 8) {
//            System.out.println("Eight");
//        } else if (n == 9) {
//            System.out.println("nine");
//        } else {
//            System.out.println("ten");
//        }


//        int day = 3;
//        switch (day) {
//            case 1 -> System.out.println("Chủ nhật");
//            case 2 -> System.out.println("Thứ 2");
//            case 3 -> System.out.println("Thứ 3");
//            case 4 -> System.out.println("Thứ 4");
//            case 5 -> System.out.println("Thứ 5");
//            case 6 -> System.out.println("Thứ 6");
//            case 7 -> System.out.println("Thứ 7");
//            default -> System.out.println("Nhập sai giá trị");
//        }


        int a = 2;
        int b = 3;

        int max = a > b ? a : b;
        int min = a < b ? a : b;
        System.out.println("Max : "+ max);
        System.out.println("Min : "+ min);

        int min2 = Math.min(7, 9);
        System.out.println("Min : "+min2);


    }
}
