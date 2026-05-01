package basics.datetime;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@Data
public class AppLocalDateTime {

    private LocalDate myLocalDate;

    private LocalTime myLocalTime;

    private LocalDateTime myLocalDateTime;

    public LocalDate getMyLocalDate() {
        return this.myLocalDate =
                LocalDate.of(2012, 11, 12);
    }

    public LocalDate localDateUsingMonth() {
        return this.myLocalDate = LocalDate.of(2012, Month.NOVEMBER, 12);
    }

    public LocalTime getMyLocalTime() {
        return this.myLocalTime = LocalTime.of(12, 05, 06);
    }

    public LocalTime localTimeUsingNanoSecond() {
        return this.myLocalTime = LocalTime.of(12, 05, 06, 100);
    }

    public LocalDateTime getMyLocalDateTime() {
        return this.myLocalDateTime = LocalDateTime.of(2023, 01, 15, 10, 04, 05);
    }

    public LocalDateTime localDateTimeUsingMonthAndNano() {
        return this.myLocalDateTime = LocalDateTime.of(2023, Month.JANUARY, 15, 10, 04, 05, 10);
    }

    public LocalDateTime localDateTimeUsingLocalDateAndTime() {
        return this.myLocalDateTime = LocalDateTime.of(getMyLocalDate(), getMyLocalTime());
    }

    public LocalDateTime localDateTime_minus_day_hour_min() {
        return this.myLocalDateTime = LocalDateTime.of(getMyLocalDate(), getMyLocalTime())
                .minusDays(1).minusHours(2).minusMinutes(3);
    }


    public void setMyLocalDateUsingString(String localDateString) {
        this.setMyLocalDate(LocalDate.from(DateTimeFormatter.ISO_DATE.parse(localDateString)));
    }

    public void setMyLocalTimeString(String localTimeString) {
        this.setMyLocalTime(LocalTime.from(DateTimeFormatter.ISO_TIME.parse(localTimeString)));
    }

    public void setLocalDateByYearMonthDate(int year, int month, int day) {
        this.setMyLocalDate(LocalDate.of(year, month, day));
    }


}
