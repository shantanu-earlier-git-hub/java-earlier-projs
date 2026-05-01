package jpa_app.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "authorities")
public class Authorities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "module_id")
    private Integer moduleId;

    @Column(name = "role_id")
    private Integer roleId;

    private String authority;


}
