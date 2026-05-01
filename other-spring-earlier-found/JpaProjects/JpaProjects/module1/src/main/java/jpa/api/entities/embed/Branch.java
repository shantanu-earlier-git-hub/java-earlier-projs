package jpa.api.entities.embed;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;



@Embeddable
@NoArgsConstructor
@Data
public class Branch {

    private String addr;

    private String city;

    private int pinCode;

}
