package ss8_oop.khoang_cach_management;

public class DistanceCalculator {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point();

        System.out.println("Nhập tọa độ của điểm thứ nhất: ");
        point1.input();

        System.out.println("Nhập tọa độ của điểm thứ hai: ");
        point2.input();

        double result = point1.distanceTo(point2);
        System.out.print("Khoảng cách của 2 tạo độ là: "+result);

    }
}
