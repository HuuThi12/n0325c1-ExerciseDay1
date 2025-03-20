package ss2_practice;

public class PracticeDebug {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("Line 9: a = " + a);
        System.out.println("Line 10: a = " + b);
        int c = method1(a, b);

        for (int i = 1; i <= 100; i++) {
            System.out.println("Vòng lặp thứ " + i);
        }
    }

    private static int method1(int a, int b) {
        System.out.println("đi vào phương thức method 1");
        return a+b;

    }
}
