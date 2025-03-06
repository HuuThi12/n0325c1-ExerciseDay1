package ss3_java_overview;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {

        int i = 1, j = 1;
        int a = 0;

        // câu a
//        a = i++ + j++;
//        System.out.println(a);

        // câu b
//        a = i++ + ++j;
//        System.out.println(a);

        // câu c
//        a = ++i + j++;
//        System.out.println(a);

        // câu d
//        a = ++i + ++j;
//        System.out.println(a);

        // câu e
//        a = i++ + ++j + i++ + j++;
//        System.out.println(a);

        // câu f
//        a = ++i + ++j + i++ + j++;
//        System.out.println(a);

        // câu g
//        a = i++ + ++i - i-- - --i;
//        i++ i = 1;
//        + ++i i = 4;
//        System.out.println(a);

        // câu h
        a = 10;
        a += a++ + ++a;
//        10 += 10 + 12;
        System.out.println(a);


    }
}
