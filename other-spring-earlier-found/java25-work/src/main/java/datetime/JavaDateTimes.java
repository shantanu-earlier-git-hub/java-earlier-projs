package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.stream.Stream;

public class JavaDateTimes {


    static void main() {

        var myLocalDate = LocalDate.now();
        var myLocalTime = LocalTime.now();

//        var myLocalDateTime = LocalDateTime.of(myLocalDate, myLocalTime);

        var myLocalDateTime = LocalDateTime.now();


        Stream.of(myLocalDateTime)
                .forEach(IO::println);

    }


}
