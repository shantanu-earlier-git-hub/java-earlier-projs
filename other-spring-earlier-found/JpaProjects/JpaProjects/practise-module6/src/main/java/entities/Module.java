package entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;


    @ManyToMany
    @JoinTable(name = "module_role" , joinColumns = @JoinColumn(name = "module") , inverseJoinColumns = @JoinColumn(name="role"))
    private List<Role> roles;

}
