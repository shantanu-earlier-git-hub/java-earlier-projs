package basics1.app.users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_authorities")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAuthorities {


    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "authority_id")
    private Integer authorityId;

}
