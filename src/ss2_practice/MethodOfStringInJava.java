package ss2_practice;

public class MethodOfStringInJava {
    public static void main(String[] args) {

        // equals() /equalsIgnoreCase(): Kiểm tra 2 chuỗi có giống nhau hay không
        System.out.println("Hello".equals("hello")); // false
        System.out.println("Hello".equalsIgnoreCase("heLLo")); // true

        // length(): Trả về chiều dài của chuỗi
        System.out.println("Hello".length());

        // concat(): Nối hai chuỗi thành chuỗi mới (Giống với +)
        System.out.println("Hello".concat("World")); // Hello World
        System.out.println("Hello" + "World"); // Hello World

        // charAt(int index): Trả về ký tự tại vị trí index trong chuỗi
        char c = "Hello".charAt(2); // 'l'

        // replace() /replaceALl(): Thay thế
        System.out.println("Hello".replace("l","t")); // hetto

        // Substring(): trích xuất chuỗi con
        // toLowerCase() /toUpperCase(): Thường/Hoa
        // trim(): Ngắt bỏ khoảng trắng ở đầu và cuối chuỗi

        // split(String regax):
        String str = "apple,banana,cherry";
        String[] fruits = str.split(",");  // fruits = ["apple", "banana", "cherry"]

//        contains(CharSequence sequence)
//        Kiểm tra xem chuỗi hiện tại có chứa chuỗi con sequence không.
        str = "Hello";
        boolean contains = str.contains("ell");  // contains = true

//        indexOf(int ch)
//        Trả về chỉ mục (index) của ký tự đầu tiên ch trong chuỗi.
         str = "Hello";
        int index = str.indexOf('e');  // index = 1
//        lastIndexOf(int ch): Trả về chỉ mục của ký tự cuối cùng ch trong chuỗi.
        str = "Hello";
        index = str.lastIndexOf('l');  // index = 3

//        toCharArray(): Chuyển đổi chuỗi thành một mảng các ký tự (char[]).
        str = "Hello";
        char[] chars = str.toCharArray();  // chars = ['H', 'e', 'l', 'l', 'o']

//        valueOf(int i): Chuyển đổi giá trị của kiểu dữ liệu khác thành chuỗi (ví dụ: int thành String).
        int num = 100;
        str = String.valueOf(num);  // str = "100"

//        isEmpty(): Kiểm tra xem chuỗi có rỗng hay không.
        str = "";
        boolean isEmpty = str.isEmpty();  // isEmpty = true

    }
}
