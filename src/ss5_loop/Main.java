package ss5_loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.print(i+"    ");
        }
    }
}

