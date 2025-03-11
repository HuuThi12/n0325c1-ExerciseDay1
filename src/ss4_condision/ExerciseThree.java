package ss4_condision;


// Bài 3: Đảo giá trị của 2 biến

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá trị của a: ");
        int a = sc.nextInt();

        System.out.print("Nhập giá trị của b: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        int c = 3;
        int d = 4;

        // cach 2
        c = c + d;
        d = c - d;
        c = c - d;


        System.out.println("giá trị của a là: " + a);
        System.out.println("giá trị của b là: " + b);

        System.out.println("giá trị của a là: " + c);
        System.out.println("giá trị của b là: " + d);

    }

}
