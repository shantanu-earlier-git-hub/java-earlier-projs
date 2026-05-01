package simple_entities;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import simple_entities.pk.DepartmentPk;

@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
//@IdClass(DepartmentPk.class)
public class Department {

    @EmbeddedId
    @AttributeOverride(name = "num", column = @Column(name = "number"))
    DepartmentPk departmentPkId = new DepartmentPk();

    private String name;


}
