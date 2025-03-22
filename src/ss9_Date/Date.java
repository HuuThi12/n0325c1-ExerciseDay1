package ss9_Date;

import java.text.SimpleDateFormat;

public class Date {
    public static void main(String[] args) {

        // Chuyển từ kiểu dữ liệu Date sang String
        // HH:mm:ss : giờ phút giây
        // EEEE: thứ trong tuần
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy  HH:mm:ss EEEE");
        System.out.println(simpleDateFormat.format(new java.util.Date()));

        // Chuyển từ kiểu dữ liệu Date sang String
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd//MM//yyyy");
//        Date date = new parse(strDate);
//        System.out.println(date);
        /**
         * Chuyển từ kiểu dữ liệu String sang Date
         * String strDate = "22/03/2025"; // dd//MM//yyyy
         * SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd//MM//yyyy");
         * Date date = new parse(strDate);
         * System.out.println(date);
         */

    }

    private static class parse extends java.util.Date {
        public parse(String strDate) {
        }
    }
}
