package ss2_practice;

public class Casting {
    public static void main(String[] args) {
        // ngầm định: Việc chuyển đổi sẽ tự thực hiển bởi compiler
        byte b = 10;
        short s =b;

        // Tường minh: Việc chuyển đổi phải có sự can thiệp từ lập trình viên
        int c = 1000;
        byte h = (byte) c;
        System.out.println(h); // h = 24
    }
}
