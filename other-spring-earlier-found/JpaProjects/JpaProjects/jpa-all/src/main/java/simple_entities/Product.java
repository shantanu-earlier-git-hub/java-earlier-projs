package simple_entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    /*

        @SequenceGenerator(
                name = "product_sequence",
                sequenceName = "product_sequence",
                initialValue = 1,
                allocationSize = 1
        )
    */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String name;

    private Double price;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

}
