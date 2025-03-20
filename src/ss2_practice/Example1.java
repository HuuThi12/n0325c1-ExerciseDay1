package ss2_practice;

public class Example1 {
    public static void main(String[] args) {
//        String str1 = "Lê Hữu Thi";
//        String str2 = "Lê Hữu Thi";
//        String str3 = new String("Lê Hữu Thi");

        String str1 = "Hello world";
        String str2 = "Hello";
        String str3 = ("Hello world");
        String str4 = new String("Hello world");
        String str5 = new String("Hello world");

        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true

        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3)); // true


    }
}
