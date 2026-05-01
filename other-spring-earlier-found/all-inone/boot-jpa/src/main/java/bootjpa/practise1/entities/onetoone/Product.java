package bootjpa.practise1.entities.onetoone;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/***
 * unidirectional product to product-info -> one to one
 * Product entity is owner hence cascade all will persist, merge, remove , fetch, refresh
 * referenced entity when product changes or requested.
 *
 */

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "info_id", referencedColumnName = "id", nullable = true)
    private ProductInfo productInfo = new ProductInfo();
}
