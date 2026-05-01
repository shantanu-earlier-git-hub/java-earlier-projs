package basics1.app.modules;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "role_modules")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleModules {

    @Id
    private Integer id;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "module_id")
    private Integer moduleId;

    @Column(name = "authority_id")
    private Integer authorityId;

}
