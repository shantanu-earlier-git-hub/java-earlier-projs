package app.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Cacheable
public class Car extends Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;





}
