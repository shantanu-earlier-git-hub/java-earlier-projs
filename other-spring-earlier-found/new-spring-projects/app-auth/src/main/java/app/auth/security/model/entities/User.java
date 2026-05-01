package app.auth.security.model.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String username;

    String password;

    String email;

    String phone;

    Integer locked;

    Integer disabled;

    @OneToMany(fetch = FetchType.EAGER)
    List<Roles> roles;


}
