package app.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "person")
public class Person {

    @Id
    private Integer id;

    private String name;

}
