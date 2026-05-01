package simple_entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import simple_entities.enums.Currency;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double amount;

    @Enumerated(value = EnumType.ORDINAL)
    //@Enumerated(value = EnumType.STRING)
    private Currency currency;

}
