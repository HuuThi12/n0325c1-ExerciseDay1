package ss6_method;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    }

    public String xepLoai(double score) {
        if (score < 0 || score > 10) {
            return "Diểm không hợp lệ";
        }
        if (score < 5) {
            return "Yếu";
        }
        if (score < 7) {
            return "khá";
        }
        if (score < 8.5) {
            return "giỏi";
        }
        return "Xuất sắc";
    }
}
