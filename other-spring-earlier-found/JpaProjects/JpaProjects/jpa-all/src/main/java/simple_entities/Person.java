package simple_entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@SecondaryTable(name = "PersonDetails", pkJoinColumns = @PrimaryKeyJoinColumn(name = "person"))
@SecondaryTable(name = "Misc", pkJoinColumns = @PrimaryKeyJoinColumn(name = "person"))
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(table = "PersonDetails")
    private String email;

    @Column(table = "PersonDetails")
    private String phone;

    @Column(table = "Misc")
    private String details;

}
