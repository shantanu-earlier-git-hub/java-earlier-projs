package entities.onetomany;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "vehicle")
@Data
@ToString
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String brand;

    // it is just custom column name
    @Column(name = "vehicle_model")
    private String model;

    /***
     * use ManyToOne at owner side which has foreign-key
     * and has multiple same values of related entity.
     * in this case Table Vehicle wll have
     *
     * id  name dealer_id
     * 1    n1  1
     * 2    n2  2
     * 3    n3  1
     */

    @ManyToOne
    // can define @JoinColumn in relation with other entity
    @JoinColumn(name = "vehicle_dealer")
    private Dealer dealer;

    public Vehicle() {
        this.dealer = new Dealer();
    }

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}
