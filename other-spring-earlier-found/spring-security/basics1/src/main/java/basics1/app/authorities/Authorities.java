package basics1.app.authorities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "authorities")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Authorities {

    @Id
    private Integer id;

    @Column(name = "authority")
    private String authority;
}
