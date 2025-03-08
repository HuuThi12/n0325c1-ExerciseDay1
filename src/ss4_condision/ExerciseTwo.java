package ss4_condision;

import java.util.Scanner;

// Bài 2: dịch số thành tiếng anh

public class ExerciseTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số tự nhiên từ 1 đến 10 : ");
        double n = sc.nextDouble();

        if (n == 1) {
            System.out.println("One");
        } else if (n == 2) {
            System.out.println("Two");
        } else if (n == 3) {
            System.out.println("Three");
        } else if (n == 4) {
            System.out.println("Four");
        } else if (n == 5) {
            System.out.println("Five");
        } else if (n == 6) {
            System.out.println("Six");
        } else if (n == 7) {
            System.out.println("Seven");
        } else if (n == 8) {
            System.out.println("Eight");
        } else if (n == 9) {
            System.out.println("nine");
        } else {
            System.out.println("ten");
        }


        // Cách 2
//      int day = 3;
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


    }

}
