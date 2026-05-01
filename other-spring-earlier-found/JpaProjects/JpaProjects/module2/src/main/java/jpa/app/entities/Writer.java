package jpa.app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@Entity
@NoArgsConstructor
public class Writer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id=0;

    private String name="";

    @OneToMany(mappedBy = "writer", cascade = CascadeType.PERSIST)
    private Collection<Documents> documents=null;

}
