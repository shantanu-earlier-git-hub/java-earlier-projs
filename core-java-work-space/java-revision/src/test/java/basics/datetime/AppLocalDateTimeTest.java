package basics.datetime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppLocalDateTimeTest {

    AppLocalDateTime appLocalDateTime;

    @BeforeEach
    void setUp() {
        appLocalDateTime = new AppLocalDateTime();
    }

    @Test
    void getMyLocalDate() {

        Assertions.assertThat(appLocalDateTime.getMyLocalDate()).isEqualTo(LocalDate.now());

        assertEquals(LocalDate.of(2012, 11, 12), appLocalDateTime.getMyLocalDate(),
                "local dates are equal !!");
    }

    @Test
    void localDateUsingMonth() {
        LocalDate localDate = LocalDate.of(2012, Month.NOVEMBER, 12);
        assertEquals(localDate, appLocalDateTime.localDateUsingMonth(), "local date using Month matches !!");
    }

    @Test
    void getMyLocalTime() {
        LocalTime localTime = LocalTime.of(12, 05, 06);
        assertEquals(localTime, appLocalDateTime.getMyLocalTime(), "local time matches !!");
    }

    @Test
    void localTimeUsingNanoSecond() {
        LocalTime localTime = LocalTime.of(12, 05, 06, 100);
        assertEquals(localTime, appLocalDateTime.localDateTimeUsingMonthAndNano(), "local time using nano matches !! ");
    }

    @Test
    void getMyLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.of(2023, 01, 15, 10, 04, 05);
        assertEquals(localDateTime, appLocalDateTime.getMyLocalDateTime(), "local datetime matches !! ");
    }

    @Test
    void localDateTimeUsingMonthAndNano() {
    }

    @Test
    void localDateTimeUsingLocalDateAndTime() {
    }


    @Test
    void localDateTime_minus_day_hour_min() {

    }

    @Test
    void setMyLocalDateUsingString() {
    }

    @Test
    void setMyLocalTimeString() {
    }

    @Test
    void setLocalDateByYearMonthDate() {
    }


}