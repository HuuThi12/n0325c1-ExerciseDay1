package Module1;

public class Exercise3a {
    public static void main(String[] args) {

        String input = "abcdEF";

        input = "accdef";

        int countUpperCase = calCountUpperCase(input);

        if (countUpperCase > 0){
            System.out.println("Số lượng ký tự viết hoa: "+countUpperCase);
        }else {
            System.out.println("Chuỗi không chứa ký tự in hoa");
        }
    }

    public static int calCountUpperCase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count++;
            }
        }
        return count;
    }
}
