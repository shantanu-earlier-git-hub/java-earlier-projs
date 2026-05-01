package entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "user")
public class User extends  Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;


    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "user_role" , joinColumns = @JoinColumn(name = "user"),inverseJoinColumns = @JoinColumn(name = "role") )
    private List<Role> roles;

}
