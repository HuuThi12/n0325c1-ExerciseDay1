package ss5_loop;

import java.util.Scanner;

// Bài 1: In dãy số chẵn từ 2 đến n với giá trị dương, âm xen kẽ

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i += 2) {
           if(i % 4 == 0 ){
               System.out.printf("-%-4d",i);
           }else{
               System.out.printf("%-4d",i);
           }

        }


    }
}
