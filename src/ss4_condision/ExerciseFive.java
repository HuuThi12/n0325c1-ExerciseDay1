package ss4_condision;


// Bài 5: Giải phương trình bậc 1

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá trị của a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập giá trị của b: ");
        double b = sc.nextDouble();

        // ax + b = 0
        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình vô số nghiệm ");
            }else{
                System.out.println("Phương trình vô nghiệm ");
            }
        }else {
            System.out.println("Nghiệm của phương trình là :" +-b/a);
        }
    }

}
