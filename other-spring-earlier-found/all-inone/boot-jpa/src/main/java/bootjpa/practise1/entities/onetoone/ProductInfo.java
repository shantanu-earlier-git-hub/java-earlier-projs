package bootjpa.practise1.entities.onetoone;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double price;

    private String description;

}
