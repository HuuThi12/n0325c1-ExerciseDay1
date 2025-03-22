package ss9_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeStudy {
    public static void main(String[] args) {

        // chuyển từ kiểu Local Date Time => String
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String strDate = LocalDate.now().format(dateTimeFormatter);
        System.out.println(strDate);
//        System.out.println(localDate.getMonth());
//        System.out.println(localDate.getDayOfMonth());


        // chuyển từ kiểu String => Local Date Time
//        String strDate = "22/03/2025";
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate localDate = LocalDate.parse(strDate, dateTimeFormatter);
//        System.out.println(localDate.getYear());
//        System.out.println(localDate.getMonth());
//        System.out.println(localDate.getDayOfMonth());

//        LocalDate currentDate = LocalDate.now();
//        LocalDate localDate = currentDate.plusYears(10);
//        LocalDate localDate1 = currentDate.plusMonths(5);
//        LocalDate localDate2 = currentDate.plusDays(4);
//        LocalDate localDate3 = currentDate.withYear(2021);
//
//        System.out.println(localDate3.isAfter(currentDate));
//        System.out.println(localDate3.isBefore(currentDate));

//        System.out.println(localDate);
//        System.out.println(localDate1);
//        System.out.println(localDate2);
//        System.out.println(localDate3);
//        System.out.println(currentDate.getYear());
//        System.out.println(currentDate.getMonth());
//        System.out.println(currentDate.getDayOfWeek());
//        System.out.println(currentDate.getDayOfMonth());


//        LocalDate localDate = LocalDate.now();
//        LocalTime localTime = LocalTime.now();
//        LocalDateTime localDateTime = LocalDateTime.now();
//
//        System.out.println(localDate);
//        System.out.println(localTime);
//        System.out.println(localDateTime);
    }
}
