package jpa.api.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "people")
// for version 2.1 JPA
/*
@SecondaryTables( {@SecondaryTable(name = "home" , pkJoinColumns = @PrimaryKeyJoinColumn(name = "people_id")),
        @SecondaryTable(name = "people_details" , pkJoinColumns = @PrimaryKeyJoinColumn(name = "identity_id"))
})
*/

// for version jpa 2.2 onwards
@SecondaryTable(name = "home" , pkJoinColumns = @PrimaryKeyJoinColumn(name = "people_id"))
@SecondaryTable(name = "people_details" , pkJoinColumns = @PrimaryKeyJoinColumn(name = "identity_id"))
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String name;

    @Column(table = "home")
    private String street;

    @Column(table = "home")
    private String city;

    @Column(table = "people_details")
    private Integer height;

    @Column(table = "people_details")
    private String color;


}
