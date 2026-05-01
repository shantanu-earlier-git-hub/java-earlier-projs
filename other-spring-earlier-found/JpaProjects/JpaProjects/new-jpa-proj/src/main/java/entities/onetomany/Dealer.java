package entities.onetomany;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "dealer")
@Data
@NoArgsConstructor
@ToString
public class Dealer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dealerName;

    private String location;

    public Dealer(String dealerName, String location) {
        this.dealerName = dealerName;
        this.location = location;
    }
}
