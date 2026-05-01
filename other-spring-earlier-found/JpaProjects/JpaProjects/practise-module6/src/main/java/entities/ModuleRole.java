package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Table(name = "module_role")
@Entity
public class ModuleRole {

    @Id
    private Integer module;

    private Integer role;

}
