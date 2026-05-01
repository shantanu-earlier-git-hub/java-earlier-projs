package app.auth.security.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Token  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String  username;

    String token;


}
