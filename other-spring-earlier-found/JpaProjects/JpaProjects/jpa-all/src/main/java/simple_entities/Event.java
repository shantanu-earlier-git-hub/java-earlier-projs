package simple_entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {

/*
    public Event () {
        this.id = UUID.randomUUID().toString();
    }
*/

    @Id
    @GenericGenerator(name = "generic_generator",
            strategy = "org.hibernate.id.UUIDHexGenerator"
//            strategy = "org.hibernate.id.UUIDGenerator",
            //parameters = {@Parameter(name = "separator" , value = "-")}
    )
    @GeneratedValue(generator = "generic_generator")

    private String id;

    @Column(name = "event_name")
    private String eventName;

}
