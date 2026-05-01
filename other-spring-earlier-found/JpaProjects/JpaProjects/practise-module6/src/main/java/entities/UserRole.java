package entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "user_role")
@Entity
public class UserRole {

    @Id
    private Integer user;

    private Integer role;

}
