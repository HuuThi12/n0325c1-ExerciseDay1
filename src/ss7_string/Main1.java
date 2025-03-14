package ss7_string;

import java.util.Scanner;

public class Main1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // b1: Nhập vào số lượng phần tử

        int n;
        do {
            System.out.print("Nhập vào số lượng phần tử của mảng: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Số lượng phần tử trong mảng phải >0. Xin vui lòng kiểm tra lại");
            }
        } while (n < 0);

        // b2: Tạo ra mảng có n phần tử
        int[] arr = new int[n]; // [0, 0, 0, 0, 0]

        // b3: Nhập mảng
        inputArr(arr);


        // b4: Xuất mảng
        outputArr(arr);

        if (checkArr(arr)) {
            System.out.println("\nMảng toàn chẵn");
        } else {
            System.out.println("\nKhông phải là mảng toàn chẵn");
        }

        System.out.println("Tổng của các số dương lẻ là: " + total(arr));

        resarchArr(arr);

    }

    public static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào phần tử của mảng arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }
    }

    public static void outputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + "\t");
        }
    }


    public static boolean checkArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static int total(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void resarchArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr.length ) {
                System.out.println("Phần tử x trong mảng: " + i);
            }
        }
    }
}
