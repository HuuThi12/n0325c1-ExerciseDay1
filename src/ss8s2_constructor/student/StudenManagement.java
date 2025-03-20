package ss8s2_constructor.student;

public class StudenManagement {
    public static void main(String[] args) {
        Student student1 = new Student(12,"Lê Hữu Thi",9.2);


        System.out.println("Thông tin ban đầu: ");
        System.out.println("ID: "+student1.getId());
        System.out.println("Tên: "+student1.getName());
        System.out.println("Điểm: "+student1.getScore());

        // cập nhật
        student1.setName("Nguyễn trịnh bảo ngọc");
        student1.setScore(10);

        System.out.println();
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println("ID: "+student1.getId());
        System.out.println("Tên: "+student1.getName());
        System.out.println("Điểm: "+student1.getScore());

        // cập nhật thông tin không hợp lệ
        System.out.println();
        student1.setName("");
        student1.setScore(15);
    }
}
