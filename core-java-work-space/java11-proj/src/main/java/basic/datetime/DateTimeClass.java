package basic.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeClass {

    public static void main(String[] args) {

        LocalDate date1= LocalDate.now();
        LocalDateTime datetime= LocalDateTime.now();

        System.out.println("date1 = " + date1);
        System.out.println("datetime = " + datetime);

        LocalDate birthDay = LocalDate.of(1970, Month.JULY, 1);
        System.out.println("birthDay = " + birthDay);
    }
}
