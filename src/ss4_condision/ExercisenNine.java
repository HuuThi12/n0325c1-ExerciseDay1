package ss4_condision;


// Bài 9 : Đôi chữ hoa thành chữ thường và ngược lại

import java.util.Scanner;

public class ExercisenNine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào 1 ký tự chữ cái: ");
        char characterChar = sc.next().charAt(0);

        // Kiểm tra ký tự
        if (Character.isLowerCase(characterChar)) {
            // Nếu là chữ thường, chuyển thành chữ hoa
            char upperChar = (char) (characterChar - 32);
            System.out.println("Chữ hoa là: " + upperChar);
        } else {
            // Nếu là chữ hoa, chuyển thành chữ thường
            char lowerChar = (char) (characterChar + 32);
            System.out.println("Chữ thường là: " + lowerChar);
        }


    }

}
