package jpa.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
public @Data class Product {

    @Id
    private Integer id;

    private String name;

    private Double price;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

}
