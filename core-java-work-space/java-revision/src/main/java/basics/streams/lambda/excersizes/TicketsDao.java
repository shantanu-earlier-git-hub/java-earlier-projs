package basics.streams.lambda.excersizes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.IntStream;

public class TicketsDao {

    public List<Tickets> getTicketsList() {

        int[] yearRange = IntStream.range(2020, 2024).toArray();
        int[] monthRange = IntStream.range(1, 13).toArray();
        int[] dateRange = IntStream.range(0, 32).toArray();

        int[] hrRange = IntStream.range(0, 24).toArray();
        int[] minRange = IntStream.range(0, 61).toArray();
        int[] secRange = IntStream.range(0, 61).toArray();


        List<LocalDate> localDateList =
                List.of(
                        LocalDate.of(yearRange[0], monthRange[4], dateRange[20]),
                        LocalDate.of(yearRange[2], monthRange[10], dateRange[12]),
                        LocalDate.of(yearRange[1], monthRange[8], dateRange[15])
                );

        List<LocalTime> localTimeList = List.of(
                LocalTime.of(hrRange[4], minRange[51], secRange[20]),
                LocalTime.of(hrRange[10], minRange[24], secRange[50]),
                LocalTime.of(hrRange[12], minRange[13], secRange[36])
        );

        LocalDateTime localDateTime1 = LocalDateTime.of(localDateList.get(0), localTimeList.get(0));
        LocalDateTime localDateTime2 = LocalDateTime.of(localDateList.get(1), localTimeList.get(1));
        LocalDateTime localDateTime3 = LocalDateTime.of(localDateList.get(2), localTimeList.get(2));


        Tickets ticket1 = Tickets
                .builder().id(100).departureFrom("MUM")
                .destination("AMS").travelDate(localDateTime1)
                .clients(List.of(
                        new ClientDao().clientByClientId(100).get(),
                        new ClientDao().clientByClientId(200).get(),
                        new ClientDao().clientByClientId(300).get()
                ))
                .price(42345.34).build();

        Tickets ticket2 = Tickets
                .builder().id(200).departureFrom("AMS")
                .destination("DTE").travelDate(localDateTime3)
                .clients(List.of(
                        new ClientDao().clientByClientId(100).get(),
                        new ClientDao().clientByClientId(200).get()
                ))
                .price(45673.34).build();

        Tickets ticket3 = Tickets
                .builder().id(300).departureFrom("MUM")
                .destination("ABU").travelDate(localDateTime2)
                .clients(List.of(
                        new ClientDao().clientByClientId(500).get()
                ))

                .price(570045.89).build();

        Tickets ticket4 = Tickets
                .builder().id(400).departureFrom("ABU")
                .destination("CHI").travelDate(localDateTime3)
                .clients(List.of(
                        new ClientDao().clientByClientId(100).get(),
                        new ClientDao().clientByClientId(300).get()
                ))
                .price(84356.12).build();

        return List.of(ticket1, ticket2, ticket3, ticket4);
    }

}
