package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatingMain2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("formattedDateTime = " + formattedDateTime);
        System.out.println(now);


        String dateTimeString = "2030-01-01 11:30:00";
        LocalDateTime parsed = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("parsed = " + parsed);


    }
}
