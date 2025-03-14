package ss7_string;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // b1: Nhập vào số lượng phần tử
        int[] a = {10, 20, 30};

        changDate(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

    }

    static void changDate(int[] arr) {
        arr[1] = 99; // update a
        arr = new int[]{9, 9, 9}; // khởi tạo 1 đối tượng arr sẽ có địa chỉ khác với a ở trên
        arr[1] = 100; // update arr
    }

}
