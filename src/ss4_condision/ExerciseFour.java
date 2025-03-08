package ss4_condision;

// Bài 4: Tìm số lớn nhất và số nhỏ nhất

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị của a: ");
        int a = sc.nextInt();

        System.out.print("Nhập giá trị của b: ");
        int b = sc.nextInt();

        // Cách 1
        int max = 0;

        if (a > b) {
            max = a;
        }else{
            max = b;
        }

        System.out.println("Max : "+max);

        // Cách 2
        int max2 = a > b ? a : b;
        System.out.println("Max2 : "+max2 );

    }

}
