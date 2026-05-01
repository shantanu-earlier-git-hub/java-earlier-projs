package jpa.app.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Embedded
    @AssociationOverride(name = "stores",
               joinTable = @JoinTable(name = "stor_book" ,
                       joinColumns = @JoinColumn(name = "bk"),
                       inverseJoinColumns = @JoinColumn(name = "store")))
    private StoreDetails storeDetails;

}
