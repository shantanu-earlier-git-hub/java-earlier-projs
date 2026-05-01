package jpa.api.entities;

import jakarta.persistence.*;
import jpa.api.entities.enums.Currency;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "price")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Double amount;

    //@Enumerated(value = EnumType.ORDINAL)
    @Enumerated(value = EnumType.STRING)
    private Currency currency;

}
