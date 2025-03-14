package ss7_string;

public class Main {
    public static void main(String[] args) {
        String name1 = "Lê Hữu Thi";
        String name2 = "Lê Hữu Thi";
        String name3 = new String("Lê Hữu Thi");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        System.out.println(name1 == name3);
        System.out.println(name1.equals(name3));

    }
}
