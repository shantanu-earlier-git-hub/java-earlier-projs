package simple_entities.pk;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Embeddable
public class DepartmentPk implements Serializable {

    @Column(insertable = false, updatable = false)
    private String code;

    @Column(insertable = false, updatable = false)
    private Integer num;

}
