package ss6_method;

import java.util.Scanner;

public class Exercise1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 ký tự: ");
        char ch = sc.next().charAt(0);
        System.out.println(toLowerCase(ch));

    }

    public static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            c += 32;
        } else if (c >= 'a' && c <= 'z') {
            c -= 32;
        }
        return c;
    }
}
