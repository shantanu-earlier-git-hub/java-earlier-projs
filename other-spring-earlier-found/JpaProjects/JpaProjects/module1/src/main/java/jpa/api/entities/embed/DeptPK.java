package jpa.api.entities.embed;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class DeptPK implements Serializable {

    private Integer id;

    private String code;
}
