package simple_entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import simple_entities.embedded.Address;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Company {

    @Embedded
    @AttributeOverride(name = "addressCity", column = @Column(name = "city"))
    @AttributeOverride(name = "addressState", column = @Column(name = "state"))
    Address address;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;




}
