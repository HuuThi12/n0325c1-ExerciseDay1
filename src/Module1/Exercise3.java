package Module1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        String input = "abcdEF";
        System.out.println(exercise3(input));

        input = "accdef";
        System.out.println(exercise3(input));
    }

    public static String exercise3(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        if (count > 0) {
            return String.valueOf(count);
        } else {
            return "Chuỗi không chứa ký tự in hoa";
        }
    }
}
