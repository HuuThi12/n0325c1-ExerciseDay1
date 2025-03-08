package ss4_condision;

// Bài 1: tính giá trị của biến boolean

public class ExerciseOne {
    public static void main(String[] args) {

        boolean a = true && false;

        boolean b = (3 > 100) || (25 % 5 == 0);

        boolean c = a && b;

        boolean d = !a || b;

        System.out.println("giá trị của c là: "+c);
        System.out.println("giá trị của d là: "+d);


    }

}
