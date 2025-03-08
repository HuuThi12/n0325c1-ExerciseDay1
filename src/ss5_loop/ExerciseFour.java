package ss5_loop;

import java.util.Scanner;

// Bài 5: In dãy số chẵn từ 2 đến 2n với giá trị dương, âm xen kẽ mỗi 3 số

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i += 2) {
            if (i % 6 == 0) {
                System.out.printf("-%-4d", i);
            } else {
                System.out.printf("%-4d", i);
            }

        }

        // Cách 2
//        int distance = 3;
//        int count = 0;
//        count ++;
//
//        if(count % 3 == 0){
//            System.out.println(count);
//        }


    }
}
