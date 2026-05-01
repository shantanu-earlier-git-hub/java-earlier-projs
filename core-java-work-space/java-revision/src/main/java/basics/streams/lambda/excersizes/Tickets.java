package basics.streams.lambda.excersizes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tickets implements Comparable<Tickets> {

    private int id;
    private String departureFrom;
    private String destination;
    private LocalDateTime travelDate;
    private Double price;

    private List<Client> clients;

    @Override
    public int compareTo(Tickets tickets) {
        return (this.id - tickets.id);
    }
}
