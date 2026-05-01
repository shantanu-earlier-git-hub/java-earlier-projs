package bootjpa.practise1.entities.onetomany;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "vehicle")
@Data
@AllArgsConstructor
@ToString
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    private String model;

    @ManyToOne
    private Dealer dealer;

    public Vehicle() {
        this.dealer = new Dealer();
    }
}
