package basics.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class AppZonedDateTimes {


    public static void main(String[] args) {

//        ZonedDateTime zdt = ZonedDateTime
//                    .of(LocalDateTime.of(2023, 11, 5,1,0,0),
//                            ZoneId.of("GMT"));
//

        ZonedDateTime zdt = ZonedDateTime
                .of(LocalDateTime.of(2023, 11, 5, 1, 0, 0),
                        ZoneId.systemDefault());


        var rfc1123Datetime = DateTimeFormatter.RFC_1123_DATE_TIME.format(zdt);
        var isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zdt);
        var isoOffSetDate = DateTimeFormatter.ISO_OFFSET_DATE.format(zdt);
        var isoLocalDate = DateTimeFormatter.ISO_LOCAL_DATE.format(zdt);
        var isoBasicDate = DateTimeFormatter.BASIC_ISO_DATE.format(zdt);
        var isoDate = DateTimeFormatter.ISO_DATE.format(zdt);


        System.out.println("rfc1123Datetime ->  " + rfc1123Datetime);
        System.out.println("isoLocalDateTime ->  " + isoLocalDateTime);
        System.out.println("isoOffSetDate   ->  " + isoOffSetDate);
        System.out.println("isoLocalDate    -> " + isoLocalDate);
        System.out.println("isoBasicDate  -> " + isoBasicDate);
        System.out.println("isoDate  ->  " + isoDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.US);

        System.out.println("localDateTime ->  " +
                LocalDate.from(dateTimeFormatter.parse(isoLocalDate)).atStartOfDay());

        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        System.out.println("offsetDateTime ->" + offsetDateTime.toLocalDate());


    }
}
