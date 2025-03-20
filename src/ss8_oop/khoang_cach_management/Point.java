package ss8_oop.khoang_cach_management;

import java.util.Scanner;

public class Point {
    Scanner scanner = new Scanner(System.in);
    private double x;
    private double y;

    void input() {
        System.out.print("Nhập tọa độ x: ");
        x = scanner.nextDouble();

        System.out.print("Nhập tọa độ y: ");
        y = scanner.nextDouble();
    }

    double distanceTo(Point other) {
        double dx = other.x - this.x;
        double dy = other.y - this.y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance;
    }

}
