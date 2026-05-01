package jpa.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "category")
public class JPACategory {

    @Id
    @TableGenerator(
            name = "seq_generator",
            pkColumnName = "key_name",
            pkColumnValue = "seq_name",
            valueColumnName = "key_value",
            allocationSize = 5,
            initialValue = 1
    )
    @GeneratedValue(strategy = GenerationType.TABLE , generator = "seq_generator")
    private Integer id;

    private String type;
}
