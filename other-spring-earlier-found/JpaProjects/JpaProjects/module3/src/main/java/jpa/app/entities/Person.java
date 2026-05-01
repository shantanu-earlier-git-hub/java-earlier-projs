package jpa.app.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Map;

@Entity
@Data
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    // when having number as string in phone table and person as
    // forgeign key ...
    // means a person has many phone numbers but in form of strings.

    /*@ElementCollection
    @CollectionTable(name = "phone" , joinColumns = @JoinColumn(name = "person"))
    @Column(name = "number")
    private List<String> phoneNumbers;
*/

    /*
        lets use map to specify the thype of the phone number hence
        table phone will have key= type and value= phonennumber
     */

    @ElementCollection
    @CollectionTable(name = "phones",joinColumns = @JoinColumn(name = "person"))
    @MapKeyColumn(name = "type")
    @Column(name = "number")
    private Map<String,String> phoneNumbers;

}
