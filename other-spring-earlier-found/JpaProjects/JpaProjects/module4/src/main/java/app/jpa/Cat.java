package app.jpa;

import jakarta.persistence.Entity;
import lombok.Data;


@Entity
@Data
public class Cat extends Animal {

    private String color;


}
