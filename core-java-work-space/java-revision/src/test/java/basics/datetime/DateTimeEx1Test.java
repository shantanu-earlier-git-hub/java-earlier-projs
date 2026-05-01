package basics.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

class DateTimeEx1Test {


    DateTimeEx1 ex1 = new DateTimeEx1();


    //@Test
    public void checkMethods() {

        // instance.now from 1 Jan 1970 -> epoch
        // min - very long history time
        // max - very long future time
        // instance used for machine date time calculations , not for human understandable date time like month, year
        // day etc...

        Instant instant1 = Instant.now().plus(1, ChronoUnit.HOURS);

        Instant instant2 = Instant.now().plus(2, ChronoUnit.HOURS);
        Duration duration = Duration.between(instant1, instant2);

        System.out.println("duration 1 hour = " + duration.getSeconds());

        System.out.println("seconds from epoch( 1-Jan-1970) = " + Instant.ofEpochSecond(0l).until(Instant.now(), ChronoUnit.SECONDS));

        System.out.println("epoch" + Instant.EPOCH);

        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());

        System.out.println("zone time -local date time from instance-> " + ldt);

        System.out.printf("%s %d %d at %d:%d%n", ldt.getMonth(), ldt.getDayOfMonth(),
                ldt.getYear(), ldt.getHour(), ldt.getMinute());

        LocalDate today = LocalDate.now();
        LocalDate payday = today.with(TemporalAdjusters.lastDayOfMonth()).minusDays(2);

        System.out.println("payday = " + payday);

        LocalDate birthDay = LocalDate.of(2007, Month.MAY, 14);
        LocalDate nextYear = birthDay.plusYears(1);

        System.out.println("nextYear = " + nextYear);
    }


    //@Test
    void printnext4weeks() {
        ex1.printNext4Weeks(0, 4);
    }

    //@Test
    void zoneIdAndOffSet() {
        ex1.zoneIdAndOffSet();
    }


    //@Test
    void formatDate() {


        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/dd/mm");
            String dateStr = "2023/23/12";

            System.out.println("sdf.parse(dateStr) = " + sdf.parse(dateStr));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }

    //@Test
    void usingAdjusters() {

        LocalDate date = LocalDate.of(2023, 11, 3);
        System.out.println("last day of month  = " + date.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println("first day of next Month  = " + date.with(TemporalAdjusters.firstDayOfNextMonth()));

    }

    //@Test
    void usingFormatter() {

        var localdate = LocalDate.of(2023, 12, 23);

        var zonedDateTime = LocalDate.of(2023, 12, 26)
                .atStartOfDay(ZoneId.of("UTC+5"));

        var isoOffsetDateStr = DateTimeFormatter.ISO_OFFSET_DATE.format(zonedDateTime);
        var localDateStr = DateTimeFormatter.ISO_LOCAL_DATE.format(localdate);
        var iso1123Datetime = DateTimeFormatter.RFC_1123_DATE_TIME.format(zonedDateTime);
        var localDateStrPlus3 = LocalDate.from(DateTimeFormatter.ISO_LOCAL_DATE.parse("2023-12-23"))
                .plusDays(3);

        System.out.println("ISO local Date  = " + localDateStr);
        System.out.println("ISO Offset Date = " + isoOffsetDateStr);
        System.out.println("iso 1123 Date time = " + iso1123Datetime);
        System.out.println("ISO local Date + 3 days = " + localDateStrPlus3);
    }


    //@Test
    void other_various_format_styles() {

        LocalDate localDate = LocalDate.of(2023, 12, 23);

        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(localDate));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(localDate));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(localDate));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(localDate));


        LocalTime time = LocalTime.of(10, 00, 00);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, time, ZoneId.of("US/Eastern"));

        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(zonedDateTime));


    }


    //@Test
    void allAvailableZoneIds() {
        ZoneOffset.getAvailableZoneIds()
                .stream().sorted((first, sec) -> first.compareTo(sec))
                .forEach(System.out::println);

    }

    //@Test
    void simpleDateFormats() {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("date = " + LocalDate.from(dateTimeFormatter.parse("01.12.2023")));

    }

    //@Test
    void different_time_formats() {

        String _24hrFormat = "HH:mm:ss";
        String _12hrFormatAMPM = "hh:mm:ss a";
        String _12hrFormatAMPMMili = "hh:mm:ss a SSS";

        DateTimeFormatter dateTimeFormatter = null;
        LocalTime localTime = null;

        // 24 hr
        dateTimeFormatter = DateTimeFormatter.ofPattern(_24hrFormat);
        localTime = LocalTime.now();
        System.out.println("24 hr clock format -> " + localTime.format(dateTimeFormatter));

        //12 hr AM PM
        dateTimeFormatter = DateTimeFormatter.ofPattern(_12hrFormatAMPM);
        localTime = LocalTime.now();
        System.out.println("12 hr clock format AMPM->  " + localTime.format(dateTimeFormatter));

        //12 hr AM PM milli
        dateTimeFormatter = DateTimeFormatter.ofPattern(_12hrFormatAMPMMili);
        localTime = LocalTime.now().plus(300, ChronoUnit.MILLIS);
        System.out.println("12 hr clock format AMPM plus Milli->  " + localTime.format(dateTimeFormatter));


        dateTimeFormatter = DateTimeFormatter.ofPattern(_12hrFormatAMPM);

        System.out.println("is Before Noon check  = " +
                LocalTime.from(dateTimeFormatter.parse("11:30:00 AM")).isBefore(LocalTime.NOON)
        );

        System.out.println("is before Midnight  = " +
                LocalTime.from(dateTimeFormatter.parse("11:30:00 AM")).isBefore(LocalTime.MIDNIGHT)
        );
    }

    //@Test
    void java_util_date() {
        Date date = new Date();
        System.out.println("date = " + date);
    }


}