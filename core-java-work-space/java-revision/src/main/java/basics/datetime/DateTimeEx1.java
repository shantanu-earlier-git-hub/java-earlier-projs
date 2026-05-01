package basics.datetime;


import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class DateTimeEx1 {


    public void printNext4Weeks(int begin, int end) {

        var rangeList = LongStream.range(begin, end).boxed().toList();

        List<LocalDate> localDateList = new ArrayList<>();

        for (Number index : rangeList) {
            localDateList.add(LocalDate.now().plusWeeks(index.longValue()));
        }
        localDateList.stream().forEach(System.out::println);
    }

    public void zoneIdAndOffSet() {
        List<String> zoneList = ZoneId.getAvailableZoneIds().stream().sorted((o1, o2) -> o1.compareTo(o2)).toList();
        zoneList.stream()
                .forEach(zoneId -> {
                    ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of(zoneId));
                    ZoneOffset zoneOffset = zonedDateTime.getOffset();
                    //System.out.println(zoneOffset.getRules());
                    int secondsOfHour = zoneOffset.getTotalSeconds() % 3600;
                });
    }

}
