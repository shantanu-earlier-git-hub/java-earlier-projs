package bootjpa.practise1.entities.onetomany;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/***
 * Uni-direction Dealer -> vehicles relationship OneToMany
 *
 */


@Entity
@Table(name = "dealer")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Dealer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dealerName;

    private String location;


}
