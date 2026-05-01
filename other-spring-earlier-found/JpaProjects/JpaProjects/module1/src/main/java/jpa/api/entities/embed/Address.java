package jpa.api.entities.embed;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {

    private String address;

    private String city;

    private int zip;
}
