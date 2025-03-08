package ss4_condision;


// Bài 3: Đảo giá trị của 2 biến

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá trị của a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập giá trị của b: ");
        double b = sc.nextDouble();

        double temp = a;
        a = b;
        b = temp;

        System.out.println("giá trị của a là: "+a);
        System.out.println("giá trị của b là: "+b);

    }

}
