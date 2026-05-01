package bootjpa.practise1.entities.onetoone;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class EmployeeDetails {

    private String title;

    private double salary;

}
